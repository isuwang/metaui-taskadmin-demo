namespace java com.isuwang.soa.admin.domain

struct TStaffCache{
    1:i32 id,
    2:string name,
    3:bool disable,
    4:optional i32 orgId,
    5:bool manager,
    6:string districts,
    7:set<string> districtSet,
    8:string purchaseCategoryGroups,
    9:set<string> purchaseCategoryGroupSet,
    10:string sellCategoryGroups,
    11:set<string> sellCategoryGroupSet,
    12:string qq,
    13:string phone,
    14:set<i32> roles,
    15:set<string> permissions,
    16:set<i32> bizSales,
    17:set<i32> bizStaffs,
    18:set<i32> descendantStaffs,
    19:set<string> namePinyins,
    20:set<string> nameInitialPinyins,
    21:optional i32 level = 0
}

struct TStaff{
   /**
   *
   */
 1 :  i32 id,
   /**
   * 组织机构ID
   */
 2 : optional i32 orgId,
   /**
   * 登录用户名
   */
 3 :  string loginName,
   /**
   * 密码，md5
   */
 4 :  string password,
   /**
   * 姓名
   */
 5 :  string name,
   /**
   * 英文名
   */
 6 :  string englishName,
   /**
   * 性别，1：男；2：女；
   */
 7 :  i32 gender,
   /**
   * 是否禁用，0：否；1：是；
   */
 8 :  i32 disable,
   /**
   *
   */
 9 :  string email,
   /**
   *
   */
 10 :  string phone,
   /**
   *
   */
 11 :  string wechat,
   /**
   *
   */
 12 :  string qq,
   /**
   * 是否管理者，0：否；1：是；
   * 如果是管理者，自动继承所在部门的数据权限
   */
 13 :  i32 manager,
   /**
   * 负责的业务的区域范围，英文逗号分割，区域表district的district_code
   */
 14 :  string districts,
   /**
   * @datatype(name="date")
   */
 15 : optional i64 lastLoginTime,
   /**
   *
   */
 16 :  string remark,
   /**
   * 负责采购的品种大类列表，英文逗号分隔，category_groups的group_code
   */
 17 :  string purchaseCategoryGroups,
   /**
   * 负责销售的品种大类列表，英文逗号分隔，category_groups的group_code
   */
 18 :  string sellCategoryGroups,
   /**
   *
   */
 19 :  i64 createdAt,
   /**
   * 修改时间
   */
 20 :  i64 updatedAt,
   /**
   * 创建者staff_id
   */
 21 :  i32 createdBy,
   /**
   * 修改者staff_id
   */
 22 :  i32 updatedBy,

}

struct TDataPermission{
    1:set<i32> staffIds,
    2:set<i32> orgIds
}