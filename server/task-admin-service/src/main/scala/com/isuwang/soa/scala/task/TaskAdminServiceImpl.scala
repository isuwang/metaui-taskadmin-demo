package com.isuwang.soa.scala.task

import java.sql.Timestamp

import com.isuwang.dapeng.core.SoaException
import com.isuwang.dapeng.core.helper.SoaHeaderHelper
import com.isuwang.soa.admin.StaffServiceClient
import com.isuwang.soa.crm.company.CompanyService2Client
import com.isuwang.soa.scala.common.util.TPageResponse
import com.isuwang.soa.scala.task.domain._
import com.isuwang.soa.scala.task.service.TaskAdminService
import com.isuwang.soa.scala.task.db.TaskDb._
import wangzx.scala_commons.sql._
import com.isuwang.soa.scala.task.db.DBResource.dataSource
import com.isuwang.soa.scala.task.db.entity._
import com.isuwang.soa.scala.task.db.enum._
import com.isuwang.soa.scala.task.util.{EnumUtil, TimestampUtil}
import com.isuwang.soa.scala.task.util.MyImplicit._
import org.springframework.transaction.annotation.Transactional

/**
  * Created by WahsonLeung on 2017/11/14
  */
@Transactional(value = "taskdb", rollbackFor = Array(classOf[Exception]))
class TaskAdminServiceImpl extends TaskAdminService {

  private def getCount(status: Option[List[TaskStatus]] = None, taskType: Option[TaskType] = None, planBetween: Option[(Timestamp, Timestamp)] = None): TSumupTaskResult = {
    val operator = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0


    val sqlWhere = sql" WHERE handler_id = ${operator}" +
      status.optional(sql" AND status in " + status.get.map(_.id).mkString("(", ",", ")")) +
      taskType.optional(sql" AND type = ${taskType}") +
      planBetween.optional(sql" AND plan_at BETWEEN ${planBetween.get._1} AND ${planBetween.get._2}")

    val row = dataSource.row[Row](sql"SELECT count(DISTINCT company_id) AS company_count, count(*) AS task_count FROM task " + sqlWhere).get

    BeanBuilder.build[TSumupTaskResult](row)(
      "companyCount" -> row.getInt("company_count"),
      "taskCount" -> row.getInt("task_count")
    )
  }

  private def buildTTask(task: Task): TTask = {
    BeanBuilder.build[TTask](task)(
      "status" -> task.status.id,
      "type" -> task.`type`.id,
      "priority" -> task.priority.id,
      "communicationStyle" -> Some(task.communicationStyle.id),
      "companyName" -> task.companyId.map(id => new CompanyService2Client().findCompanyInfoById(id).company.name),
      "businessTypeName" -> queryBusinessTypeById(task.businessTypeId).typeName
    )
  }

