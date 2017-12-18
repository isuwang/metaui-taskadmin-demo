const metadata = {
  "serviceMeta": {
    "namespace": "com.isuwang.soa.task.service",
    "name": "TaskAdminService",
    "meta": {"version": "1.0.0", "timeout": 30000},
    "methods": [{
      "name": "findTasks",
      "request": {
        "name": "findTasks_args",
        "fields": [{
          "tag": 1,
          "name": "request",
          "optional": false,
          "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskRequest"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "findTasks_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskResponse"},
          "doc": "",
          "privacy": false
        }]
      },
      "annotations": [{"key": "m.form.url", "value": "/task/taskadmin/findTasks.do"}],
      "isSoaTransactionProcess": false
    }, {
      "name": "findTaskDetailById",
      "request": {
        "name": "findTaskDetailById_args",
        "fields": [{
          "tag": 1,
          "name": "id",
          "optional": false,
          "dataType": {"kind": "INTEGER"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "findTaskDetailById_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskDetail"},
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }, {
      "name": "createTask",
      "request": {
        "name": "createTask_args",
        "fields": [{
          "tag": 1,
          "name": "request",
          "optional": false,
          "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TCreateTaskRequest"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "createTask_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "VOID"},
          "doc": "",
          "privacy": false
        }]
      },
      "annotations": [{"key": "m.form.url", "value": "/task/taskadmin/createTask.do"}, {
        "key": "m.id",
        "value": "task_add"
      }, {"key": "m.operType", "value": "2"}, {"key": "m.type", "value": "domain-action"}, {
        "key": "m.form.title",
        "value": "新增任务"
      }, {"key": "m.name", "value": "新增任务"}],
      "isSoaTransactionProcess": false
    }, {
      "name": "updateTask",
      "request": {
        "name": "updateTask_args",
        "fields": [{
          "tag": 1,
          "name": "request",
          "optional": false,
          "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TUpdateTaskRequest"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "updateTask_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "VOID"},
          "doc": "",
          "privacy": false
        }]
      },
      "annotations": [{"key": "m.form.url", "value": "/task/taskadmin/updateTask.do"}, {
        "key": "m.id",
        "value": "task_update"
      }, {"key": "m.operType", "value": "2"}, {"key": "m.type", "value": "entity-action"}, {
        "key": "m.form.title",
        "value": "编辑任务"
      }, {"key": "m.name", "value": "编辑"}],
      "isSoaTransactionProcess": false
    }, {
      "name": "unbindSubTask",
      "request": {
        "name": "unbindSubTask_args",
        "fields": [{
          "tag": 1,
          "name": "subTaskId",
          "optional": false,
          "dataType": {"kind": "INTEGER"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "unbindSubTask_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "VOID"},
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }, {
      "name": "createTaskRemark",
      "request": {
        "name": "createTaskRemark_args",
        "fields": [{
          "tag": 1,
          "name": "request",
          "optional": false,
          "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TSaveTaskRemark"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "createTaskRemark_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "VOID"},
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }, {
      "name": "updateTaskRemark",
      "request": {
        "name": "updateTaskRemark_args",
        "fields": [{
          "tag": 1,
          "name": "request",
          "optional": false,
          "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TSaveTaskRemark"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "updateTaskRemark_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "VOID"},
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }, {
      "name": "deleteTaskRemark",
      "request": {
        "name": "deleteTaskRemark_args",
        "fields": [{
          "tag": 1,
          "name": "id",
          "optional": false,
          "dataType": {"kind": "INTEGER"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "deleteTaskRemark_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "VOID"},
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }, {
      "name": "createTaskLog",
      "request": {
        "name": "createTaskLog_args",
        "fields": [{
          "tag": 1,
          "name": "request",
          "optional": false,
          "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TCreateTaskLog"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "createTaskLog_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "VOID"},
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }, {
      "name": "createTaskAttachment",
      "request": {
        "name": "createTaskAttachment_args",
        "fields": [{
          "tag": 1,
          "name": "request",
          "optional": false,
          "dataType": {
            "kind": "STRUCT",
            "qualifiedName": "com.isuwang.soa.task.domain.TCreateTaskAttachment"
          },
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "createTaskAttachment_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "INTEGER"},
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }, {
      "name": "deleteTaskAttachment",
      "request": {
        "name": "deleteTaskAttachment_args",
        "fields": [{
          "tag": 1,
          "name": "id",
          "optional": false,
          "dataType": {"kind": "INTEGER"},
          "doc": "",
          "privacy": false
        }]
      },
      "response": {
        "name": "deleteTaskAttachment_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {"kind": "VOID"},
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }, {
      "name": "findAllTaskNos4Picker",
      "request": {"name": "findAllTaskNos4Picker_args", "fields": []},
      "response": {
        "name": "findAllTaskNos4Picker_result",
        "fields": [{
          "tag": 0,
          "name": "success",
          "optional": false,
          "dataType": {
            "kind": "LIST",
            "valueType": {
              "kind": "STRUCT",
              "qualifiedName": "com.isuwang.soa.task.domain.TTaskPickerContainer"
            }
          },
          "doc": "",
          "privacy": false
        }]
      },
      "isSoaTransactionProcess": false
    }],
    "structDefinitions": [{
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskLog",
      "fields": [{
        "tag": 1,
        "name": "id",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "taskId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "operation",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 操作名",
        "privacy": false
      }, {
        "tag": 4,
        "name": "operField",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 操作字段名",
        "privacy": false
      }, {
        "tag": 5,
        "name": "oldValue",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 原值",
        "privacy": false
      }, {
        "tag": 6,
        "name": "newValue",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 新值",
        "privacy": false
      }, {
        "tag": 7,
        "name": "createdAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 8,
        "name": "createdBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 9,
        "name": "updatedAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 10,
        "name": "updatedBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskItem",
      "fields": [{
        "tag": 1,
        "name": "id",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "taskId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "suggestionId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 意见id",
        "privacy": false
      }, {
        "tag": 4,
        "name": "suggestionType",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 意见类型",
        "privacy": false
      }, {
        "tag": 5,
        "name": "suggestionRemark",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 意见备注",
        "privacy": false
      }, {
        "tag": 6,
        "name": "suggestionContent",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 意见内容",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.common.util",
      "name": "TPageRequest",
      "doc": " 分页查询请求包",
      "fields": [{
        "tag": 1,
        "name": "start",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 查询的开始序号（序号从零开始）",
        "privacy": false
      }, {
        "tag": 2,
        "name": "limit",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 返回记录数",
        "privacy": false
      }, {
        "tag": 3,
        "name": "sortFields",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 排序的字段",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TSumupTaskResult",
      "fields": [{
        "tag": 1,
        "name": "taskCount",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {"tag": 2, "name": "companyCount", "optional": false, "dataType": {"kind": "INTEGER"}, "privacy": false}]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskPickerContainer",
      "fields": [{
        "tag": 1,
        "name": "id",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {"tag": 2, "name": "label", "optional": false, "dataType": {"kind": "STRING"}, "privacy": false}]
    }, {
      "namespace": "com.isuwang.soa.common.util",
      "name": "TPageResponse",
      "fields": [{
        "tag": 1,
        "name": "start",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 查询的开始序号（序号从零开始）",
        "privacy": false
      }, {
        "tag": 2,
        "name": "limit",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 最大返回的记录数",
        "privacy": false
      }, {
        "tag": 3,
        "name": "results",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 结果记录数",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskRemark",
      "fields": [{
        "tag": 1,
        "name": "id",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "taskId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "content",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 备注内容",
        "privacy": false
      }, {
        "tag": 4,
        "name": "createdAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 5,
        "name": "createdBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 6,
        "name": "updatedAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 7,
        "name": "updatedBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }, {"tag": 8, "name": "updaterName", "optional": true, "dataType": {"kind": "STRING"}, "privacy": false}]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TAttachment",
      "fields": [{
        "tag": 1,
        "name": "attachmentId",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": " 附件id(阿里云文件id)",
        "privacy": false
      }, {
        "tag": 2,
        "name": "attachmentName",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 附件文件名",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TSaveTaskRemark",
      "fields": [{
        "tag": 1,
        "name": "id",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "taskId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 3,
        "name": "content",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 备注内容",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskRequest",
      "fields": [{
        "tag": 1,
        "name": "pageRequest",
        "optional": false,
        "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.common.util.TPageRequest"},
        "privacy": false
      }, {"tag": 2, "name": "taskNo", "optional": true, "dataType": {"kind": "STRING"}, "privacy": false}, {
        "tag": 3,
        "name": "companyId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 关联的公司id",
        "privacy": false
      }, {
        "tag": 4,
        "name": "type",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录",
        "privacy": false
      }, {
        "tag": 5,
        "name": "businessTypeId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 业务类型id",
        "privacy": false
      }, {
        "tag": 6,
        "name": "status",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 状态，1：待处理，2: 处理中，3：已处理，4：无需处理",
        "privacy": false
      }, {
        "tag": 7,
        "name": "handlerId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 经办人",
        "privacy": false
      }, {
        "tag": 8,
        "name": "planAtStart",
        "optional": true,
        "dataType": {"kind": "LONG"},
        "doc": " 计划日期（起始）",
        "privacy": false
      }, {
        "tag": 9,
        "name": "planAtEnd",
        "optional": true,
        "dataType": {"kind": "LONG"},
        "doc": " 计划日期（结束）",
        "privacy": false
      }, {
        "tag": 10,
        "name": "updateAtStart",
        "optional": true,
        "dataType": {"kind": "LONG"},
        "doc": " 更新日期（起始）",
        "privacy": false
      }, {
        "tag": 11,
        "name": "updateAtEnd",
        "optional": true,
        "dataType": {"kind": "LONG"},
        "doc": " 更新日期（结束）",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TCreateTaskRequest",
      "fields": [{
        "tag": 2,
        "name": "parentTaskId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 父任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "type",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录",
        "privacy": false
      }, {
        "tag": 4,
        "name": "status",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 状态，1：待处理，2: 处理中，3：已处理，4：无需处理",
        "privacy": false
      }, {
        "tag": 5,
        "name": "businessTypeId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 业务类型id",
        "privacy": false
      }, {
        "tag": 6,
        "name": "priority",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 优先级, 1:高， 2: 中, 3: 低",
        "privacy": false
      }, {
        "tag": 7,
        "name": "taskSubject",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 任务主题",
        "privacy": false
      }, {
        "tag": 8,
        "name": "companyId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 关联的公司id",
        "privacy": false
      }, {
        "tag": 9,
        "name": "communicationStyle",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 沟通姿势/方式, 1: 微信...",
        "privacy": false
      }, {
        "tag": 10,
        "name": "planAt",
        "optional": true,
        "dataType": {"kind": "LONG"},
        "doc": " 计划日期",
        "privacy": false
      }, {
        "tag": 11,
        "name": "handlerId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 经办人",
        "privacy": false
      }, {
        "tag": 12,
        "name": "problemDesc",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 计划或投诉问题",
        "privacy": false
      }, {
        "tag": 13,
        "name": "resultDesc",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 结果",
        "privacy": false
      }, {
        "tag": 19,
        "name": "questions",
        "optional": true,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskItemRequest"}
        },
        "doc": " 问题",
        "privacy": false
      }, {
        "tag": 20,
        "name": "improvements",
        "optional": true,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskItemRequest"}
        },
        "doc": " 改进措施",
        "privacy": false
      }, {
        "tag": 22,
        "name": "attachment",
        "optional": true,
        "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TAttachment"},
        "doc": " 附件",
        "privacy": false
      }, {
        "tag": 23,
        "name": "remark",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 备注",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TCreateTaskLog",
      "fields": [{
        "tag": 2,
        "name": "taskId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "operation",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 操作名",
        "privacy": false
      }, {
        "tag": 4,
        "name": "operField",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 操作字段名",
        "privacy": false
      }, {
        "tag": 5,
        "name": "oldValue",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 原值",
        "privacy": false
      }, {
        "tag": 6,
        "name": "newValue",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 新值",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskItemRequest",
      "fields": [{
        "tag": 3,
        "name": "suggestionId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 意见id",
        "privacy": false
      }, {
        "tag": 4,
        "name": "suggestionType",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 意见类型",
        "privacy": false
      }, {
        "tag": 5,
        "name": "suggestionRemark",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 意见备注",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskDetail",
      "fields": [{
        "tag": 1,
        "name": "id",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "parentTaskId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 父任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "taskNo",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 任务编号",
        "privacy": false
      }, {
        "tag": 4,
        "name": "companyId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 关联的公司id",
        "privacy": false
      }, {
        "tag": 5,
        "name": "companyName",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 关联的公司名",
        "privacy": false
      }, {
        "tag": 25,
        "name": "taskSubject",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 任务主题",
        "privacy": false
      }, {
        "tag": 6,
        "name": "status",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 状态，1：待处理，2: 处理中，3：已处理，4：无需处理",
        "privacy": false
      }, {
        "tag": 7,
        "name": "type",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录",
        "privacy": false
      }, {
        "tag": 8,
        "name": "businessTypeId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 业务类型id",
        "privacy": false
      }, {
        "tag": 9,
        "name": "priority",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 优先级, 1:高， 2: 中, 3: 低",
        "privacy": false
      }, {
        "tag": 10,
        "name": "planAt",
        "optional": true,
        "dataType": {"kind": "LONG"},
        "doc": " 计划日期",
        "privacy": false
      }, {
        "tag": 11,
        "name": "communicationStyle",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 沟通姿势/方式, 1: 微信...",
        "privacy": false
      }, {
        "tag": 12,
        "name": "handlerId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 经办人",
        "privacy": false
      }, {
        "tag": 13,
        "name": "problemDesc",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 计划或投诉问题",
        "privacy": false
      }, {
        "tag": 14,
        "name": "resultDesc",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 结果",
        "privacy": false
      }, {
        "tag": 15,
        "name": "createdAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 16,
        "name": "createdBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 17,
        "name": "updatedAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 18,
        "name": "updatedBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 19,
        "name": "questions",
        "optional": false,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskItem"}
        },
        "doc": " 问题",
        "privacy": false
      }, {
        "tag": 20,
        "name": "improvements",
        "optional": false,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskItem"}
        },
        "doc": " 改进措施",
        "privacy": false
      }, {
        "tag": 21,
        "name": "taskLogs",
        "optional": false,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskLog"}
        },
        "doc": " 操作日志",
        "privacy": false
      }, {
        "tag": 22,
        "name": "taskAttachments",
        "optional": false,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskAttachment"}
        },
        "doc": " 附件",
        "privacy": false
      }, {
        "tag": 23,
        "name": "taskRemarks",
        "optional": false,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskRemark"}
        },
        "doc": " 备注",
        "privacy": false
      }, {
        "tag": 24,
        "name": "children",
        "optional": false,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTask"}
        },
        "doc": "  子任务",
        "privacy": false
      }, {
        "tag": 26,
        "name": "handlerName",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 经办人姓名",
        "privacy": false
      }, {
        "tag": 27,
        "name": "parentTask",
        "optional": true,
        "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTask"},
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TUpdateTaskRequest",
      "fields": [{
        "tag": 1,
        "name": "taskId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务记录id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "type",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录",
        "privacy": false
      }, {
        "tag": 4,
        "name": "status",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 状态，1：待处理，2: 处理中，3：已处理，4：无需处理",
        "privacy": false
      }, {
        "tag": 5,
        "name": "businessTypeId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 业务类型id",
        "privacy": false
      }, {
        "tag": 6,
        "name": "priority",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 优先级, 1:高， 2: 中, 3: 低",
        "privacy": false
      }, {
        "tag": 7,
        "name": "taskSubject",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 任务主题",
        "privacy": false
      }, {
        "tag": 8,
        "name": "companyId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 关联的公司id",
        "privacy": false
      }, {
        "tag": 9,
        "name": "communicationStyle",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 沟通姿势/方式, 1: 微信...",
        "privacy": false
      }, {
        "tag": 10,
        "name": "planAt",
        "optional": true,
        "dataType": {"kind": "LONG"},
        "doc": " 计划日期",
        "privacy": false
      }, {
        "tag": 11,
        "name": "handlerId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 经办人",
        "privacy": false
      }, {
        "tag": 12,
        "name": "problemDesc",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 计划或投诉问题",
        "privacy": false
      }, {
        "tag": 13,
        "name": "resultDesc",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 结果",
        "privacy": false
      }, {
        "tag": 19,
        "name": "questions",
        "optional": true,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskItemRequest"}
        },
        "doc": " 问题",
        "privacy": false
      }, {
        "tag": 20,
        "name": "improvements",
        "optional": true,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTaskItemRequest"}
        },
        "doc": " 改进措施",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskResponse",
      "fields": [{
        "tag": 1,
        "name": "pageResponse",
        "optional": false,
        "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.common.util.TPageResponse"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "rows",
        "optional": false,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TTask"}
        },
        "privacy": false
      }, {
        "tag": 3,
        "name": "todayTodo",
        "optional": false,
        "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TSumupTaskResult"},
        "doc": " 今日待办事项统计",
        "privacy": false
      }, {
        "tag": 4,
        "name": "expiredTodo",
        "optional": false,
        "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TSumupTaskResult"},
        "doc": " 超时待办事项统计",
        "privacy": false
      }, {
        "tag": 5,
        "name": "unhandleComplaint",
        "optional": false,
        "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TSumupTaskResult"},
        "doc": " 未处理投诉",
        "privacy": false
      }, {
        "tag": 6,
        "name": "handlingComplaint",
        "optional": false,
        "dataType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TSumupTaskResult"},
        "doc": " 处理中投诉",
        "privacy": false
      }, {
        "tag": 7,
        "name": "sumupTotal",
        "optional": false,
        "dataType": {
          "kind": "LIST",
          "valueType": {"kind": "STRUCT", "qualifiedName": "com.isuwang.soa.task.domain.TSumupTotal"}
        },
        "doc": " 当前查询条件下的统计结果",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTask",
      "fields": [{
        "tag": 1,
        "name": "id",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "parentTaskId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 父任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "taskNo",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 任务编号",
        "privacy": false
      }, {
        "tag": 4,
        "name": "companyId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 关联的公司id",
        "privacy": false
      }, {
        "tag": 5,
        "name": "companyName",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 关联的公司名",
        "privacy": false
      }, {
        "tag": 25,
        "name": "taskSubject",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 任务主题",
        "privacy": false
      }, {
        "tag": 6,
        "name": "status",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 状态，1：待处理，2: 处理中，3：已处理，4：无需处理",
        "privacy": false
      }, {
        "tag": 7,
        "name": "type",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录",
        "privacy": false
      }, {
        "tag": 8,
        "name": "businessTypeId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 业务类型id",
        "privacy": false
      }, {
        "tag": 9,
        "name": "businessTypeName",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "privacy": false
      }, {
        "tag": 10,
        "name": "priority",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 优先级, 1:高， 2: 中, 3: 低",
        "privacy": false
      }, {
        "tag": 11,
        "name": "planAt",
        "optional": true,
        "dataType": {"kind": "LONG"},
        "doc": " 计划日期",
        "privacy": false
      }, {
        "tag": 12,
        "name": "communicationStyle",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 沟通姿势/方式, 1: 微信...",
        "privacy": false
      }, {
        "tag": 13,
        "name": "handlerId",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": " 经办人",
        "privacy": false
      }, {
        "tag": 14,
        "name": "problemDesc",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 计划或投诉问题",
        "privacy": false
      }, {
        "tag": 15,
        "name": "resultDesc",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 结果",
        "privacy": false
      }, {
        "tag": 16,
        "name": "createdAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 17,
        "name": "createdBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 18,
        "name": "updatedAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 19,
        "name": "updatedBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 26,
        "name": "handlerName",
        "optional": true,
        "dataType": {"kind": "STRING"},
        "doc": " 经办人姓名",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TTaskAttachment",
      "fields": [{
        "tag": 1,
        "name": "id",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "taskId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "attachmentId",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 附件id(阿里云文件id)",
        "privacy": false
      }, {
        "tag": 4,
        "name": "attachmentName",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 附件文件名",
        "privacy": false
      }, {
        "tag": 5,
        "name": "createdAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 6,
        "name": "createdBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 7,
        "name": "updatedAt",
        "optional": false,
        "dataType": {"kind": "LONG"},
        "doc": "",
        "privacy": false
      }, {
        "tag": 8,
        "name": "updatedBy",
        "optional": true,
        "dataType": {"kind": "INTEGER"},
        "doc": "",
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TSumupTotal",
      "fields": [{
        "tag": 1,
        "name": "taskType",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 2,
        "name": "taskTypeName",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "privacy": false
      }, {
        "tag": 3,
        "name": "taskCount",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 4,
        "name": "companyCount",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "privacy": false
      }, {
        "tag": 5,
        "name": "planAtFromTo",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "privacy": false
      }, {
        "tag": 6,
        "name": "updatedAtFromTo",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "privacy": false
      }]
    }, {
      "namespace": "com.isuwang.soa.task.domain",
      "name": "TCreateTaskAttachment",
      "fields": [{
        "tag": 2,
        "name": "taskId",
        "optional": false,
        "dataType": {"kind": "INTEGER"},
        "doc": " 任务id",
        "privacy": false
      }, {
        "tag": 3,
        "name": "attachmentId",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 附件id(阿里云文件id)",
        "privacy": false
      }, {
        "tag": 4,
        "name": "attachmentName",
        "optional": false,
        "dataType": {"kind": "STRING"},
        "doc": " 附件文件名",
        "privacy": false
      }]
    }],
    "enumDefinitions": []
  },
  "fieldsInStruct": {
    "com.isuwang.soa.task.domain.TTask": [{
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "communicationStyle",
      "label": "沟通方式",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "handlerName",
      "label": "经办人",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "problemDesc",
      "label": "problemDesc",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "resultDesc",
      "label": "resultDesc",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "createdAt",
      "label": "createdAt",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "createdBy",
      "label": "createdBy",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "updatedAt",
      "label": "更新时间",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "updater",
      "label": "updatedBy",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "questions",
      "label": "questions",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "improvements",
      "label": "improvements",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "taskLogs",
      "label": "taskLogs",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "taskAttachments",
      "label": "taskAttachments",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "taskRemarks",
      "label": "taskRemarks",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "companyName",
      "label": "公司名",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "taskNo",
      "label": "任务编号",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "taskSubject",
      "label": "标题",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "status",
      "label": "状态",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "type",
      "label": "任务类型",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "companyId",
      "label": "companyId",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "businessTypeName",
      "label": "业务类型",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "priority",
      "label": "优先级",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTask",
      "name": "planAt",
      "label": "计划时间",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }],
    "com.isuwang.soa.task.domain.TCreateTaskRequest": [{
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "name": "parentTaskId",
      "label": "parentTaskId",
      "required": false,
      "multi": false,
      "editable": false,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-select-list",
      "name": "type",
      "label": "任务类型",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"待办事项\",\"value\":1},{\"label\":\"投诉\",\"value\":2},{\"label\":\"回访记录\",\"value\":3}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-select-list",
      "name": "status",
      "label": "状态",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"待处理\",\"value\":1},{\"label\":\"处理中\",\"value\":2},{\"label\":\"已处理\",\"value\":3},{\"label\":\"无需处理\",\"value\":4}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-task-business-type-picker",
      "name": "businessTypeId",
      "label": "业务类型",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-select-list",
      "name": "priority",
      "label": "优先级",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"高\",\"value\":1},{\"label\":\"中\",\"value\":2},{\"label\":\"低\",\"value\":3}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-text-area",
      "name": "taskSubject",
      "label": "标题",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-select-list",
      "name": "communicationStyle",
      "label": "沟通方式 ",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"微信\",\"value\":1},{\"label\":\"QQ\",\"value\":2},{\"label\":\"短信\",\"value\":3},{\"label\":\"电话\",\"value\":4},{\"label\":\"实地拜访\",\"value\":5},{\"label\":\"其它\",\"value\":6}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-date",
      "name": "planAt",
      "label": "计划日期",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-text-area",
      "name": "problemDesc",
      "label": "任务问题",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-question-input",
      "name": "questions",
      "label": "问题",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-improvement-input",
      "name": "improvements",
      "label": "改进措施",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-file",
      "name": "attachment",
      "label": "附件",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-text-area",
      "name": "remark",
      "label": "备注",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TCreateTaskRequest",
      "element": "m2-text-area",
      "name": "resultDesc",
      "label": "处理结果",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }],
    "com.isuwang.soa.task.domain.TUpdateTaskRequest": [{
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-select",
      "name": "priority",
      "label": "优先级",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"高\",\"value\":1},{\"label\":\"中\",\"value\":2},{\"label\":\"低\",\"value\":3}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-select",
      "name": "communicationStyle",
      "label": "沟通方式",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"微信\",\"value\":1},{\"label\":\"QQ\",\"value\":2},{\"label\":\"短信\",\"value\":3},{\"label\":\"电话\",\"value\":4},{\"label\":\"实地拜访\",\"value\":5},{\"label\":\"其它\",\"value\":6}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-select",
      "name": "status",
      "label": "状态",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"待处理\",\"value\":1},{\"label\":\"处理中\",\"value\":2},{\"label\":\"已处理\",\"value\":3},{\"label\":\"无需处理\",\"value\":4}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-select",
      "name": "type",
      "label": "任务类型",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"待办事项\",\"value\":1},{\"label\":\"投诉\",\"value\":2},{\"label\":\"回访记录\",\"value\":3}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "name": "taskId",
      "label": "taskId",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "srcKey": "id",
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "name": "parentTaskId",
      "label": "parentTaskId",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-task-business-type-picker",
      "name": "businessTypeId",
      "label": "业务类型",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-textarea",
      "name": "taskSubject",
      "label": "标题",
      "required": true,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-company-picker",
      "name": "companyId",
      "label": "公司",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-input-date",
      "name": "planAt",
      "label": "计划日期",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-staff-picker",
      "name": "handlerId",
      "label": "经办人",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-textarea",
      "name": "problemDesc",
      "label": "任务问题",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-textarea",
      "name": "resultDesc",
      "label": "处理结果",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-question-input",
      "name": "questions",
      "label": "问题",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-improvement-input",
      "name": "improvements",
      "label": "改进措施",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "name": "attachment",
      "label": "附件",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TUpdateTaskRequest",
      "element": "o2-textarea",
      "name": "remark",
      "label": "备注",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": false,
      "disabled": false
    }],
    "com.isuwang.soa.task.domain.TTaskRequest": [{
      "structName": "com.isuwang.soa.task.domain.TTaskRequest",
      "element": "m2-task-picker",
      "name": "taskNo",
      "label": "任务编号",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTaskRequest",
      "element": "m2-select-list",
      "name": "type",
      "label": "任务类型",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"待办事项\",\"value\":1},{\"label\":\"投诉\",\"value\":2},{\"label\":\"回访记录\",\"value\":3}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTaskRequest",
      "element": "m2-task-business-type-picker",
      "name": "businessTypeId",
      "label": "业务类型",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "",
      "candidateLabel": "",
      "candidateValue": "",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTaskRequest",
      "element": "m2-select-list",
      "name": "status",
      "label": "状态",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "candidates": "[{\"label\":\"待处理\",\"value\":1},{\"label\":\"处理中\",\"value\":2},{\"label\":\"已处理\",\"value\":3},{\"label\":\"无需处理\",\"value\":4}]",
      "candidateLabel": "label",
      "candidateValue": "value",
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTaskRequest",
      "element": "m2-date",
      "name": "planAtStart",
      "label": "计划日期",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTaskRequest",
      "element": "m2-date",
      "name": "planAtEnd",
      "label": "至",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTaskRequest",
      "element": "m2-date",
      "name": "updateAtStart",
      "label": "更新日期",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }, {
      "structName": "com.isuwang.soa.task.domain.TTaskRequest",
      "element": "m2-date",
      "name": "updateAtEnd",
      "label": "至",
      "required": false,
      "multi": false,
      "editable": true,
      "validate": false,
      "length": 0,
      "maxLength": 0,
      "minLength": 0,
      "min": 0,
      "max": 0,
      "visible": true,
      "disabled": false
    }]
  }
}

export {metadata}