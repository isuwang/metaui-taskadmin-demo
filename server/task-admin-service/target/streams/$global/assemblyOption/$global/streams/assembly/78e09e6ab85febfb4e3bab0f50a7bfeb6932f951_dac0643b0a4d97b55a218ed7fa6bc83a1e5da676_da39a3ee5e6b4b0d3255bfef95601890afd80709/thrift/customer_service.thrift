include "customer_domain.thrift"
include "customer_enums.thrift"
namespace java com.isuwang.soa.customer.service

/**
* Customer服务
**/
service CustomerService {

    /**
    * 根据ID查询客户
    */
    customer_domain.TSoaCustomer findCustomerById(/**客户id*/1:i32 id,2:customer_enums.CustomerType customerType),

    /**
    * 根据customerId查询客户属性
    **/
    customer_domain.TCustomerProperty findTCustomerPropertyById(/**客户id*/1:i32 customerId),

    /**
    * 客户推送消息设置修改
    **/
    void updatePushMsgFlag(/**客户id*/1:i32 customerId,/**消息推送设置总开关*/2:i32 pushMsgFlag),

    /**
    * 客户xht自选消息推送设置修改
    **/
    void updatePushXhtMsgFlag(/**客户id*/1:i32 customerId,/**现货通自选消息推送设置开关*/2:i32 pushXhtMsgFlag),

    /**
    * 根据id集合查询多个客户属性
    **/
    list<customer_domain.TCustomerProperty> findCustomerPropertiesByIds(/**客户id*/1:list<i32> customerId),

    /**
    * 根据公司id得到有竞拍资格的客户
    **/
    customer_domain.TSoaCustomer getAuctionCustomerByCompanyId(/**公司ID*/1:i32 companyId,/**客户类型，1：买家，2：卖家*/2:i32 customerType),

    /**
    * 根据供应商ID查询客户，提供给监听orderdb的binlog事件调用，避免跨库调用，用于发送对应的企业QQ信息(PersonalCenter迁移)
    **/
    customer_domain.TBinlogCustomer getCustomerBySupplierId(/**供应商ID*/1:i32 supplierId),

    /**
    * 根据客户ID，公司ID查询公司名称以及客户名字，客户电话
    * 用于返回给监听orderdb的事件，避免跨库调用
    **/
    customer_domain.TBinlogCompanyAndCustomer getById(/**客户ID*/1:i32 customerId,/**公司ID*/2:i32 companyId)


    i32 findTransOperator(1:i32 customerId,2:string category,3:string cityCode)
}

service WechatCustomerService{
    /**根据条件搜索微信用户*/
    list<customer_domain.TWechatUserInfo> findWechatInfoByCondition(1:customer_domain.TWechatUserInfoCondition wechatCondition),
    /**保存微信用户信息*/
    void saveWechatInfo(1:customer_domain.TWechatUserInfo wechatInfo)
    /**更新微信用户信息*/
    void updateWechatInfo(1:customer_domain.TWechatUserInfo wechatInfo)
    /**binlog解绑微信用户*/
    void onBinlogMessage(1: binary message)

}