include "base_model.thrift"
namespace java com.isuwang.soa.task.domain



struct TTaskItem {
    1: i32 id,

	/**
	 * 任务id
	 */
	2: i32 taskId,

	/**
	 * 意见id
	 */
	3: i32 suggestionId,

	/**
	 * 意见类型
	 */
	4: i32 suggestionType,

	/**
	 * 意见备注
	 */
	5: optional string suggestionRemark,

    /**
	 * 意见内容
	 */
	6: string suggestionContent
}

struct TTaskLog {
	1: i32 id,

	/**
	 * 任务id
	 */
	2: i32 taskId,

	/**
	 * 操作名
	 */
	3: string operation,

	/**
	 * 操作字段名
	 */
	4: optional string operField,

	/**
	 * 原值
	 */
	5: optional string oldValue,

	/**
	 * 新值
	 */
	6: optional string newValue,

	/**
	 *
	 */
	7: i64 createdAt,

	/**
	 *
	 */
	8: optional i32 createdBy,

	/**
	 *
	 */
	9: i64 updatedAt,

	/**
	 *
	 */
	10: optional i32 updatedBy
}

struct TTaskRemark {
	1: i32 id,

	/**
	 * 任务id
	 */
	2: i32 taskId,

	/**
	 * 备注内容
	 */
	3: string content,

	/**
	 *
	 */
	4: i64 createdAt,

	/**
	 *
	 */
	5: optional i32 createdBy,

	/**
	 *
	 */
	6: i64 updatedAt,

	/**
	 *
	 */
	7: optional i32 updatedBy

	8: optional string updaterName
}

struct TTaskAttachment {
	1: i32 id,

	/**
	 * 任务id
	 */
	2: i32 taskId,

	/**
	 * 附件id(阿里云文件id)
	 */
	3: string attachmentId,

	/**
	 * 附件文件名
	 */
	4: string attachmentName,

	/**
	 *
	 */
	5: i64 createdAt,

	/**
	 *
	 */
	6: optional i32 createdBy,

	/**
	 *
	 */
	7: i64 updatedAt,

	/**
	 *
	 */
	8: optional i32 updatedBy
}

struct TTask {
    1: i32 id,

	/**
	 * 父任务id
	 */
	2: optional i32 parentTaskId,

	/**
	 * 任务编号
	 */
	3: string taskNo,

	/**
	 * 关联的公司id
	 */
	4: optional i32 companyId,
	/**
     * 关联的公司名
     */
    5: optional string companyName,
	/**
	 * 任务主题
	 */
	25: string taskSubject,

	/**
	 * 状态，1：待处理，2: 处理中，3：已处理，4：无需处理
	 */
	6: i32 status,

	/**
	 * 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录
	 */
	7: i32 type,

	/**
	 * 业务类型id
	 */
	8: i32 businessTypeId,

	9: string businessTypeName,

	/**
	 * 优先级, 1:高， 2: 中, 3: 低
	 */
	10: i32 priority,

	/**
	 * 计划日期
	 */
	11: optional i64 planAt,

	/**
	 * 沟通姿势/方式, 1: 微信...
	 */
	12: optional i32 communicationStyle,

	/**
	 * 经办人
	 */
	13: optional i32 handlerId,

	/**
	 * 计划或投诉问题
	 */
	14: optional string problemDesc,

	/**
	 * 结果
	 */
	15: optional string resultDesc,

	/**
	 *
	 */
	16: i64 createdAt,

	/**
	 *
	 */
	17: optional i32 createdBy,

	/**
	 *
	 */
	18: i64 updatedAt,

	/**
	 *
	 */
	19: optional i32 updatedBy,

    /**
    * 经办人姓名
    **/
    26: optional string handlerName
}


struct TTaskDetail {
    1: i32 id,

    	/**
    	 * 父任务id
    	 */
    	2: optional i32 parentTaskId,

    	/**
    	 * 任务编号
    	 */
    	3: string taskNo,

    	/**
    	 * 关联的公司id
    	 */
    	4: optional i32 companyId,
    	/**
         * 关联的公司名
         */
        5: optional string companyName,
    	/**
    	 * 任务主题
    	 */
    	25: string taskSubject,

    	/**
    	 * 状态，1：待处理，2: 处理中，3：已处理，4：无需处理
    	 */
    	6: i32 status,

    	/**
    	 * 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录
    	 */
    	7: i32 type,

    	/**
    	 * 业务类型id
    	 */
    	8: i32 businessTypeId,

    	/**
    	 * 优先级, 1:高， 2: 中, 3: 低
    	 */
    	9: i32 priority,

    	/**
    	 * 计划日期
    	 */
    	10: optional i64 planAt,

    	/**
    	 * 沟通姿势/方式, 1: 微信...
    	 */
    	11: optional i32 communicationStyle,

    	/**
    	 * 经办人
    	 */
    	12: optional i32 handlerId,

    	/**
    	 * 计划或投诉问题
    	 */
    	13: optional string problemDesc,

