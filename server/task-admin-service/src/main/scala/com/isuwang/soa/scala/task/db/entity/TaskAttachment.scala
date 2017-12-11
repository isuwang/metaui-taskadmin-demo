 package com.isuwang.soa.scala.task.db.entity 

 import java.sql.Timestamp 
 import com.isuwang.soa.scala.task.db.enum._ 
 import java.sql.Timestamp 
 import wangzx.scala_commons.sql.ResultSetMapper 

  case class TaskAttachment ( 
 /**  */ 
id: Int,
 /** 任务id */ 
taskId: Int,
 /** 附件id(阿里云文件id) */ 
attachmentId: String,
 /** 附件文件名 */ 
attachmentName: String,
 /**  */ 
createdAt: Timestamp,
 /**  */ 
createdBy: Option[Int],
 /**  */ 
updatedAt: Timestamp,
 /**  */ 
updatedBy: Option[Int],
) 	
 	
 object TaskAttachment { 
 	implicit val resultSetMapper: ResultSetMapper[TaskAttachment] = ResultSetMapper.material[TaskAttachment]
 }
