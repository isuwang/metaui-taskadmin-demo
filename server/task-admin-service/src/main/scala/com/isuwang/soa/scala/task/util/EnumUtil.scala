package com.isuwang.soa.scala.task.util

import com.isuwang.soa.scala.task.db.enum._
import wangzx.scala_commons.sql.DbEnum

/**
  * Created by WahsonLeung on 2017/11/21
  */
object EnumUtil {
  lazy val dictionary: Map[DbEnum, String] = Map(
    TaskStatus.SUSPENDING -> "待处理",
    TaskStatus.HANDLING -> "处理中",
    TaskStatus.SOLVED -> "已处理",
    TaskStatus.NEEDLESS_TO_HANDLE -> "无需处理",

    TaskPriority.HIGH -> "高",
    TaskPriority.MEDIUM -> "中",
    TaskPriority.LOW -> "低",

    TaskType.TODO -> "待办事项",
    TaskType.COMPLAINT -> "投诉",
    TaskType.REVIEW_RECORD -> "回访记录",

    TaskCommunicationStyle.VISIT -> "上门拜访",
    TaskCommunicationStyle.PHONE -> "电话",
    TaskCommunicationStyle.WECHAT -> "微信",
    TaskCommunicationStyle.QQ -> "QQ",
    TaskCommunicationStyle.SMS -> "短信",
    TaskCommunicationStyle.OTHER -> "其他",

    SuggestionType.QUESTION -> "问题",
    SuggestionType.IMPROVEMENT -> "改进"
  )

  def getLabel[T <: DbEnum](key: T, defVal: String = ""): String = dictionary.getOrElse(key, defVal)
}
