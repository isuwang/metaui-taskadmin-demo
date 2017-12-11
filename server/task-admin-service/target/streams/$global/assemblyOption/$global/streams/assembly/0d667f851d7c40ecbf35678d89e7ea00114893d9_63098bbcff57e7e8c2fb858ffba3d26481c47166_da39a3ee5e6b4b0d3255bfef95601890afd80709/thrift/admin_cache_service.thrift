namespace java com.isuwang.soa.admin.service

include "admin_cache_domain.thrift"

/**
* admin缓存服务
**/
service AdminCacheService {

    /**
    * 根据员工id集合查找员工姓名集合
    **/
    map<i32,string> findStaffNamesByIds(set<i32> staffIds)

    /**
    * 根据员工id查找员工姓名
    **/
    string findStaffName(i32 staffId)

    admin_cache_domain.TStaffCache getEntity(i32 staffId)
    /**
    * 取下属所辖的所有员工
    **/
    set<i32> getDescendantStaffs(i32 orgId)
    /**
    * 取部门直属员工负责的区域并集
    **/
    set<string> getStaffDistricts(i32 orgId)
    /**
    * 取下属所辖的所有员工负责的采购产品线并集
    **/
    set<string> getDescendantStaffPurchaseCategoryGroups(i32 orgId)
    /**
    * 取下属所辖的所有员工负责的销售产品线并集
    **/
    set<string> getDescendantStaffSellCategoryGroups(i32 orgId)
    /**
    * 根据staffName,password 查询是否具有登陆App的权限（登陆App后具备操作所有权限）
    **/
    admin_cache_domain.TStaff checkAppPermission(/*员工名*/string loginName,/*密码*/string password)

    admin_cache_domain.TDataPermission queryPermission(1:i32 staffId,2:string permissionCode)
}
