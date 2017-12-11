namespace java com.isuwang.soa.customer.domain


struct TSoaCustomer{
     /**
      *
      **/
      1 :  i32 id,
      /**
      *公司ID
      **/
      2 :  i32 companyId,
      /**
      *类型，1：买家；2：买家和卖家
      **/
      3 :  i32 type,
      /**
      *是否禁用，0：否；1：是
      **/
      4 :  bool disable,
      /**
      *登录名称，手机号码
      **/
      5 : optional string loginName,
      /**
      *客户姓名
      **/
      6 :  string name,
      /**
      *密码，md5
      **/
      7 :  string password,
      /**
      *最后登录时间
      **/
      8 : optional i64 lastLoginTime,
      /**
      *联系电话
      **/
      9 : optional string phone,
      /**
      *电话是否已验证，0：否；1：是
      **/
      10 : bool phoneVerified,
      /**
      *邮箱
      **/
      11 : string email,
      /**
      *邮箱是否已验证，0：否；1：是
      **/
      12 : bool emailVerified,
      /**
      *qq号码
      **/
      13 : string qq,
      /**
      *微信
      **/
      14 : string wechat,
      /**
      *传真
      **/
      15 : string fax,
      /**
      *所在城市代码
      **/
      16 : string city,
      /**
      *qq登录key
      **/
      17 :optional string qqKey,
      /**
      *微博登录key
      **/
      18 :optional string weiboKey,
      /**
      *微信登录key
      **/
      19 :optional string wechatKey,
      /**
      *注册时间
      **/
      20 : i64 createdAt,
      /**
      *修改时间
      **/
      21 : i64 updatedAt,
      /**
      *创建者
      **/
      22 :optional i32 createdBy,
      /**
      *修改者
      **/
      23 :optional i32 updatedBy


      /**
      *客户身份状态，1：待审核；2：审核已通过；3：审核未通过；4：禁用
      **/
      24 : i16 status,
      /**
      *客户等级，1：普通会员；2：铜牌会员；3：银牌会员；4：金牌会员
      **/
      25 :i16 level,
      /**
      *关注买入的品种大类列表，英文逗号分割，category_groups的group_code
      **/
      26 :string categoryGroups,
      /**
      *客户保证金
      **/
      27 :double deposit,
      /**
      *客户积分
      **/
      28 : double integral,
      /**
      *需求业务
      **/
      29 : string business,
      /**
      *审核通过时间，审核通过时，才赋值
      **/
      30 : optional i64 checkedAt,
      /**
      *审核人
      **/
      31 :optional i32 checkedBy,
      /**
      *审核备注
      **/
      32 :optional string checkedRemark,

      /**
      * 销售的区域，英文逗号分隔，存储区域表district的ID
      **/
      33 :optional string districts,

      /**
      * 区域名称
      **/
      34 :optional string districtName


      /**
      *审核人
      **/
      35 :optional string checkedByName,


      /**
      *创建者
      **/
      36 :optional string createdByName,
      /**
      *修改者
      **/
      37 :optional string updatedByName,

      /**
      * 是否同步登陆账号
      **/
      38:optional bool isSyncAccount,

      /**
      * 交易员/采购员 ID
      **/
      39:optional list<i32> staffIds,

      /**
      * 交易员/采购员名称
      **/
      40:optional list<string> staffNames,


      /**
      *  客户类型， 1：潜在卖家，2：成交卖家
      **/
      41 : i32 customerType,

      /**
      * 可以领用的产品线
      **/
      42 :list<map<string,string>>  productlines,

      /**
      *公司名称
      **/
      43 :optional string companyName,

      /**
      *交易员名称
      **/
      44 :optional string salesOperatorNames,

