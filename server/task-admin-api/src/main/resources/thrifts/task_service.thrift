include "task_domain.thrift"

namespace java com.isuwang.soa.task.service

service TaskAdminService {

    task_domain.TTaskResponse findTasks(task_domain.TTaskRequest request)
    (m.form.url="/task/taskadmin/findTasks.do")

    task_domain.TTaskDetail findTaskDetailById(i32 taskId(m.srcKey="id"))

    void createTask(task_domain.TCreateTaskRequest request)
    (m.form.url="/task/taskadmin/createTask.do",m.type="domain-action",m.id="task_add",
         m.name="新增工单", m.operType="2", m.form.title="新增工单")

    void updateTask(task_domain.TUpdateTaskRequest request)
    (m.form.url="/task/taskadmin/updateTask.do",m.type="entity-action",m.id="task_update",
     m.name="编辑", m.operType="2", m.form.title="编辑工单")

    void unbindSubTask(i32 subTaskId)

    void createTaskRemark(task_domain.TSaveTaskRemark request)

    void updateTaskRemark(task_domain.TSaveTaskRemark request)

    void deleteTaskRemark(i32 id)

    void createTaskLog(task_domain.TCreateTaskLog request)


    i32 createTaskAttachment(task_domain.TCreateTaskAttachment request)

    void deleteTaskAttachment(i32 id)

    list<task_domain.TTaskPickerContainer> findAllTaskNos4Picker()

}