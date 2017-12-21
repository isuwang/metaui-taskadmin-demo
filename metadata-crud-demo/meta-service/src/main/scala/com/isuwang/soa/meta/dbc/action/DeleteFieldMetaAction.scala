package com.isuwang.soa.meta.dbc.action

import com.isuwang.commons.Action
import wangzx.scala_commons.sql._
import com.isuwang.commons.converters.SqlImplicits._
import com.isuwang.soa.meta.dbc.MetadataSql.datasource
/**
  * Created by WahsonLeung on 2017/12/13
  */
class DeleteFieldMetaAction(id: Int) extends Action[Unit]{
  override def preCheck: Unit = {

  }

  override def action: Unit = {
    esql(sql"DELETE FROM fields WHERE id = ${id}")
  }
}
