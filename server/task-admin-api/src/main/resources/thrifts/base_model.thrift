namespace java com.isuwang.soa.common.util
/**
* 调用源
**/

enum CallerFrom {
	/**
	* 网站
	**/
	web,
	/**
	* 手机Wap
	**/
	wap,
	/**
	 * 手机App
	**/
	app,
	 /**
	 * 运营管理系统
	**/
	oss,
	/**
	* 快塑服务
	**/
	ksservice,

	/**
	* 速码物流
    **/
    suma,

    /**
    * dapeng
    **/
    dapeng

}


/**
* 请求头
**/
struct RequestHeader {
    /**
    * 操作人ID
    **/
	1: i32 operatorId,
	/**
	*  操作人名称
	**/
	2: string operatorName,
	/**
	* 客户编号
	**/
	3:optional i32 customerId,
	/**
	* 客户名称
	**/
	4: optional string customerName,
	/**
	* 调用源
	**/
	5: optional CallerFrom callerFrom,
	/**
	* 调用源IP
	**/
	6: optional string callerIP
	/**
     * 会话编号
     **/
    7: optional string sessionId
}

/**
* 分页查询请求包
**/
struct TPageRequest {
	/**
	* 查询的开始序号（序号从零开始）
	**/
	1: i32 start,
	/**
	* 返回记录数
	**/
	2: i32 limit,
	/**
	* 排序的字段
	**/
	3: optional string sortFields
}


struct TPageResponse {
	/**
	* 查询的开始序号（序号从零开始）
	**/
	1: i32 start,
	/**
	* 最大返回的记录数
	**/
	2: i32 limit,
	/**
	* 结果记录数
	**/
	3: i32 results
}

struct TreeNode {

   1: i32 id,
   2: i32 parentId,
   /**显示名称*/3: string text,
   /**是否是叶节点(无子节点)*/4: bool leaf,
   /**排序*/5: i32 sort,
   /**图标*/6: string icon,
   ///**子节点*/7: list<TreeNode> children,
   /**长路径名称*/8: string fullName,
}

