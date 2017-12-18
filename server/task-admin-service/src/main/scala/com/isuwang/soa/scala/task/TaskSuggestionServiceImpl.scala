package com.isuwang.soa.scala.task

import java.sql.Timestamp

import com.isuwang.soa.scala.task.db.DBResource.dataSource
import com.isuwang.dapeng.core.helper.SoaHeaderHelper
import com.isuwang.soa.admin.StaffServiceClient
import com.isuwang.soa.scala.common.util.TPageResponse
import com.isuwang.soa.scala.task.db.entity.Suggestion
import com.isuwang.soa.scala.task.db.enum.SuggestionType
import com.isuwang.soa.scala.task.domain._
import com.isuwang.soa.scala.task.service.TaskSuggestionService
import com.isuwang.soa.scala.task.util.EnumUtil
import wangzx.scala_commons.sql._
import com.isuwang.soa.scala.task.util.MyImplicit._

/**
  * Created by WahsonLeung on 2017/11/15
  */
class TaskSuggestionServiceImpl extends TaskSuggestionService{
  /**
    *
    **/
  override def findSuggestions(request: TSuggestionRequest): TSuggestionResponse = {

    val updateAtStart = new Timestamp(request.updateAtStart.getOrElse(0))
    val updateAtEnd = new Timestamp(request.updateAtEnd.getOrElse(System.currentTimeMillis()))

    // Watch out: None.get will happen on request.labels if remove "lazy".
    lazy val labelSql = request.labels.get.split(",").map(part => s"labels LIKE '%${part.trim()}%'").mkString("("," OR ",")")
    val sqlWhere = sql" WHERE 1=1" +
      request.`type`.optional(sql" AND `type`= ${request.`type`.get}") +
      (sql" AND updated_at BETWEEN ${updateAtStart} AND ${updateAtEnd}") +
      request.labels.optional(sql" AND " + labelSql)

    val sqlLimit = sql" limit ${request.pageRequest.start}, ${request.pageRequest.limit}"

    val counts = dataSource.queryInt(sql" SELECT COUNT(*) FROM `suggestion` " + sqlWhere)
    val result = dataSource.rows[Suggestion](sql" SELECT * FROM `suggestion` " + sqlWhere + sqlLimit)

    val rows: List[TSuggestion] = result.map { db =>
      BeanBuilder.build[TSuggestion](db)(
        "type" -> db.`type`.id,
        "updater" -> db.updatedBy.map{ id => new StaffServiceClient().getById(id).name },
      )
    }

    TSuggestionResponse(
      pageResponse = TPageResponse(
        start = request.pageRequest.start,
        limit = request.pageRequest.limit,
        results = counts
      ),
      rows = rows
    )
  }

  /**
    *
    **/
  override def createSuggestion(request: TSaveSuggestion): Unit = {
    val createBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    val sql =
      SQL"""
        INSERT INTO `suggestion` SET
          `type` = ${request.`type`},
          content = ${request.content},
          labels = ${request.labels},
          assistance = ${request.assistance},
          created_by = ${createBy},
          updated_by = ${createBy}
        """
    dataSource.executeUpdate(sql)
  }

  /**
    *
    **/
  override def updateSuggestion(request: TSaveSuggestion): Unit = {
    val updateBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0
    assert(request.id.isDefined, "无法找到要更新的记录，id是空")

    val sql =
      SQL"""
        UPDATE suggestion SET
          type = ${request.`type`},
          content = ${request.content},
          labels = ${request.labels},
          assistance = ${request.assistance},
          updated_by = ${updateBy},
          updated_at = now()
        WHERE id = ${request.id}
       """
    dataSource.executeUpdate(sql)
  }

  /**
    *
    **/
  override def deleteSuggestion(id: Int): Unit = {
    val operator = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0
    dataSource.executeUpdate(SQL"DELETE FROM `suggestion` WHERE id = ${id} AND created_by = ${operator}")
  }

  /**
    *
    **/
  override def findAllSuggestions4PickerByType(`type`: Int): List[TSuggestion4Picker] = {
    dataSource.rows[Suggestion](sql"SELECT * FROM suggestion WHERE type = ${`type`}")
      .map { row =>
        val suggestionType = row.`type`.id
        BeanBuilder.build[TSuggestion4Picker](row)(
          "suggestionId" -> row.id,
          "suggestionContent" -> row.content,
          "suggestionType" -> suggestionType,
          "suggestionTypeName" -> EnumUtil.getLabel(SuggestionType(suggestionType))
        )
      }
  }
}