      /**
      *采购员名称
      **/
      45 :optional string transOperatorNames,
      /**
      *访谈记录
      **/
      46:optional string visitRecords,
      /**
       *竞拍资格状态（采购商）1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；
       **/
      47: i32 bidFlag
      /**
      *拍卖资格状态（供应商），1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；
      */
      48: i32 auctionFlag,
     /**
      * 公司拍卖资格状态（供应商），1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；
      */
      49: i32 companyAuctionFlag,
      /**
      * 公司竞拍资格状态（采购商），1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；
      */
      50: i32 companyBidFlag,
      /**
      * 公司是否已验证有竞拍/拍卖资格，0：否；1：是；
      */
      51: bool verified,
       /**
       * 是否是内部(虚拟)客户 0：否；1：是；
       **/
      52: i16 virtualized,

      /** 电话 */
      53 :optional string tel,

      /** 用户来源，1：线上注册；2：线下渠道；3：线上咨询 */
      54 : i16 source,
      /** 用户默认地址 */
      55 :optional i32 defaultAddressId,
     /**
     * 职位,1:老板(boss);2:采购负责人(purchaser);3:销售负责人(salesman);99:其他(other)
     */
      56 : optional i32 position,
}

/**
* 客户属性
**/
struct TCustomerProperty{

    1 : i32 customerId,

    /**消息推送设置总开关,0:不推送;1:推送;*/
    2 : i32 pushMsgFlag,

    /**现货通自选消息推送设置开关,0:不推送;1:推送;*/
    3 : i32 xhtPushMsgFlag

}

/**
* BinlogCustomer 客户属性
* 用于返回给监听orderdb的事件，避免跨库调用
**/
struct TBinlogCustomer {
    /**客户名称*/
    1 : optional string name,
    /**客户手机号码*/
    2 : optional string phone,
    /**公司名称*/
    3 : optional string companyName,
    /**城市*/
    4 : optional string city

}

/**
* 混合实体，用于返回给监听orderdb的事件，避免跨库调用
*/
struct TBinlogCompanyAndCustomer {
    /**客户名称*/
    1 : optional string customerName,
    /**客户手机号码*/
    2 : optional string customerPhone,
    /**公司名称*/
    3 : optional string companyName
}

struct TWechatUserInfo{
   /**id*/
    1:i32 id,
    /**crm.customers表id*/
    2:i32 customerId,
    /**微信用户唯一标识*/
    3:string openId,
    /**微信网页授权接口调用凭证*/
    4:string accessToken,
    /**access_token+timestamp经过md5处理后的串*/
    5:string accessTokenMd5,
    /**用户刷新access_token*/
    6:string refreshToken,
    /**用户昵称*/
    7:optional string nickname,
    /**性别*/
    8:optional i32 sex,
    /*省份*/
    9:optional string province,
    /**城市*/
    10:optional string city,
    /**用户头像url*/
    11:optional string headImgUrl,
    /**用户特权信息*/
    12:optional string privilege,
    /**只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段*/
    13:optional string unionId,
    /**'是否有效，0：否；1：是；',*/
    14:optional i32 isValid,
    /**创建人*/
    15:optional i32 createdBy,
    /**创建时间*/
    16:optional i64 createdAt,
    17:optional i32 updatedBy,
    18:optional i64 updatedAt
}
struct TWechatUserInfoCondition{
   /**id*/
    1:optional i32 id,
    /**crm.customers表id*/
    2:optional i32 customerId,
    /**微信用户唯一标识*/
    3:optional string openId,
    /**微信网页授权接口调用凭证*/
    4:optional string accessToken,
    /**access_token+timestamp经过md5处理后的串*/
    5:optional string accessTokenMd5,
    /**用户刷新access_token*/
    6:optional string refreshToken,
    /**用户昵称*/
    7:optional string nickname,
    /**性别*/
    8:optional i32 sex,
    /*省份*/
    9:optional string province,
    /**城市*/
    10:optional string city,
    /**用户头像url*/
    11:optional string headImgUrl,
    /**用户特权信息*/
    12:optional string privilege,
    /**只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段*/
    13:optional string unionId,
    /**'是否有效，0：否；1：是；',*/
    14:optional i32 isValid,
    /**创建人*/
    15:optional i32 createdBy,
    /**创建时间*/
    16:optional i64 createdAt,
    17:optional i32 updatedBy,
    18:optional i64 updatedAt
}
