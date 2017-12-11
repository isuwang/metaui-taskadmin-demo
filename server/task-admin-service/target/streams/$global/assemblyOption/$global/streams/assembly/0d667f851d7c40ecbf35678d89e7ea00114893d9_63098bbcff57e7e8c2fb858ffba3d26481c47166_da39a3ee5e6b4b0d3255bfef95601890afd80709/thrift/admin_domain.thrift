namespace java com.isuwang.soa.admin.domain


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

struct TPermission {
    1: i32  id,

    2: string name,

    3: string code,

    4: optional string remark,

    5: string subSys,

    6: string subModule,
}



struct TRole {
    1: i32  id,
    2: string name,
    3: string code,
    4: bool menu,
    5: string subSys,
    6: string dataAreas,
    7: i64 createdAt,
    8: i64 updatedAt,
    9: i32  createdBy,
    10: i32  updatedBy,
    11: list<TPermission>  bindPermissions,
    12: string  createdByName,
    13: string  updatedByName,
    14: string  remark,

}


struct TStaffEx{
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

 /**角色集合*/
 23: optional list<TRole>  bindRoles,

/**部门名称*/
24: optional string  orgName,

25: optional string  roleNames,

26: optional string  roleIds,

27 : optional string keyword,

28 : optional bool useAuth
}

struct TOrganization {
    /**id*/
    1:i32 id,
    /**父组织id*/
    2:i32 parentId,
    /**组织名称*/
    3:string name,
    /**代码(无用)*/
    4:string code,
    /**组织类型(无用)*/
    5:i32 type,
    /**状态 0：正常 1：禁用*/
    6:i32 disable
    /**是否为利润中心 0:未定义 1: 是 2：否*/
    7:i32 isProfitCenter
    /**所属利润中心，当为利润中心时，则是自身id，否则为对应组织id*/
    8:i32 profitCenterId
    /**区域  0:未定义 1：华南 2：华东*/
    9: i32 region
}



struct TOrganizationCreateRequest {
    /**父组织id*/
    2:i32 parentId,
    /**组织名称*/
    3:string name,
    /**是否为利润中心 1: 是 2：否*/
    7: optional i32 isProfitCenter
    /**所属利润中心，当为利润中心时，则是自身id，否则为对应组织id*/
    8: optional i32 profitCenterId
    /**区域 1：华南 2：华东*/
    9: optional i32 region
}

struct TOrganizationModifyRequest {
    1:i32 id
    /**组织名称*/
    3: optional string name,
    /**是否为利润中心 1: 是 2：否*/
    7: optional i32 isProfitCenter
    /**所属利润中心，当为利润中心时，则是自身id，否则为对应组织id*/
    8: optional i32 profitCenterId
    /**区域 1：华南 2：华东*/
    9: optional i32 region
    /**状态 0：正常 1：禁用*/
    6: optional i32 disable
}


struct TFindOrganizationsRequest{
    1: optional i32 id
    /**父组织id*/
    2: optional i32 parentId,
    /**组织名称*/
    3: optional string name,
    /**是否为利润中心 1: 是 2：否*/
    7: optional i32 isProfitCenter
    /**所属利润中心，当为利润中心时，则是自身id，否则为对应组织id*/
    8: optional i32 profitCenterId
    /**区域 1：华南 2：华东*/
    9: optional i32 region
    /**状态 0：正常 1：禁用*/
    6: optional i32 disable
    /**组织ids*/
    10:list<i32> ids
}