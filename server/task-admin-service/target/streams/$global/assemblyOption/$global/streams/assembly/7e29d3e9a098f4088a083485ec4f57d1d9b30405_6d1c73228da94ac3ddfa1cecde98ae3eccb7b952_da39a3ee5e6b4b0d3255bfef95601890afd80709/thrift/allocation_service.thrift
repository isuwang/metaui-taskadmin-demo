include "allocation_domain.thrift"
include "base_model.thrift"

namespace java com.isuwang.soa.user.service

/**
* Customer和Company服务
**/
service AllocationService {

    allocation_domain.TQueryAllocationStrategyResponse queryAllocationStrategy(1:base_model.TPageRequest pageRequest 2:allocation_domain.TQueryAllocationStrategyRequest request)

    /**
### 修改交易员潜在库容

####  业务描述
	1. 修改潜在库容，并删除相关缓存

####  接口依赖
	1. 无

####  边界异常说明
	1. 无

####  输入
	1. 用料信息id

####  前置检查
	1.

####  权限检查
	1. 修改权限

####  逻辑处理
    1. 修改员工策略配置信息
    2. 删除相关缓存

####  事务处理
	1. 无

####  输出
	1. 预约单id
	**/
    void modifyAllocationStrategy(1: allocation_domain.TStaffAllocationStrategyModifyRequest request),



}