namespace java com.isuwang.soa.admin.service
include "admin_domain.thrift"
include "admin_enum.thrift"



/**
* 权限管理服务
**/
service RbacManagementService {

    /**
     * 获取所有权限列表
     */
     list<admin_domain.TPermission> findAllPermissions()
}

/**
* Staff Service
**/
service StaffService {

   /**
    * 根据Id查询员工
    **/
   admin_domain.TStaffEx getById(i32 id);

    /**
    * 根据员工ID判断是否具有指定权限
    */
   bool staffHasPermission(/**员工ID*/1:i32 staffId,/**权限编码*/2:string permissionCode)


   /**
	 * 根据员工ID判断是否具有指定角色
	 */
	bool staffIsRole(/**员工ID*/2:i32 staffId,/**角色ID*/3: i32 roleId),

    list<admin_domain.TStaff> findStaffs(list<i32> staffIds),

    i32 getByName(string name),

    /**
     * 为了避免在订单模块跨库sql查询，在这里添加一个接口，用作监听orderdb的binlog事件
     * SELECT DISTINCT(name) FROM staffs WHERE id IN (SELECT staff_id FROM staff_roles WHERE role_id = 11) OR name IN ('银明华','梁丹','张培燕','谢植')
    **/
    list<string> getStaffNamesByRoleId(),

    /**
     * 为了避免在订单模块跨库sql查询，在这里添加一个接口，用作监听orderdb的binlog事件
     * 查询角色为客服专员的员工ID
     * SELECT staff_id FROM admindb.staff_roles WHERE role_id = (SELECT id FROM admindb.roles WHERE name = '客服专员')
    **/
    list<i32> getStaffIdsByAttache(),
    /**
    * 根据员工查询其角色
**/
    list<admin_domain.TRole> getRoleByStaffId(1:i32 staffId),
    /**
    * 根据员工ids查询员工
**/
    map<i32,admin_domain.TStaff> getStaffsByIds(1:list<i32> ids)

    /**
    * 根据区域查找员工
    **/
    map<i32,admin_domain.TStaff> getStaffByRegion(1:admin_enum.OrganizationRegion organizationRegion),
    /**
    * 根据员工id返回区域
    **/
    admin_enum.OrganizationRegion  getStaffRegion(1: i32 staffId)
}

/**
* 组织服务
**/
service OrganizationService{

    i32 getId(string name),

     list<admin_domain.TOrganization>  findAllOrganizations()
/**
### 添加组织信息

####  业务描述
    1. 添加组织信息

####  接口依赖
    1. 无

####  边界异常说明
    1. 无

####  输入
    1. admin_domain.TOrganizationCreateRequest

####  前置检查
    1. 无

####  权限检查
    1. 无

####  逻辑处理
    1. 添加组织信息

####  事务处理
    1. 无

####  输出
    1. 无
**/
    void addOrganization(admin_domain.TOrganizationCreateRequest request)
/**
### 添加组织信息

####  业务描述
    1. 添加组织信息

####  接口依赖
    1. 无

####  边界异常说明
    1. 无

####  输入
    1. admin_domain.TOrganizationCreateRequest

####  前置检查
    1. 无

####  权限检查
    1. 无

####  逻辑处理
    1. 修改组织信息

####  事务处理
    1. 无

####  输出
    1. 无
**/
    void modifyOrganization(admin_domain.TOrganizationModifyRequest request)
/**
### 根据条件查找部门信息

####  业务描述
    1. 添加组织信息

####  接口依赖
    1. 无

####  边界异常说明
    1. 无

####  输入
    1. admin_domain.TOrganizationCreateRequest

####  前置检查
    1. 无

####  权限检查
    1. 无

####  逻辑处理
    1. 查找组织信息

####  事务处理
    1. 无

####  输出
    1. 无
**/
    list<admin_domain.TOrganization>  findOrganizations(admin_domain.TFindOrganizationsRequest request)

/**
### 根据条件查找部门信息

####  业务描述
    1. 添加组织信息

####  接口依赖
    1. 无

####  边界异常说明
    1. 无

####  输入
    1. admin_domain.TOrganizationCreateRequest

####  前置检查
    1. 无

####  权限检查
    1. 无

####  逻辑处理
    1. 查找组织信息

####  事务处理
    1. 无

####  输出
    1. 无
**/
    admin_domain.TOrganization  findOrganizationById(i32 id)
}