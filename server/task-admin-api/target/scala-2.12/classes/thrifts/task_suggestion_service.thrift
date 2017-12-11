include "task_domain.thrift"

namespace java com.isuwang.soa.task.service

service TaskSuggestionService {
    task_domain.TSuggestionResponse findSuggestions(task_domain.TSuggestionRequest request)
    (m.form.url="/task/taskadmin/findSuggestions.do")

    void createSuggestion(task_domain.TSaveSuggestion request)
    (m.form.url="/task/taskadmin/createSuggestion.do",m.type="domain-action",m.id="suggestion_add",
             m.name="新增意见标准", m.operType="2", m.form.title="新增意见标准")

    void updateSuggestion(task_domain.TSaveSuggestion request)
    (m.form.url="/task/taskadmin/updateSuggestion.do",m.type="entity-action",m.id="suggestion_edit",
         m.name="编辑", m.operType="2", m.form.title="编辑意见标准")

    void deleteSuggestion(i32 id)
    (m.form.url="/task/taskadmin/deleteSuggestion.do",m.type="entity-action",m.id="suggestion_delete",
     m.name="删除", m.operType="1", m.form.title="删除",m.form.confirm="确定删除",m.form.sendAsSearchParams = "true")

    list<task_domain.TSuggestion4Picker> findAllSuggestions4PickerByType(i32 type)
}