package com.isuwang.soa.scala.task.util

import java.sql.Timestamp
import java.util.Calendar

/**
  * Created by WahsonLeung on 2017/11/21
  */
object TimestampUtil {
  def getStartOfCurrentDay(): Timestamp = {
    val now = Calendar.getInstance()
    now.set(Calendar.HOUR_OF_DAY, 0)
    now.set(Calendar.MINUTE, 0)
    now.set(Calendar.SECOND, 0)
    now.set(Calendar.MILLISECOND, 0)
    new Timestamp(now.getTimeInMillis)
  }

  def getEndOfCurrentDay():Timestamp = {
    val now = Calendar.getInstance()
    now.set(Calendar.HOUR_OF_DAY, 23)
    now.set(Calendar.MINUTE, 59)
    now.set(Calendar.SECOND, 59)
    now.set(Calendar.MILLISECOND, 999)
    new Timestamp(now.getTimeInMillis)
  }


  def clearMillisecond(timestamp: Long): Long = timestamp / 1000 * 1000

  /**
    *
    * @param timestamp
    * @return  str yyyy-MM-dd
    */
  def getDayOfYearStr(timestamp:Timestamp):String = timestamp.toString.substring(0, 10)
}