    	/**
    	 * 结果
    	 */
    	14: optional string resultDesc,

    	/**
    	 *
    	 */
    	15: i64 createdAt,

    	/**
    	 *
    	 */
    	16: optional i32 createdBy,

    	/**
    	 *
    	 */
    	17: i64 updatedAt,

    	/**
    	 *
    	 */
    	18: optional i32 updatedBy,

        /**
         * 问题
         **/
    	19: list<TTaskItem> questions,

    	/**
         * 改进措施
         **/
    	20: list<TTaskItem> improvements,

    	/**
    	* 操作日志
        **/
    	21: list<TTaskLog> taskLogs,

    	/**
    	 * 附件
         **/
    	22: list<TTaskAttachment> taskAttachments,

    	/**
    	 * 备注
         **/
    	23: list<TTaskRemark> taskRemarks,

    	/**
    	 *  子任务
         **/
    	24: list<TTask> children

        /**
        * 经办人姓名
        **/
        26: optional string handlerName
}

struct TBusinessType {
    1: i32 id,

	/**
	 * 业务类型
	 */
	2: string typeName,

	/**
	 * 指导意见
	 */
	3: optional string suggestionContent,

	/**
	 * 问题， 逗号分隔的suggestions id
	 */
	4: optional string questions,

	5: optional string questions2Str,

	/**
	 * 改进措施， 逗号分隔的suggestions id
	 */
	6: optional string improvements,

	7: optional string improvements2Str,

	/**
	 *
	 */
	8: i64 createdAt,

    9: optional string creator
	/**
	 *
	 */
	10: optional i32 createdBy,

	/**
	 *
	 */
	11: i64 updatedAt,

	/**
	 *
	 */
	12: optional i32 updatedBy

	13: optional string updater
}

struct TSuggestion {
	1: i32 id,

	/**
	 * 意见类型，1: 问题, 2: 改进
	 */
	2: i32 type,

	/**
	 * 内容
	 */
	4: string content,

	/**
	 * 标签，多个标签逗号分隔
	 */
	5: string labels,

	/**
	 * 帮助
	 */
	6: optional string assistance,

	/**
	 *
	 */
	7: i64 createdAt,

	/**
	 *
	 */
	8: optional i32 createdBy,

	/**
	 *
	 */
	9: i64 updatedAt,

	/**
	 *
	 */
	10: optional i32 updatedBy
}

struct TTaskRequest {
    1: base_model.TPageRequest pageRequest

    2: optional string taskNo,
    /**
      * 关联的公司id
      */
    3: optional i32 companyId,
    /**
     * 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录
     */
    4: optional i32 type,

    /**
     * 业务类型id
     */
    5: optional i32 businessTypeId,

    /**
     * 状态，1：待处理，2: 处理中，3：已处理，4：无需处理
     */
    6: optional i32 status,
    /**
     * 经办人
     */
    7: optional i32 handlerId

     /**
     * 计划日期（起始）
     */
    8: optional i64 planAtStart,
     /**
     * 计划日期（结束）
     */
    9: optional i64 planAtEnd,

    /**
     * 更新日期（起始）
     */
    10: optional i64 updateAtStart,
    /**
     * 更新日期（结束）
     */
    11: optional i64 updateAtEnd,

}

struct TSumupTaskResult {
    1: i32 taskCount
    2: i32 companyCount
}

struct TSumupTotal {
    1: i32 taskType,
    2: string taskTypeName
    3: i32 taskCount
    4: i32 companyCount
    5: string planAtFromTo
    6: string updatedAtFromTo
}
struct TTaskResponse {
    1: base_model.TPageResponse pageResponse,
    2: list<TTask> rows
    /**
    * 今日待办事项统计
    **/
    3: TSumupTaskResult todayTodo,
    /**
    * 超时待办事项统计
    **/
    4: TSumupTaskResult expiredTodo,
    /**
    * 未处理投诉
    **/
    5: TSumupTaskResult unhandleComplaint,
    /**
    * 处理中投诉
    **/
    6: TSumupTaskResult handlingComplaint,
    /**
    * 当前查询条件下的统计结果
    **/
    7: list<TSumupTotal> sumupTotal
}

struct TAttachment {
    /**
     * 附件id(阿里云文件id)
     */
     1: i64 attachmentId,

    /**
     * 附件文件名
     */
     2: string attachmentName
}

struct TTaskItemRequest {
	/**
	 * 意见id
	 */
	3: i32 suggestionId,

	/**
	 * 意见类型
	 */
	4: i32 suggestionType,

	/**
	 * 意见备注
	 */
	5: optional string suggestionRemark
}
struct TCreateTaskRequest {
    /**
     * 父任务id
     */
    2: optional i32 parentTaskId,

    /**
     * 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录
     */
    3: i32 type,
    /**
     * 状态，1：待处理，2: 处理中，3：已处理，4：无需处理
     */
    4: i32 status,
    /**
     * 业务类型id
     */
    5: i32 businessTypeId,

