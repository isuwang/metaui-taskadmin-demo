package com.isuwang.soa.scala.task.db

import javax.annotation.Resource
import javax.sql.DataSource

import org.springframework.context.annotation.Bean

import scala.annotation.meta.{beanSetter, field}
import scala.beans.BeanProperty

/**
  * Created by WahsonLeung on 2017/11/17
  */
object DBResource {
  def getInstance: DBResource.type = this

  @BeanProperty
  @(Resource @field @beanSetter)(name = "task_dataSource")
  var dataSource: DataSource = _

//  var jedisPool: JedisPool = _

}
