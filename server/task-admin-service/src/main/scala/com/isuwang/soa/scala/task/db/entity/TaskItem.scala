 package com.isuwang.soa.scala.task.db.entity 

 import java.sql.Timestamp 
 import com.isuwang.soa.scala.task.db.enum._ 
 import wangzx.scala_commons.sql.ResultSetMapper 

  case class TaskItem ( 
 /**  */ 
id: Int,
 /** 任务id */ 
taskId: Int,
 /** 意见id */ 
suggestionId: Int,
 /** 意见类型，1: 问题, 2: 改进（冗余字段，为了方便查询区分问题的类型） */ 
suggestionType: Int,
 /** 意见备注 */ 
suggestionRemark: Option[String],
) 	
 	
 object TaskItem { 
 	implicit val resultSetMapper: ResultSetMapper[TaskItem] = ResultSetMapper.material[TaskItem]
 }
