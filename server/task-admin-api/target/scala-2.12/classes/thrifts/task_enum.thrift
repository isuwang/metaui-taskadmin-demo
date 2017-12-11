namespace java com.isuwang.soa.task.enums

enum TaskStatus {
    /**
     *待处理
     **/
    SUSPENDING = 1,
    /**
    *处理中
    **/
    HANDLING = 2,
    /**
    * 已处理
**/
    SOLVED = 3,
    /**
    * 无需处理
**/
    NEEDLESS_TO_HANDLE = 4
}

enum TaskType {
     /**
       *待办事项
      **/
     TODO = 1,
     /**
     * 投诉
    **/
     COMPLAINT = 2,
     /**
     * 回访记录
     */
     REVIEW_RECORD = 3
}

enum SuggestionType {
    /**
    * 问题
    **/
    QUESTION = 1,
    /**
    * 改进
    **/
    IMPROVEMENT = 2
}

enum TaskPriority {
    /**
    * 高
    **/
    HIGH = 1,
    /**
    * 中
    **/
    MEDIUM = 2,
    /**
    * 低
    **/
    LOW = 3
}

enum TaskCommunicationStyle {
    /**
    * 上门拜访
    **/
    VISIT = 1,
    /**
    * 电话
    **/
    PHONE = 2,
    /**
    * 微信
    **/
    WECHAT = 3,
    /**
    * QQ
    **/
    QQ = 4,
    /**
    * 短信
    **/
    SMS = 5,
    /**
    * 其他
    **/
    OTHER = 6
}