namespace java com.isuwang.soa.user.domain


/**
* 客户
**/
struct TCustomer{

    /**
    * id
    **/
    1 :  i32 id,
    /**
    *公司ID
    **/
    2 :  i32 companyId,
    /**

    /**
    *客户姓名
    **/
    3 :  string name,

    /**
    *联系电话
    **/
    4 : optional string phone,

    /**
     *竞拍资格状态（采购商）1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；
     **/
    5: optional i32 bidFlag,

    6: optional i32 auctionFlag

}
/**
* 客户
**/
struct TCustomerEx{

    /**
    * id
    **/
    1 :  i32 id,
    /**
    *公司ID
    **/
    2 :  i32 companyId,
    /**

    /**
    *客户姓名
    **/
    3 :  string name,

    /**
    *联系电话
    **/
    4 : optional string phone,

    /**
     *竞拍资格状态（采购商）1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；
     **/
    5: optional i32 bidFlag
    /**
     *竞拍资格状态（采购商）1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；

     **/
    6: optional i32 auctionFlag
}

/**
* 公司实体类
**/

struct TCompany{
   /**
   *
   */
 1 :  i32 id,
   /**
   * 创建该公司实体的客户ID
   */
 2 : optional i32 ownerCustomerId,
   /**
   * 公司名称
   */
 3 :  string name,
   /**
   * 公司名称缩写
   */
 4 :  optional string abName,
   /**
   * 联系电话
   */
 5 :  optional string phone,
   /**
   * 联系地址
   */
 6 :  optional string address,
   /**
   * 城市代码
   */
 7 : optional string city,
   /**
   * 公司网址
   */
 8 : optional string website,
   /**
   * 营业执照注册号
   */
 9 : optional string orgLicense,
   /**
   * 税务登记证税字号
   */
 10 : optional string orgTax,
   /**
   * 组织机构代码
   */
 11 : optional string orgCode,
   /**
   * 3合1证件编号
   */
 12 : optional string orgColligateCode,
   /**
   * 公司类型，1：采购商；2：供应商；
   */
 13 :optional  i32 type,
   /**
   * 附件id
   */
 14 : optional i32 attachmentId,
   /**
   * 营业执照附件
   */
 15 : optional i32 orgLicenseAid,
   /**
   * 税务登记证附件
   */
 16 : optional i32 orgTaxAid,
   /**
   * 组织机构代码证附件
   */
 17 : optional i32 orgCodeAid,
   /**
   * 3合1附件id
   */
 18 : optional i32 orgColligateAid,
   /**
   * 公司状态，1：待审核；2：审核已通过；3：审核未通过；
   */
 19 : optional i32 status,
   /**
   * 营业执照审核状态，1：待审核；2：已通过；3：未通过；
   */
 20 : optional i32 orgLicenseStatus,
   /**
   * 税务登记证审核状态，1：待审核；2：已通过；3：未通过；
   */
 21 : optional i32 orgTaxStatus,
   /**
   * 组织机构代码审核状态，1：待审核；2：已通过；3：未通过；
   */
 22 : optional i32 orgCodeStatus,
   /**
   * 3合1证审核状态，1：待审核；2：已通过；3：未通过；
   */
 23 : optional i32 orgColligateStatus,
   /**
   * 公司是否已验证，0：否；1：是；
   */
 24 :  i32 verified,
   /**
   * 公司是否已删除，0：否；1：是；
   */
 25 :  i32 deleted,
   /**
   * 是否为成交采购商,1:成交
   */
 26 :  i32 purchaserTraded,
   /**
   * 是否为成交供应商,1:成交
   */
 27 :  i32 supplierTraded,
   /**
   * 关注买入的品种大类列表，英文逗号分割，category_groups的group_code
   */
 28 :  optional string buyerCategoryGroups,
   /**
   * 可销售的品种大类列表，英文逗号分割，category_groups的group_code
   */
 29 :  optional string sellerCategoryGroups,
   /**
   * 可销售的区域，英文逗号分隔，存储区域表district的ID
   */
 30 :  optional string sellerDistricts,
   /**
   * 主营业务
   */
 31 : optional string business,
   /**
   * 默认收货地址信息
   */
 32 : optional i32 defaultAddressId,
   /**
   * 默认银行信息
   */
 33 : optional i32 defaultBankId,
   /**
   * 采购商等级，1：普通会员；2：铜牌会员；3：银牌会员；4：金牌会员
   */
 34 : optional i32 buyerLevel,
   /**
   * 供应商等级，1：普通会员；2：铜牌会员；3：银牌会员；4：金牌会员；
   */
 35 : optional i32 sellerLevel,
   /**
   * 采购商类型,1:贸易商(trafficker);2:次终端(secondTerminal);3:终端(terminal)
   */
 36 : optional i32 purchaserType,
   /**
   * 采购商类型，1：上游生厂商，2:一级代理商
   */
 37 : optional i32 supplierType,
   /**
   * 默认开票信息
   */
 38 : optional i32 defaultInvoiceId,
   /**
   * 快塑供应商类型，0：非快塑供应商；1：快塑供应商；2:黑名单
   */
 39 : optional i32 kuaisuSupplierFlag,
   /**
   * 快塑供应商级别:A,B,C,D...
   */
 40 : optional string kuaisuSupplierLevel,
   /**
   * 快塑供应商额度，吨数
   */
 41 : optional double kuaisuSupplierLimit,
   /**
   * 是否淘塑协议供应商，0：否；1：是；
   */
 42 : optional i32 taosuContractSupplierFlag,
   /**
   * 淘塑协议供应商级别:A,B,C,D...
   */
 43 : optional string taosuContractSupplierLevel,
   /**
   * 拍卖资格状态（供应商），1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；
   */
 44 : optional i32 auctionFlag,
   /**
   * 竞拍资格状态（采购商），1：未申请；2：待审核；3：审核通过；4：审核未通过；99：禁用；
   */
 45 : optional i32 bidFlag,
   /**
   * 注册资金
   */
 46 : optional double registeredCapital,
   /**
   * 组织机构代码审核人
   */
 47 : optional i32 orgCodeAuditBy,
   /**
   * 营业执照审核人
   */
 48 : optional i32 orgLicenseAuditBy,
   /**
   * 三合一证件审核人
   */
 49 : optional i32 orgColligateAuditBy,
   /**
   * 组织机构代码审核时间
   */
 50 : optional i64 orgCodeAuditAt,
   /**
   * 营业执照审核时间
   */
 51 : optional i64 orgLicenseAuditAt,
   /**
   * 税务登记审核时间
   */
 52 : optional i64 orgTaxAuditAt,
   /**
   * 三合一证件审核时间
   */
 53 : optional i64 orgColligateAuditAt,
   /**
   * 税务登记审核人
   */
 54 : optional i32 orgTaxAuditBy,
   /**
   * 客户授信额度
   */
 55 : optional double creditLimit,
   /**
   * 客户授信期限
   */
 56 : optional i32 creditTerm,
   /**
   * 企业性质,1:国有非上市企业(nonStateOwnedEnterprises);2:国有上市企业(stateOwnedEnterprises);3:民营非上市企业(privateNonListedCompany);4:民营上市企业(privateListedCompany);5:中外合资(非港澳台)企业(jointVentures);6:港澳台合资企业(HKMacaoAndTaiwanJointVenture);
   */
 57 : optional i32 property,
   /**
   * 员工人数
   */
 58 : optional i32 employNum,
   /**
   * 成立日期
   */
 59 : optional i64 foundedAt,
   /**
   * 推荐人
   */
 60 : optional i32 suggestBy,
   /**
   * 年交易额,单位:万元
   */
 61 : optional double yearTrade,
   /**
   * 是否主公司,0:否(not);1:是(yes)
   */
 62 : optional i32 kuaisuSupplierIsMaster,
   /**
   * 关联的主公司id
   */
 63 : optional i32 kuaisuSupplierMasterCompanyId,
   /**
   * 快塑供应商付款方式,1:先货后款(cargoFirset);2:先款后货(moneyFirst)
   */
 64 : optional i32 kuaisuSupplierPaymentType,
   /**
   * 快塑供应商额度限制
   */
 65 : optional double kuaisuSupplierCreditLimit,
   /**
   * 备注
   */
 66 : optional string remark,
   /**
   * 创建时间
   */
 67 : optional i64 createdAt,
   /**
   * 修改时间
   */
 68 : optional i64 updatedAt,
   /**
   * 创建者，staff_id，后台创建时才有值
   */
 69 : optional i32 createdBy,
   /**
   * 修改者，staff_id，后台编辑时才有值
   */
 70 : optional i32 updatedBy,

 /**是否为黑名单采购商，0：否；1：是；*/
 71 : i32 purchaseBlacked

}

