 package com.isuwang.soa.scala.task.db.entity 

 import java.sql.Timestamp 
 import com.isuwang.soa.scala.task.db.enum._ 
 import java.sql.Timestamp 
 import wangzx.scala_commons.sql.ResultSetMapper 

  case class TaskLog ( 
 /**  */ 
id: Int,
 /** 任务id */ 
taskId: Int,
 /** 操作名 */ 
operation: String,
 /** 操作字段名 */ 
operField: Option[String],
 /** 原值 */ 
oldValue: Option[String],
 /** 新值 */ 
newValue: Option[String],
 /**  */ 
createdAt: Timestamp,
 /**  */ 
createdBy: Option[Int],
 /**  */ 
updatedAt: Timestamp,
 /**  */ 
updatedBy: Option[Int],
) 	
 	
 object TaskLog { 
 	implicit val resultSetMapper: ResultSetMapper[TaskLog] = ResultSetMapper.material[TaskLog]
 }
