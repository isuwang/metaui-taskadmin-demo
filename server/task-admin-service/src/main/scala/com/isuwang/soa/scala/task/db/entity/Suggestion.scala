 package com.isuwang.soa.scala.task.db.entity 

 import java.sql.Timestamp 
 import com.isuwang.soa.scala.task.db.enum._ 
 import java.sql.Timestamp 
 import wangzx.scala_commons.sql.ResultSetMapper 

  case class Suggestion ( 
 /**  */ 
id: Int,
 /** 意见类型,1:问题(QUESTION);2:改进(IMPROVEMENT) */ 
`type`: SuggestionType,
 /** 内容 */ 
content: String,
 /** 标签， 多个标签逗号分隔 */ 
labels: Option[String],
 /** 帮助 */ 
assistance: Option[String],
 /**  */ 
createdAt: Timestamp,
 /**  */ 
createdBy: Option[Int],
 /**  */ 
updatedAt: Timestamp,
 /**  */ 
updatedBy: Option[Int],
) 	
 	
 object Suggestion { 
 	implicit val resultSetMapper: ResultSetMapper[Suggestion] = ResultSetMapper.material[Suggestion]
 }