    /**
     * 优先级, 1:高， 2: 中, 3: 低
     */
    6: i32 priority,
    /**
     * 任务主题
     */
    7: string taskSubject,

    /**
     * 关联的公司id
     */
    8: optional i32 companyId,

    /**
     * 沟通姿势/方式, 1: 微信...
     */
    9: optional i32 communicationStyle,

    /**
     * 计划日期
     */
    10: optional i64 planAt,

    /**
     * 经办人
     */
    11: optional i32 handlerId,

    /**
     * 计划或投诉问题
     */
    12: optional string problemDesc,

    /**
     * 结果
     */
    13: optional string resultDesc,
    /**
     * 问题
     **/
    19: optional list<TTaskItemRequest> questions,

    /**
     * 改进措施
     **/
    20: optional list<TTaskItemRequest> improvements,

    /**
     * 附件
     **/
    22: optional TAttachment attachment,

    /**
     * 备注
     **/
    23: optional string remark
}

struct TUpdateTaskRequest {
    /**
     * 任务记录id
     */
    1: i32 taskId,

    /**
     * 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录
     */
    3: i32 type,
    /**
     * 状态，1：待处理，2: 处理中，3：已处理，4：无需处理
     */
    4: i32 status,
    /**
     * 业务类型id
     */
    5: i32 businessTypeId,

    /**
     * 优先级, 1:高， 2: 中, 3: 低
     */
    6: i32 priority,
    /**
     * 任务主题
     */
    7: string taskSubject,

    /**
     * 关联的公司id
     */
    8: optional i32 companyId,

    /**
     * 沟通姿势/方式, 1: 微信...
     */
    9: optional i32 communicationStyle,

    /**
     * 计划日期
     */
    10: optional i64 planAt,

    /**
     * 经办人
     */
    11: optional i32 handlerId,

    /**
     * 计划或投诉问题
     */
    12: optional string problemDesc,

    /**
     * 结果
     */
    13: optional string resultDesc,
    /**
     * 问题
     **/
    19: optional list<TTaskItemRequest> questions,

    /**
     * 改进措施
     **/
    20: optional list<TTaskItemRequest> improvements,

}


struct TSaveTaskRemark {
   1: optional i32 id,

   2: i32 taskId,
   /**
   	 * 备注内容
   	 */
   3: string content
}

struct TCreateTaskLog {
    /**
     * 任务id
     */
    2: i32 taskId,

    /**
     * 操作名
     */
    3: string operation,

    /**
     * 操作字段名
     */
    4: optional string operField,

    /**
     * 原值
     */
    5: optional string oldValue,

    /**
     * 新值
     */
    6: optional string newValue
}

struct TCreateTaskAttachment {
    /**
     * 任务id
     */
    2: i32 taskId,

    /**
     * 附件id(阿里云文件id)
     */
    3: string attachmentId,

    /**
     * 附件文件名
     */
    4: string attachmentName
}

struct TBusinessTypeRequest {
    1: base_model.TPageRequest pageRequest
    /**
     * 业务类型id
     */
    2: optional i32 businessTypeId,

    /**
     * 更新日期（起始）
     */
    3: optional i64 updateAtStart,
    /**
     * 更新日期（结束）
     */
    4: optional i64 updateAtEnd,

}

struct TBusinessTypeResponse {
    1: base_model.TPageResponse pageResponse,
    2: list<TBusinessType> rows
}

struct TSaveBusinessType {

    1: optional i32 id
    /**
	 * 业务类型
	 */
	2: string typeName,

	/**
	 * 指导意见
	 */
	3: optional string suggestionContent,

	/**
	 * 问题， 逗号分隔的suggestions id
	 */
	4: optional string questions,

	/**
	 * 改进措施， 逗号分隔的suggestions id
	 */
	5: optional string improvements
}

struct TSuggestionRequest {
    1: base_model.TPageRequest pageRequest
    /**
     * 意见类型，1: 问题, 2: 改进
     */
    2: optional i32 type,

    /**
     * 标签，多个标签逗号分隔
     */
    3: optional string labels,

    /**
     * 更新日期（起始）
     */
    4: optional i64 updateAtStart,

    /**
     * 更新日期（结束）
     */
    5: optional i64 updateAtEnd
}

struct TSuggestionResponse {
    1: base_model.TPageResponse pageResponse,
    2: list<TSuggestion> rows
}

struct TSaveSuggestion {
    1: optional i32 id,

    /**
     * 意见类型，1: 问题, 2: 改进
     */
    2: i32 type,

    /**
     * 内容
     */
    3: string content,

    /**
     * 标签，多个标签逗号分隔
     */
    4: string labels,

    /**
     * 帮助
     */
    5: optional string assistance,
}

struct TTaskPickerContainer {
    1: i32 id,
    2: string label
}

struct TSuggestion4Picker {
    1: i32 suggestionId,
    2: string suggestionContent,
    3: i32 suggestionType,
    4: string suggestionTypeName
}
