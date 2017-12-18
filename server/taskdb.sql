CREATE DATABASE /*!32312 IF NOT EXISTS*/ `taskdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `taskdb`;

--
-- Table structure for table `business_type`
--

DROP TABLE IF EXISTS `business_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `business_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(50) NOT NULL COMMENT '业务类型',
  `suggestion_content` varchar(500) DEFAULT NULL COMMENT '指导意见',
  `questions` varchar(100) DEFAULT NULL COMMENT '问题， 逗号分隔的suggestions id',
  `improvements` varchar(100) DEFAULT NULL COMMENT '改进措施， 逗号分隔的suggestions id',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='业务类型表';


--
-- Table structure for table `suggestion`
--

DROP TABLE IF EXISTS `suggestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suggestion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` smallint(1) NOT NULL COMMENT '意见类型,1:问题(QUESTION);2:改进(IMPROVEMENT)',
  `content` varchar(50) NOT NULL COMMENT '内容',
  `labels` varchar(50) DEFAULT '',
  `assistance` varchar(50) DEFAULT '',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='意见标准库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_task_id` int(11) DEFAULT NULL COMMENT '父任务id',
  `task_no` varchar(20) NOT NULL COMMENT '任务编号',
  `company_id` int(11) DEFAULT NULL COMMENT '关联的公司id',
  `task_subject` varchar(100) NOT NULL COMMENT '任务主题',
  `status` smallint(1) NOT NULL COMMENT '状态,1:待处理(SUSPENDING);2:处理中(HANDLING);3:已处理(SOLVED);4:无需处理(NEEDLESS_TO_HANDLE);',
  `type` smallint(1) NOT NULL COMMENT '任务类型,1:待办事项(TODO);2:投诉(COMPLAINT);3:回访记录(REVIEW_RECORD);',
  `business_type_id` int(11) NOT NULL COMMENT '业务类型id',
  `priority` smallint(1) NOT NULL COMMENT '优先级,1:高(HIGH);2:中(MEDIUM);3:低(LOW)',
  `plan_at` datetime DEFAULT NULL COMMENT '计划日期',
  `communication_style` smallint(1) DEFAULT NULL COMMENT '沟通姿势/方式,1:上门拜访(VISIT);2:电话(PHONE);3:微信(WECHAT);4:QQ(QQ);5:短信(SMS);6:其他(OTHER);',
  `handler_id` int(11) DEFAULT NULL COMMENT '经办人',
  `problem_desc` varchar(500) DEFAULT '',
  `result_desc` varchar(500) DEFAULT '',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL,
  `handler_name` varchar(20) DEFAULT NULL COMMENT '经办人姓名（冗余字段，以方便查询）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 COMMENT='任务表';
/*!40101 SET character_set_client = @saved_cs_client */;



DROP TABLE IF EXISTS `task_attachment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task_attachment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_id` int(11) NOT NULL COMMENT '任务id',
  `attachment_id` varchar(40) NOT NULL COMMENT '附件id(阿里云文件id)',
  `attachment_name` varchar(50) NOT NULL COMMENT '附件文件名',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='任务附件表';
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `task_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_id` int(11) NOT NULL COMMENT '任务id',
  `suggestion_id` int(11) NOT NULL COMMENT '意见id',
  `suggestion_type` smallint(1) NOT NULL COMMENT '意见类型，1: 问题, 2: 改进（冗余字段，为了方便查询区分问题的类型）',
  `suggestion_remark` varchar(100) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=934 DEFAULT CHARSET=utf8 COMMENT='任务子信息表';
/*!40101 SET character_set_client = @saved_cs_client */;



DROP TABLE IF EXISTS `task_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_id` int(11) NOT NULL COMMENT '任务id',
  `operation` varchar(10) NOT NULL COMMENT '操作名',
  `oper_field` varchar(20) DEFAULT NULL COMMENT '操作字段名',
  `old_value` varchar(500) DEFAULT NULL COMMENT '原值',
  `new_value` varchar(500) DEFAULT NULL COMMENT '新值',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=283 DEFAULT CHARSET=utf8 COMMENT='任务日志表';
/*!40101 SET character_set_client = @saved_cs_client */;



DROP TABLE IF EXISTS `task_remark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task_remark` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_id` int(11) NOT NULL COMMENT '任务id',
  `content` varchar(500) NOT NULL COMMENT '备注内容',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` int(11) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(11) DEFAULT NULL,
  `updater_name` varchar(20) DEFAULT NULL COMMENT '更新人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='任务备注表';