  /**
    *
    **/
  override def findTasks(request: TTaskRequest): TTaskResponse = {

    val operator = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    val requiredPlanAt = request.planAtStart.isDefined || request.planAtEnd.isDefined

    lazy val planAtStart = new Timestamp(request.planAtStart.getOrElse(0L))
    lazy val planAtEnd = new Timestamp(request.planAtEnd.getOrElse(System.currentTimeMillis))

    val updateAtStart = new Timestamp(request.updateAtStart.getOrElse(0))
    val updateAtEnd = new Timestamp(request.updateAtEnd.getOrElse(System.currentTimeMillis))

    val statusIn = request.status.map { sta => if(sta == 12) List(TaskStatus.SUSPENDING.id, TaskStatus.HANDLING.id) else List(sta)}
      .map { staList => staList.mkString("(", ",", ")")}

    val sqlWhere = sql" WHERE 1=1" +
      sql" AND (created_by = ${operator} OR handler_id = ${operator})" +
      request.businessTypeId.optional(sql" AND business_type_id = ${request.businessTypeId}") +
      request.companyId.optional(sql" AND company_id = ${request.companyId}") +
      request.handlerId.optional(sql" AND handler_id = ${request.handlerId}") +
      statusIn.optional(sql" AND status in " + statusIn.get) +
      request.`type`.optional(sql" AND type = ${request.`type`}") +
      request.taskNo.optional(sql" AND task_no = ${request.taskNo}") +
      requiredPlanAt.optional(sql" AND plan_at BETWEEN ${planAtStart} AND ${planAtEnd}") +
      (sql" AND updated_at BETWEEN ${updateAtStart} AND ${updateAtEnd}")

    val sqlLimit = sql" limit ${request.pageRequest.start}, ${request.pageRequest.limit}"
    val sqlOrderBy = request.pageRequest.sortFields.optional(sql" order by ${request.pageRequest.sortFields}", sql" order by updated_at desc")

    val counts = dataSource.queryInt(sql" SELECT COUNT(*) FROM task " + sqlWhere)
    val result = dataSource.rows[Task](sql" SELECT * FROM task " + sqlWhere + sqlOrderBy + sqlLimit)

    val rows: List[TTask] = result.map(buildTTask(_))

    val sumupTotal = dataSource.rows[Row](
      sql"""
           SELECT
            count(DISTINCT company_id) AS company_count,
            count(*) AS task_count,
            max(DISTINCT plan_at) AS max_plan_at,
            min(DISTINCT plan_at) AS min_plan_at,
            max(DISTINCT updated_at) AS max_updated_at,
            min(DISTINCT updated_at) AS min_updated_at,
            task.type AS task_type
          FROM task """ + sqlWhere + sql" GROUP BY task.type"
    ).map { row =>

      // 可能存在数据库plan_at字段是空且刚好统计结果只有这一条的情况
      val minPlanAt = row.getTimestamp("min_plan_at")
      val maxPlanAt = row.getTimestamp("max_plan_at")

      val planAtFromTo = if (minPlanAt != null && maxPlanAt != null)
        s"${TimestampUtil.getDayOfYearStr(minPlanAt)}至${TimestampUtil.getDayOfYearStr(maxPlanAt)}"
      else ""

      BeanBuilder.build[TSumupTotal](row)(
        "companyCount" -> row.getInt("company_count"),
        "taskCount" -> row.getInt("task_count"),
        "taskType" -> row.getInt("task_type"),
        "taskTypeName" -> EnumUtil.getLabel(TaskType(row.getInt("task_type"))),
        "planAtFromTo" -> planAtFromTo,
        "updatedAtFromTo" ->
          s"${TimestampUtil.getDayOfYearStr(row.getTimestamp("min_updated_at"))}至${TimestampUtil.getDayOfYearStr(row.getTimestamp("max_updated_at"))}",
      )
    }

    TTaskResponse(

      pageResponse = TPageResponse(
        start = request.pageRequest.start,
        limit = request.pageRequest.limit,
        results = counts
      ),

      rows = rows,

      todayTodo = getCount(
        status = Some(List(TaskStatus.SUSPENDING, TaskStatus.HANDLING)),
        planBetween = Some(TimestampUtil.getStartOfCurrentDay(),TimestampUtil.getEndOfCurrentDay())
      ), // status = 1 plan_at == today

      expiredTodo = getCount(
        status = Some(List(TaskStatus.SUSPENDING, TaskStatus.HANDLING)),
        planBetween = Some(Tuple2(new Timestamp(0), TimestampUtil.getStartOfCurrentDay()))
      ), //  status = 1  plan_at < now

      unhandleComplaint = getCount(
        status = Some(List(TaskStatus.SUSPENDING)),
        taskType = Some(TaskType.COMPLAINT)
      ), // status = 1 task_type = 2

      handlingComplaint = getCount(
        status = Some(List(TaskStatus.HANDLING)),
        taskType = Some(TaskType.COMPLAINT)
      ), // status = 2 task_type = 2

      sumupTotal = sumupTotal
    )
  }

