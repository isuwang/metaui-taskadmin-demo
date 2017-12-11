namespace java com.isuwang.soa.user.domain
include "base_model.thrift"



struct TStaffAllocationStrategyModifyRequest{
    /***员工id*/
    1 : i32 staffId
    /***策略ID */
    2 : i32 strategyId
    /***策略值*/
    3 : i32 value
}



struct TQueryAllocationStrategyRequest{
    /**员工id*/
    1: optional i32 staffId
    /**部门id*/
    2: optional i32 organizationId
    /**策略id， 不选择时默认为49 潜在库容 ， -1 为全部*/
    3: optional i32 strategyId
    4: optional i32 id
}


struct TStaffAllocationStrategy{
    8 : i32 id
    /***员工id*/
    1 : i32 staffId
    /***策略ID*/
    2 : i32 strategyId
    /***策略值*/
    3 : i32 value
    /***创建时间*/
    4 : i64 createdAt
    /***修改时间*/
    5 : i64 updatedAt
    /***创建者，staff_id*/
    6 : i32 createdBy
    /***修改者，staff_id*/
    7 : i32 updatedBy

    /**权限 "update" -> true/false */
    20 : map<string,bool> actions
    /***员工名*/
    21 : optional string name
    /***部门id*/
    22 : optional i32 organizationId
    /***部门名称*/
    23 : optional string organizationName

}

struct TQueryAllocationStrategyResponse{
    1: base_model.TPageResponse pageResponse
    2: list<TStaffAllocationStrategy> allocationStrategies
    3: map<string,string> statusCounts = {}
}


