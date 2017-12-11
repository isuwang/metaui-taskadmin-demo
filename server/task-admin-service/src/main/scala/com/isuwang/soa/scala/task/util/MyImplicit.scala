package com.isuwang.soa.scala.task.util

import java.sql.Timestamp

import wangzx.scala_commons.sql.SQLWithArgs

/**
  * Created by WahsonLeung on 2017/11/22
  */
object MyImplicit extends scala.AnyRef {

  implicit def timestamp2Long(ts: Timestamp): Long = ts.getTime

  implicit class SQLOptional[T](value: Option[T]) {
    def optional(sql: => SQLWithArgs, default: => SQLWithArgs = SQLWithArgs("", Seq.empty)): SQLWithArgs =
      if (value.isDefined) sql else default
  }

  implicit class SQLOptional1(bool: Boolean) {
    def optional(sql: => SQLWithArgs, default: => SQLWithArgs = SQLWithArgs("", Seq.empty)): SQLWithArgs = {
      if(bool) sql else default
    }
  }
}