  /**
    *
    **/
  override def findTaskDetailById(id: Int): TTaskDetail = {

    val taskOpt: Option[Task] = dataSource.row[Task](sql" SELECT * FROM task WHERE id = ${id}")
    taskOpt match {
      case Some(task) => {

        val taskItems = queryTaskItemsExByTaskId(id).map { case (item, content) =>
          val suggestionContent = if(content != null) content else ""
          BeanBuilder.build[TTaskItem](item)("suggestionContent" -> suggestionContent)
        }

        val parent: Option[TTask] = task.parentTaskId.map(queryTaskById(_)).map(buildTTask(_))

        BeanBuilder.build[TTaskDetail](task)(
          "questions" -> taskItems.filter(_.suggestionType == SuggestionType.QUESTION.id),
          "improvements" -> taskItems.filter(_.suggestionType == SuggestionType.IMPROVEMENT.id),
          "taskLogs" -> queryTaskLogsByTaskId(id).map(log => BeanBuilder.build[TTaskLog](log)()).asInstanceOf[List[TTaskLog]],
          "taskAttachments" -> queryTaskAttachmentsByTaskId(id).map(attachment => BeanBuilder.build[TTaskAttachment](attachment)()).asInstanceOf[List[TTaskAttachment]],
          "taskRemarks" -> queryTaskRemarksByTaskId(id).map(remark => BeanBuilder.build[TTaskRemark](remark)()).asInstanceOf[List[TTaskRemark]],
          "children" -> queryTaskChildren(id).map(buildTTask(_)).asInstanceOf[List[TTask]],
          "parentTask" -> parent,
          "status" -> task.status.id,
          "type" -> task.`type`.id,
          "priority" -> task.priority.id,
          "communicationStyle" -> Some(task.communicationStyle.id),
          "companyName" -> task.companyId.map(id => new CompanyService2Client().findCompanyInfoById(id).company.name)
        )
      }
      case _ => throw new SoaException("", s"找不到工单记录 id=${id}")
    }
  }

  def generateTaskNo(): String = {
    val format = new java.text.SimpleDateFormat("yyyyMMddHHmmss")
    s"RW${format.format(System.currentTimeMillis)}"
  }

  /**
    *
    **/
  override def createTask(request: TCreateTaskRequest): Unit = {

    // check

    request.parentTaskId match {
      case Some(parentId) =>
        assert(queryTaskById(parentId).parentTaskId.isEmpty, "子工单不允许继续创建子工单")
        createTaskLog(new TCreateTaskLog(parentId, "创建子工单"))
      case None =>
    }


    // 没有隐式转换的痛
    val createBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    val handlerName = request.handlerId match {
      case Some(handlerId) => new StaffServiceClient().getById(handlerId).name
      case None => ""
    }

    val taskNo = generateTaskNo
    val sql =
      SQL"""
         INSERT INTO `task` SET
          parent_task_id = ${request.parentTaskId},
          task_no = ${taskNo},
          company_id = ${request.companyId},
          task_subject = ${request.taskSubject},
          status = ${request.status},
          type = ${request.`type`},
          business_type_id = ${request.businessTypeId},
          priority = ${request.priority},
          plan_at = ${request.planAt.map(time => new Timestamp(TimestampUtil.clearMillisecond(time)))},
          communication_style = ${request.communicationStyle},
          handler_id = ${request.handlerId},
          handler_name = ${handlerName},
          problem_desc = ${request.problemDesc},
          result_desc = ${request.resultDesc},
          created_by = ${createBy},
          updated_by = ${createBy}
       """

    val taskId = dataSource.generateKey[Int](sql)


    request.improvements match {
      case Some(improvements) => improvements.foreach(improvement => addTaskItems(taskId, improvement))
      case None =>
    }

    request.questions match {
      case Some(questions) => questions.foreach(question => addTaskItems(taskId, question))
      case None =>
    }

    request.remark match {
      case Some(rmk) =>
        addTaskRemark(TSaveTaskRemark(taskId = taskId, content = rmk))
      case None =>
    }

    createTaskLog(TCreateTaskLog(taskId = taskId, operation = "创建"))
  }

  private def taskItemNotEquals(left: List[TaskItem], right: List[TTaskItemRequest]):Boolean = {
    (left.length != right.length) || {
      left.sortBy(_.suggestionId)
        .map { rec => BeanBuilder.build[TTaskItemRequest](rec)() }
        .zip(right.sortBy(_.suggestionId))
        .exists(tuple => {
          println(tuple._1, tuple._2)
          tuple._1 != tuple._2
        })
    }
  }

