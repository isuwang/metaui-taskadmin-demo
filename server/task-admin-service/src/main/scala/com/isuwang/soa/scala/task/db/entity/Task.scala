 package com.isuwang.soa.scala.task.db.entity 

 import java.sql.Timestamp 
 import com.isuwang.soa.scala.task.db.enum._ 
 import java.sql.Timestamp 
 import wangzx.scala_commons.sql.ResultSetMapper 

  case class Task ( 
 /**  */ 
id: Int,
 /** 父任务id */ 
parentTaskId: Option[Int],
 /** 任务编号 */ 
taskNo: String,
 /** 关联的公司id */ 
companyId: Option[Int],
 /** 任务主题 */ 
taskSubject: String,
 /** 状态,1:待处理(SUSPENDING);2:处理中(HANDLING);3:已处理(SOLVED);4:无需处理(NEEDLESS_TO_HANDLE); */ 
status: TaskStatus,
 /** 任务类型,1:待办事项(TODO);2:投诉(COMPLAINT);3:回访记录(REVIEW_RECORD); */ 
`type`: TaskType,
 /** 业务类型id */ 
businessTypeId: Int,
 /** 优先级,1:高(HIGH);2:中(MEDIUM);3:低(LOW) */ 
priority: TaskPriority,
 /** 计划日期 */ 
planAt: Option[Timestamp],
 /** 沟通姿势/方式,1:上门拜访(VISIT);2:电话(PHONE);3:微信(WECHAT);4:QQ(QQ);5:短信(SMS);6:其他(OTHER); */ 
communicationStyle: TaskCommunicationStyle,
 /** 经办人 */ 
handlerId: Option[Int],
 /** 计划或投诉问题 */ 
problemDesc: Option[String],
 /** 结果 */ 
resultDesc: Option[String],
 /**  */ 
createdAt: Timestamp,
 /**  */ 
createdBy: Option[Int],
 /**  */ 
updatedAt: Timestamp,
 /**  */ 
updatedBy: Option[Int],
 /** 经办人姓名（冗余字段，以方便查询） */ 
handlerName: Option[String],
) 	
 	
 object Task { 
 	implicit val resultSetMapper: ResultSetMapper[Task] = ResultSetMapper.material[Task]
 }
