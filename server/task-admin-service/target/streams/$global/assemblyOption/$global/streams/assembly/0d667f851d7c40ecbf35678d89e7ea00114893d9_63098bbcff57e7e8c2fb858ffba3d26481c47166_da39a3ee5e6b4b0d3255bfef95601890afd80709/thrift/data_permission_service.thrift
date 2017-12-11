
include "data_permission_domain.thrift"

namespace java com.isuwang.soa.admin.service
/**
* 数据权限服务
**/
service DataPermissionService {

	data_permission_domain.TDataPermissionResponse cal(/**员工ID*/1:i32 staffId)
}