  /**
    *
    **/
  override def updateTask(request: TUpdateTaskRequest): Unit = {
    val oldRecord = queryTaskById(request.taskId)

    // 记录比对，计算哪个字段发生变化

    val updateBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    val handlerName = request.handlerId match {
      case Some(handlerId) => new StaffServiceClient().getById(handlerId).name
      case None => ""
    }

    val sql =
      SQL"""
        UPDATE `task` SET
         company_id = ${request.companyId},
         task_subject = ${request.taskSubject},
         status = ${request.status},
         type = ${request.`type`},
         business_type_id = ${request.businessTypeId},
         priority = ${request.priority},
         plan_at = ${request.planAt.map(time => new Timestamp(TimestampUtil.clearMillisecond(time)))},
         communication_style = ${request.communicationStyle},
         handler_id = ${request.handlerId},
         handler_name = ${handlerName},
         problem_desc = ${request.problemDesc},
         result_desc = ${request.resultDesc},
         updated_by = ${updateBy},
         updated_at = now()
        WHERE id = ${request.taskId}
        """
    dataSource.executeUpdate(sql)

    val oldTaskItems: Map[Int, List[TaskItem]] = queryTaskItemsByTaskId(request.taskId).groupBy(_.suggestionType)

    val oldQuestions: List[TaskItem] = oldTaskItems.getOrElse(SuggestionType.QUESTION.id, List())
    val oldImprovements: List[TaskItem] = oldTaskItems.getOrElse(SuggestionType.IMPROVEMENT.id, List())

    if (request.questions.isDefined && taskItemNotEquals(oldQuestions, request.questions.get)) {
      deleteTaskItemsByTaskId(request.taskId, SuggestionType.QUESTION.id)
      val newIds = request.questions.get.map { q => addTaskItems(request.taskId, q) }
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("问题"),
          oldValue = Some(oldQuestions.map(_.suggestionId).mkString(",")),
          newValue = Some(newIds.mkString(","))
        )
      )
    }

    if(request.improvements.isDefined && taskItemNotEquals(oldImprovements, request.improvements.get)) {
      deleteTaskItemsByTaskId(request.taskId, SuggestionType.IMPROVEMENT.id)
      val newIds = request.improvements.get.map { q => addTaskItems(request.taskId, q) }
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("改进措施"),
          oldValue = Some(oldImprovements.map(_.suggestionId).mkString(",")),
          newValue = Some(newIds.mkString(","))
        )
      )
    }

    if (request.companyId != oldRecord.companyId) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("公司名"),
          oldValue = Some(oldRecord.companyId.getOrElse("").toString), // TODO 直接存公司名以便显示
          newValue = Some(request.companyId.getOrElse("").toString)
        )
      )
    }
    if (request.status != oldRecord.status.id) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("状态"),
          oldValue = Some(EnumUtil.getLabel(oldRecord.status)),
          newValue = Some(EnumUtil.getLabel(TaskStatus(request.status)))
        )
      )
    }
    if (request.taskSubject != oldRecord.taskSubject) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("主题"),
          oldValue = Some(oldRecord.taskSubject),
          newValue = Some(request.taskSubject)
        )
      )
    }
    if (request.`type` != oldRecord.`type`.id) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("工单类型"),
          oldValue = Some(EnumUtil.getLabel(oldRecord.`type`)),
          newValue = Some(EnumUtil.getLabel(TaskType(request.`type`)))
        )
      )
    }
    if (request.businessTypeId != oldRecord.businessTypeId) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("业务类型"),
          oldValue = Some(oldRecord.businessTypeId.toString), // TODO 保存业务类型名称
          newValue = Some(request.businessTypeId.toString)
        )
      )
    }
    if (request.priority != oldRecord.priority.id) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("优先级"),
          oldValue = Some(EnumUtil.getLabel(oldRecord.priority)),
          newValue = Some(EnumUtil.getLabel(TaskPriority(request.priority)))
        )
      )
    }
    val platAt_new = request.planAt.map(time => TimestampUtil.clearMillisecond(time))

    // Option[Long] compareTo Option[Long]
    if (platAt_new != oldRecord.planAt.map(_.getTime)) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("计划日期"),
          oldValue = Some(oldRecord.planAt.getOrElse("").toString),
          newValue = platAt_new.map {time => new Timestamp(time).toString}
        )
      )
    }
    if (!request.communicationStyle.contains(oldRecord.communicationStyle.id)) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("沟通方式"),
          oldValue = Some(EnumUtil.getLabel(oldRecord.communicationStyle)),
          newValue = Some(EnumUtil.getLabel(TaskCommunicationStyle(request.communicationStyle.getOrElse(-1))))
        )
      )
    }
    if (request.handlerId != oldRecord.handlerId) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("经办人"),
          oldValue = Some(oldRecord.handlerId.getOrElse("").toString), // TODO handlerId => handlerName
          newValue = Some(request.handlerId.getOrElse("").toString)
        )
      )
    }
    if (request.problemDesc != oldRecord.problemDesc) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("问题"),
          oldValue = oldRecord.problemDesc,
          newValue = request.problemDesc
        )
      )
    }
    if (request.resultDesc != oldRecord.resultDesc) {
      createTaskLog(
        TCreateTaskLog(
          taskId = oldRecord.id,
          operation = "修改",
          operField = Some("结果"),
          oldValue = oldRecord.resultDesc,
          newValue = request.resultDesc
        )
      )
    }

  }

  /**
    *
    **/
  override def unbindSubTask(subTaskId: Int): Unit = {
    val task = queryTaskById(subTaskId)
    assert(task.parentTaskId.isDefined, "解绑失败，因为没有绑定任何父工单")
    dataSource.executeUpdate(SQL"UPDATE `task` SET parent_task_id = null WHERE id = ${subTaskId}")
    createTaskLog(TCreateTaskLog(taskId = subTaskId, operation = "从父工单解绑"))
    createTaskLog(TCreateTaskLog(taskId = task.parentTaskId.get, operation = "子工单解绑"))
  }

  /**
    *
    **/
  override def createTaskRemark(request: TSaveTaskRemark): Unit = {
    addTaskRemark(request)
    createTaskLog(TCreateTaskLog(taskId = request.taskId, operation = "添加备注"))
  }

  /**
    *
    **/
  override def updateTaskRemark(request: TSaveTaskRemark): Unit = {
    // 没有隐式转换的痛
    val updateBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    lazy val updaterName = {
      val staff = new StaffServiceClient().getById(updateBy)
      assert(staff != null, s"找不到员工，id=${updateBy}")
      staff.name

    }

    val sql =
      SQL"""
        UPDATE `task_remark` SET
         task_id = ${request.taskId},
         content = ${request.content},
         updated_by = ${updateBy},
         updated_at = now(),
         updater_name = ${updaterName}
        WHERE id = ${request.id}
        """
    dataSource.executeUpdate(sql)

    createTaskLog(TCreateTaskLog(taskId = request.taskId, operation = "修改备注"))
  }

  /**
    *
    **/
  override def deleteTaskRemark(id: Int): Unit = {
    val taskRemark = queryTaskRemarkById(id)
    val result = dataSource.executeUpdate(SQL"DELETE FROM `task_remark` WHERE id = ${id}")
    if (result > 0) createTaskLog(TCreateTaskLog(taskId = taskRemark.taskId, operation = "删除备注"))
  }

  /**
    *
    **/
  override def createTaskLog(request: TCreateTaskLog): Unit = {
    val createBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    val sql =
      SQL"""
        INSERT INTO `task_log` SET
         task_id = ${request.taskId},
         operation = ${request.operation},
         oper_field = ${request.operField},
         old_value = ${request.oldValue},
         new_value = ${request.newValue},
         created_by = ${createBy},
         updated_by = ${createBy}
      """
    dataSource.executeUpdate(sql)
  }

  /**
    *
    **/
  override def createTaskAttachment(request: TCreateTaskAttachment): Int = {
    val createBy = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0

    val sql =
      SQL"""
        INSERT INTO `task_attachment` SET
          task_id = ${request.taskId},
          attachment_id = ${request.attachmentId},
          attachment_name = ${request.attachmentName},
          created_by = ${createBy},
          updated_by = ${createBy}
        """
    val id = dataSource.generateKey[Int](sql)
    createTaskLog(TCreateTaskLog(taskId = request.taskId, operation = "新增附件"))
    id
  }

  /**
    *
    **/
  override def deleteTaskAttachment(id: Int): Unit = {
    val taskAttachment = queryTaskAttachmentById(id)
    val result = dataSource.executeUpdate(SQL"DELETE FROM `task_attachment` WHERE id = ${id}")
    if (result > 0) createTaskLog(TCreateTaskLog(taskId = taskAttachment.taskId, operation = "删除附件"))
  }

  /**
    *
    **/
  override def findAllTaskNos4Picker(): List[TTaskPickerContainer] = {
    val operator = SoaHeaderHelper.getSoaHeader(true).getOperatorId.orElse(0) + 0
    dataSource.rows[Row](sql"SELECT * FROM task WHERE created_by = ${operator} OR handler_id = ${operator}")
      .map { row =>
        BeanBuilder.build[TTaskPickerContainer](row)(
          "id" -> row.getInt("id"),
          "label" -> row.getString("task_no")
        )
      }
  }
}
