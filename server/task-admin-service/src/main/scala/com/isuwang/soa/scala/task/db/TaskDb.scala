package com.isuwang.soa.scala.task.db

import java.sql.Timestamp

import com.isuwang.dapeng.core.helper.SoaHeaderHelper
import com.isuwang.soa.admin.StaffServiceClient
import com.isuwang.soa.scala.task.domain.{TSaveTaskRemark, TTaskItemRequest}
import wangzx.scala_commons.sql._
import com.isuwang.soa.scala.task.db.DBResource.dataSource
import com.isuwang.soa.scala.task.db.entity._

object TaskDb {

  def queryTaskItemsByTaskId(taskId: Int): List[TaskItem] = {
    dataSource.rows[TaskItem](SQL" SELECT * FROM `task_item` WHERE task_id = ${taskId}")
  }

  def queryTaskItemsByTaskIds(taskIds: List[Int]): List[TaskItem] = {
    if (taskIds.length == 0) List()
    else dataSource.rows[TaskItem](sql" SELECT * FROM `task_item` WHERE task_id in " + taskIds.mkString("(", ",", ")"))
  }

  def queryTaskItemsExByTaskId(taskId: Int): List[(TaskItem, String)] = {
    dataSource.rows[Row](
      sql"""
             SELECT
                ti.id,
                ti.task_id,
                ti.suggestion_id,
                ti.suggestion_type,
                ti.suggestion_remark,
                s.content AS suggestion_content
              FROM task_item ti
              LEFT JOIN suggestion s
                on ti.suggestion_id = s.id
              WHERE ti.task_id = ${taskId}
        """
    ).map {
      row =>
        val mapper = implicitly[ResultSetMapper[TaskItem]]
        (mapper.from(row), row.getString("suggestion_content"))
    }
  }

  def queryTaskItemsExByTaskIds(taskIds: List[Int]): List[(TaskItem, String)] = {
    if (taskIds.length == 0) List()
    else dataSource.rows[Row](
      sql"""
             SELECT
                ti.id,
                ti.task_id,
                ti.suggestion_id,
                ti.suggestion_type,
                ti.suggestion_remark,
                s.content AS suggestion_content
              FROM task_item ti
              LEFT JOIN suggestion s
                on ti.suggestion_id = s.id
              WHERE ti.task_id in """ + taskIds.mkString("(", ",", ")")
    ).map {
      row =>
        val mapper = implicitly[ResultSetMapper[TaskItem]]
        (mapper.from(row), row.getString("suggestion_content"))
    }
  }

  def queryTaskLogsByTaskId(taskId: Int): List[TaskLog] = {
    dataSource.rows[TaskLog](SQL" SELECT * FROM `task_log` WHERE task_id = ${taskId} ORDER BY updated_at DESC")
  }

  def queryTaskLogsByTaskIds(taskIds: List[Int]): List[TaskLog] = {
    if (taskIds.length == 0) List()
    else dataSource.rows[TaskLog](sql" SELECT * FROM `task_log` WHERE task_id in " + taskIds.mkString("(", ",", ")"))
  }

  def queryTaskAttachmentsByTaskId(taskId: Int): List[TaskAttachment] = {
    dataSource.rows[TaskAttachment](SQL" SELECT * FROM `task_attachment` WHERE task_id = ${taskId}")
  }

  def queryTaskAttachmentsByTaskIds(taskIds: List[Int]): List[TaskAttachment] = {
    if (taskIds.length == 0) List()
    else dataSource.rows[TaskAttachment](sql" SELECT * FROM `task_attachment` WHERE task_id in " + taskIds.mkString("(", ",", ")"))
  }


  def queryTaskRemarksByTaskId(taskId: Int): List[TaskRemark] = {
    dataSource.rows[TaskRemark](SQL" SELECT * FROM `task_remark` WHERE task_id = ${taskId}")
  }

  def queryTaskRemarksByTaskIds(taskIds: List[Int]): List[TaskRemark] = {
    if (taskIds.length == 0) List()
    else dataSource.rows[TaskRemark](sql" SELECT * FROM `task_remark` WHERE task_id in" + taskIds.mkString("(", ",", ")"))
  }

  def queryTaskChildren(taskId: Int):List[Task] = {
    dataSource.rows[Task](sql" SELECT * FROM task WHERE parent_task_id = ${taskId}")
  }

  def addTaskItems(taskId: Int, taskItem: TTaskItemRequest): Int = {
    val sql =
      SQL"""
        INSERT INTO `task_item` SET
          task_id = ${taskId},
          suggestion_id = ${taskItem.suggestionId},
          suggestion_type = ${taskItem.suggestionType},
          suggestion_remark = ${taskItem.suggestionRemark}
        """
    dataSource.generateKey[Int](sql)
  }

  def deleteTaskItemsByTaskId(taskId: Int, suggestionType: Int): Unit = {
    dataSource.executeUpdate(SQL"DELETE FROM `task_item` WHERE task_id = ${taskId} AND suggestion_type = ${suggestionType}")
  }

  def addTaskRemark(request: TSaveTaskRemark): Unit = {
    val createBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    lazy val updaterName = {
      val staff = new StaffServiceClient().getById(createBy)
      assert(staff != null, s"找不到员工，id=${createBy}")
      staff.name

    }
    val sql =
      SQL"""
        INSERT INTO `task_remark` SET
          task_id = ${request.taskId},
          content = ${request.content},
          created_by = ${createBy},
          updated_by = ${createBy},
          updater_name = ${updaterName}
        """
    dataSource.executeUpdate(sql)
  }

  def queryTaskById(id: Int): Task = {
    val recordOpt = dataSource.row[Task](SQL" SELECT * FROM `task` WHERE id = ${id}")
    assert(recordOpt.isDefined, "找不到任务记录")
    recordOpt.get
  }

  def queryTaskRemarkById(id: Int): TaskRemark = {
    val recordOpt = dataSource.row[TaskRemark](SQL" SELECT * FROM `task_remark` WHERE id = ${id}")
    assert(recordOpt.isDefined, "找不到任务备注记录")
    recordOpt.get
  }

  def queryTaskAttachmentById(id: Int): TaskAttachment = {
    val recordOpt = dataSource.row[TaskAttachment](SQL" SELECT * FROM `task_attachment` WHERE id = ${id}")
    assert(recordOpt.isDefined, "找不到任务备注记录")
    recordOpt.get
  }

  def queryBusinessTypeById(id: Int): BusinessType = {
    val recordOpt = dataSource.row[BusinessType](SQL" SELECT * FROM business_type WHERE id = ${id}")
    assert(recordOpt.isDefined, s"找不到业务类型记录 id=${id}")
    recordOpt.get
  }

}
