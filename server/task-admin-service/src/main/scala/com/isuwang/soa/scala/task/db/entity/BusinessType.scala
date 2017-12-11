 package com.isuwang.soa.scala.task.db.entity 

 import java.sql.Timestamp 
 import com.isuwang.soa.scala.task.db.enum._ 
 import java.sql.Timestamp 
 import wangzx.scala_commons.sql.ResultSetMapper 

  case class BusinessType ( 
 /**  */ 
id: Int,
 /** 业务类型 */ 
typeName: String,
 /** 指导意见 */ 
suggestionContent: Option[String],
 /** 问题， 逗号分隔的suggestions id */ 
questions: Option[String],
 /** 改进措施， 逗号分隔的suggestions id */ 
improvements: Option[String],
 /**  */ 
createdAt: Timestamp,
 /**  */ 
createdBy: Option[Int],
 /**  */ 
updatedAt: Timestamp,
 /**  */ 
updatedBy: Option[Int],
) 	
 	
 object BusinessType { 
 	implicit val resultSetMapper: ResultSetMapper[BusinessType] = ResultSetMapper.material[BusinessType]
 }
