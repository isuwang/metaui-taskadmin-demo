include "meta_domain.thrift"

namespace java com.isuwang.soa.meta.service

service MetadataService {

    meta_domain.TFieldMetaResponse queryFieldMetas(meta_domain.TFieldMetaRequest request)
    (m.form.url="/uc/metadata/admin/queryFieldMetas.do")

    void createFieldMeta(meta_domain.TFieldMetaSaveRequest request)
    (m.form.url="/uc/metadata/admin/createFieldMeta.do",m.type="domain-action",m.id="field_meta_create",
     m.name="新增", m.operType="2", m.form.title="新增")

    void updateFieldMeta(meta_domain.TFieldMetaSaveRequest request)
    (m.form.url="/uc/metadata/admin/updateFieldMeta.do",m.type="entity-action",m.id="field_meta_udpate",
    m.name="编辑", m.operType="2", m.form.title="编辑")

    void deleteFieldMeta(i32 id)
    (m.form.url="/uc/metadata/admin/deleteFieldMeta.do", m.type="entity-action", m.id="field_meta_delete",
     m.name="删除", m.operType="1", m.form.confirm="确定删除？", m.form.sendAsSearchParams="true")
}