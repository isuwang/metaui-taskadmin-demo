package com.isuwang.soa.meta.dbc.action

import javax.sql.DataSource

import com.isuwang.commons.Action
import com.isuwang.soa.meta.domain.{TFieldMeta, TFieldMetaRequest, TFieldMetaResponse}
import com.isuwang.commons.converters.Implicits._
import com.isuwang.soa.common.util.TPageResponse
import com.isuwang.soa.meta.dbc.MetadataSql.datasource
import com.isuwang.soa.meta.dbc.domain.Fields
import wangzx.scala_commons.sql._
import com.isuwang.commons.converters.SqlImplicits._
import com.isuwang.soa.meta.db.dbc.DbcResources
import com.isuwang.soa.meta.dbc.MetadataSql

import collection.JavaConversions._

/**
  * Created by WahsonLeung on 2017/11/3
  */
class QueryFieldMetas(request: TFieldMetaRequest) extends Action[TFieldMetaResponse] {

  implicit val datasource: DataSource = DbcResources.metadbDataSorce

  override def preCheck: Unit = {}

  override def action: TFieldMetaResponse = {
    val result = new TFieldMetaResponse
    val counts = getCount(countSql)

    val resultRows = rows[Fields](sql).map(row => {
      val fieldMeta = row.convertTo[TFieldMeta]
      fieldMeta.isRequired = row.required == 1
      fieldMeta
    })

    result.rows = resultRows
    val pageResponse = new TPageResponse
    pageResponse.limit(request.pageRequest.limit)
      .start(request.pageRequest.start)
      .results(counts)

    result.pageResponse = pageResponse
    result
  }


  val whereSql = sql" WHERE `struct_name` LIKE " + s"'%${request.structName.orElse("")}%'" +
    sql" AND `name` LIKE " + s"'%${request.name.orElse("")}%'"

  val countSql = sql" SELECT count(*) FROM fields" + whereSql

  val limitSql = sql" limit ${request.pageRequest.start}, ${request.pageRequest.limit}"

  val sql = sql"SELECT * FROM `fields`" + whereSql + limitSql
}
