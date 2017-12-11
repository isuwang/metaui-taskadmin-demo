include "user_domain.thrift"
include "user_enums.thrift"

namespace java com.isuwang.soa.user.service

/**
* Customer和Company服务
**/
service UserService {


    /**
    *  根据id获取Customer记录
    **/
   user_domain.TCustomer findCustomerById(1:i32 customerId, 2:user_enums.TCustomerType customerType),

    /**
   *  根据id获取Customer记录
   **/
   user_domain.TCustomerEx findCustomerExById(1:i32 customerId, 2:user_enums.TCustomerType customerType),

   /**
   * 根据id获取Company记录
    **/
   user_domain.TCompany findCompanyById(1:i32 companyId),


   list<user_domain.TCompany> findCompanysByCustomerIds(1:list<string> ids)

}

