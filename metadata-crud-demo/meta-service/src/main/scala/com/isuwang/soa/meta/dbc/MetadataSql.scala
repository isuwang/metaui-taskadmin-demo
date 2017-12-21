package com.isuwang.soa.meta.dbc

import javax.sql.DataSource

import com.isuwang.soa.meta.db.dbc.DbcResources

/**
  * Created by wahsonleung on 2017/7/26.
  */
object MetadataSql {
  implicit val datasource: DataSource = DbcResources.metadbDataSorce
}
