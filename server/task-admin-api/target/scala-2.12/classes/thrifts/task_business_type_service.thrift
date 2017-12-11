include "task_domain.thrift"

namespace java com.isuwang.soa.task.service

service TaskBusinessTypeService {

    task_domain.TBusinessTypeResponse findBusinessTypes(task_domain.TBusinessTypeRequest request)
    (m.form.url="/task/taskadmin/findBusinessTypes.do")

    void createBusinessType(task_domain.TSaveBusinessType request)
    (m.form.url="/task/taskadmin/createBusinessType.do",m.type="domain-action",m.id="business_add",
                 m.name="新增业务类型", m.operType="2", m.form.title="新增业务类型")

    void updateBusinessType(task_domain.TSaveBusinessType request)
        (m.form.url="/task/taskadmin/updateBusinessType.do",m.type="entity-action",m.id="business_edit",
                 m.name="编辑", m.operType="2", m.form.title="编辑业务类型")


    void deleteBusinessType(i32 id)
    (m.form.url="/task/taskadmin/deleteBusinessType.do",m.type="entity-action",m.id="business_delete",
     m.name="删除", m.operType="1", m.form.title="删除",m.form.confirm="确定删除",m.form.sendAsSearchParams = "true")

    list<task_domain.TTaskPickerContainer> findAllBusinessTypes4Picker()

}

