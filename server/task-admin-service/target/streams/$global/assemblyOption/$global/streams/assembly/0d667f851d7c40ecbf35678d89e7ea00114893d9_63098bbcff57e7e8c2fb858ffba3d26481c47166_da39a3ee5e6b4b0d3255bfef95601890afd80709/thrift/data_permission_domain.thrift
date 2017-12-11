namespace java com.isuwang.soa.admin.domain

struct TDataPermissionResponse {

   /**
   * 机构代码ID列表
   */
 1 :  set<i32> organizationIds,
   /**
   * 员工ID列表
   */
 2 :  set<i32> staffIds,
   /**
   * 区域列表
   */
 3 :  set<string> districts,
   /**
   * 采购的品种大类列表
   */
 4 :  set<string> purchaseCategoryGroups,
   /**
   * 销售的品种大类列表
   */
 5 : set<string> sellCategoryGroups
}

