package com.isuwang.soa.scala.task

import java.sql.Timestamp

import com.isuwang.dapeng.core.helper.SoaHeaderHelper
import com.isuwang.soa.admin.StaffServiceClient
import com.isuwang.soa.scala.common.util.TPageResponse
import com.isuwang.soa.scala.task.db.DBResource.dataSource
import com.isuwang.soa.scala.task.db.entity.{BusinessType, Suggestion}
import com.isuwang.soa.scala.task.domain._
import com.isuwang.soa.scala.task.service.TaskBusinessTypeService
import wangzx.scala_commons.sql._
import com.isuwang.soa.scala.task.util.MyImplicit._

/**
  * Created by WahsonLeung on 2017/11/15
  */
class TaskBusinessTypeServiceImpl extends TaskBusinessTypeService {
  /**
    *
    **/
  override def findBusinessTypes(request: TBusinessTypeRequest): TBusinessTypeResponse = {

    val updateAtStart = new Timestamp(request.updateAtStart.getOrElse(0))
    val updateAtEnd = new Timestamp(request.updateAtEnd.getOrElse(System.currentTimeMillis))

    val sqlWhere = sql" WHERE 1=1" +
      request.businessTypeId.optional(sql" AND id= ${request.businessTypeId}") +
      (sql" AND updated_at BETWEEN ${updateAtStart} AND ${updateAtEnd}")

    val sqlLimit = sql" limit ${request.pageRequest.start}, ${request.pageRequest.limit}"

    val counts = dataSource.queryInt(sql" SELECT COUNT(*) FROM `business_type` " + sqlWhere)
    val result = dataSource.rows[BusinessType](sql" SELECT * FROM `business_type` " + sqlWhere + sqlLimit)

    val suggestions: Map[Int, Suggestion] = dataSource.rows[Suggestion](sql"SELECT * FROM suggestion").map(row => row.id -> row).toMap

    val rows: List[TBusinessType] = result.map { db =>
      BeanBuilder.build[TBusinessType](db)(
        "questions2Str" -> db.questions.map { _.split(",").map(que => getSuggestion(suggestions, que.toInt)).mkString(",") },
        "improvements2Str" -> db.improvements.map { _.split(",").map(que => getSuggestion(suggestions, que.toInt)).mkString(",") },
        "creator" -> db.createdBy.map{ id => new StaffServiceClient().getById(id).name },
        "updater" -> db.updatedBy.map{ id => new StaffServiceClient().getById(id).name },
      )
    }

    TBusinessTypeResponse(
      pageResponse = TPageResponse(
        start = request.pageRequest.start,
        limit = request.pageRequest.limit,
        results = counts
      ),
      rows = rows
    )
  }

  private def getSuggestion(suggestions:Map[Int, Suggestion], key: Int): String = {
    suggestions.get(key) match {
      case Some(suggestion) => suggestion.content
      case _ => ""
    }

    if(suggestions.contains(key)) suggestions.get(key).get.content else ""
  }

  /**
    *
    **/
  override def createBusinessType(request: TSaveBusinessType): Unit = {
    val createBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    val sql =
      SQL"""
        INSERT INTO `business_type` SET
          type_name = ${request.typeName},
          suggestion_content = ${request.suggestionContent},
          questions = ${request.questions},
          improvements = ${request.improvements},
          created_by = ${createBy},
          updated_by = ${createBy}
        """
    dataSource.executeUpdate(sql)
  }

  /**
    *
    **/
  override def updateBusinessType(request: TSaveBusinessType): Unit = {
    val updateBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0
    assert(request.id.isDefined, "无法找到要更新的记录，id是空")

    val sql =
      SQL"""
        UPDATE `business_type` SET
          type_name = ${request.typeName},
          suggestion_content = ${request.suggestionContent},
          questions = ${request.questions},
          improvements = ${request.improvements},
          updated_by = ${updateBy},
          updated_at = now()
        WHERE id = ${request.id}
        """

    dataSource.executeUpdate(sql)
  }

  /**
    *
    **/
  override def deleteBusinessType(id: Int): Unit = {
    val operator = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0
    dataSource.executeUpdate(SQL"DELETE FROM `business_type` WHERE id = ${id} AND created_by = ${operator}")
  }

  /**
    *
    **/
  override def findAllBusinessTypes4Picker(): List[TTaskPickerContainer] = {
    dataSource.rows[Row](sql"SELECT * FROM business_type")
      .map { row =>
        BeanBuilder.build[TTaskPickerContainer](row)(
          "id" -> row.getInt("id"),
          "label" -> row.getString("type_name")
        )
      }
  }
}
