 package com.isuwang.soa.scala.task.db.entity 

 import java.sql.Timestamp 
 import com.isuwang.soa.scala.task.db.enum._ 
 import java.sql.Timestamp 
 import wangzx.scala_commons.sql.ResultSetMapper 

  case class TaskRemark ( 
 /**  */ 
id: Int,
 /** 任务id */ 
taskId: Int,
 /** 备注内容 */ 
content: String,
 /**  */ 
createdAt: Timestamp,
 /**  */ 
createdBy: Option[Int],
 /**  */ 
updatedAt: Timestamp,
 /**  */ 
updatedBy: Option[Int],
 /** 更新人姓名 */ 
updaterName: Option[String],
) 	
 	
 object TaskRemark { 
 	implicit val resultSetMapper: ResultSetMapper[TaskRemark] = ResultSetMapper.material[TaskRemark]
 }
