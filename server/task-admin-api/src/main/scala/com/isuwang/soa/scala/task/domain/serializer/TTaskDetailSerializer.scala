 package com.isuwang.soa.scala.task.domain.serializer;

        import com.isuwang.soa.scala.common.util.serializer._;import com.isuwang.soa.scala.task.domain.serializer._;
        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.org.apache.thrift.protocol._

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/

        class TTaskDetailSerializer extends TCommonBeanSerializer[com.isuwang.soa.scala.task.domain.TTaskDetail]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.isuwang.soa.scala.task.domain.TTaskDetail = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var id: Int = 0
        var parentTaskId: Option[Int] = None
        var taskNo: String = null
        var companyId: Option[Int] = None
        var companyName: Option[String] = None
        var taskSubject: String = null
        var status: Int = 0
        var `type`: Int = 0
        var businessTypeId: Int = 0
        var priority: Int = 0
        var planAt: Option[Long] = None
        var communicationStyle: Option[Int] = None
        var handlerId: Option[Int] = None
        var problemDesc: Option[String] = None
        var resultDesc: Option[String] = None
        var createdAt: Long = 0
        var createdBy: Option[Int] = None
        var updatedAt: Long = 0
        var updatedBy: Option[Int] = None
        var questions: List[com.isuwang.soa.scala.task.domain.TTaskItem] = List.empty
        var improvements: List[com.isuwang.soa.scala.task.domain.TTaskItem] = List.empty
        var taskLogs: List[com.isuwang.soa.scala.task.domain.TTaskLog] = List.empty
        var taskAttachments: List[com.isuwang.soa.scala.task.domain.TTaskAttachment] = List.empty
        var taskRemarks: List[com.isuwang.soa.scala.task.domain.TTaskRemark] = List.empty
        var children: List[com.isuwang.soa.scala.task.domain.TTask] = List.empty
        var handlerName: Option[String] = None
        var parentTask: Option[com.isuwang.soa.scala.task.domain.TTask] = None
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => id = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 2 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => parentTaskId = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => taskNo = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 4 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => companyId = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 5 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => companyName = Option(iprot.readString)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 25 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => taskSubject = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 6 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => status = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 7 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => `type` = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 8 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => businessTypeId = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 9 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => priority = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 10 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I64 => planAt = Option(iprot.readI64)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 11 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => communicationStyle = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 12 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => handlerId = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 13 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => problemDesc = Option(iprot.readString)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 14 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => resultDesc = Option(iprot.readString)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 15 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I64 => createdAt = iprot.readI64
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 16 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => createdBy = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 17 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I64 => updatedAt = iprot.readI64
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 18 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => updatedBy = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 19 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => questions = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskItemSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 20 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => improvements = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskItemSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 21 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => taskLogs = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskLogSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 22 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => taskAttachments = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskAttachmentSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 23 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => taskRemarks = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskRemarkSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 24 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => children = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 26 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => handlerName = Option(iprot.readString)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 27 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => parentTask = Option(new com.isuwang.soa.scala.task.domain.serializer.TTaskSerializer().read(iprot))
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.isuwang.soa.scala.task.domain.TTaskDetail(id = id,parentTaskId = parentTaskId,taskNo = taskNo,companyId = companyId,companyName = companyName,taskSubject = taskSubject,status = status,`type` = `type`,businessTypeId = businessTypeId,priority = priority,planAt = planAt,communicationStyle = communicationStyle,handlerId = handlerId,problemDesc = problemDesc,resultDesc = resultDesc,createdAt = createdAt,createdBy = createdBy,updatedAt = updatedAt,updatedBy = updatedBy,questions = questions,improvements = improvements,taskLogs = taskLogs,taskAttachments = taskAttachments,taskRemarks = taskRemarks,children = children,handlerName = handlerName,parentTask = parentTask)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.isuwang.soa.scala.task.domain.TTaskDetail, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TTaskDetail"))

      
            {
            val elem0 = bean.id 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
            oprot.writeI32(elem0)
            oprot.writeFieldEnd
            
            }
            if(bean.parentTaskId.isDefined){
            val elem1 = bean.parentTaskId .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("parentTaskId", com.isuwang.org.apache.thrift.protocol.TType.I32, 2.asInstanceOf[Short]))
            oprot.writeI32(elem1)
            oprot.writeFieldEnd
            
            }
            {
            val elem2 = bean.taskNo 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskNo", com.isuwang.org.apache.thrift.protocol.TType.STRING, 3.asInstanceOf[Short]))
            oprot.writeString(elem2)
            oprot.writeFieldEnd
            
            }
            if(bean.companyId.isDefined){
            val elem3 = bean.companyId .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("companyId", com.isuwang.org.apache.thrift.protocol.TType.I32, 4.asInstanceOf[Short]))
            oprot.writeI32(elem3)
            oprot.writeFieldEnd
            
            }
            if(bean.companyName.isDefined){
            val elem4 = bean.companyName .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("companyName", com.isuwang.org.apache.thrift.protocol.TType.STRING, 5.asInstanceOf[Short]))
            oprot.writeString(elem4)
            oprot.writeFieldEnd
            
            }
            {
            val elem5 = bean.taskSubject 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskSubject", com.isuwang.org.apache.thrift.protocol.TType.STRING, 25.asInstanceOf[Short]))
            oprot.writeString(elem5)
            oprot.writeFieldEnd
            
            }
            {
            val elem6 = bean.status 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("status", com.isuwang.org.apache.thrift.protocol.TType.I32, 6.asInstanceOf[Short]))
            oprot.writeI32(elem6)
            oprot.writeFieldEnd
            
            }
            {
            val elem7 = bean.`type` 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("`type`", com.isuwang.org.apache.thrift.protocol.TType.I32, 7.asInstanceOf[Short]))
            oprot.writeI32(elem7)
            oprot.writeFieldEnd
            
            }
            {
            val elem8 = bean.businessTypeId 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("businessTypeId", com.isuwang.org.apache.thrift.protocol.TType.I32, 8.asInstanceOf[Short]))
            oprot.writeI32(elem8)
            oprot.writeFieldEnd
            
            }
            {
            val elem9 = bean.priority 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("priority", com.isuwang.org.apache.thrift.protocol.TType.I32, 9.asInstanceOf[Short]))
            oprot.writeI32(elem9)
            oprot.writeFieldEnd
            
            }
            if(bean.planAt.isDefined){
            val elem10 = bean.planAt .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("planAt", com.isuwang.org.apache.thrift.protocol.TType.I64, 10.asInstanceOf[Short]))
            oprot.writeI64(elem10)
            oprot.writeFieldEnd
            
            }
            if(bean.communicationStyle.isDefined){
            val elem11 = bean.communicationStyle .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("communicationStyle", com.isuwang.org.apache.thrift.protocol.TType.I32, 11.asInstanceOf[Short]))
            oprot.writeI32(elem11)
            oprot.writeFieldEnd
            
            }
            if(bean.handlerId.isDefined){
            val elem12 = bean.handlerId .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("handlerId", com.isuwang.org.apache.thrift.protocol.TType.I32, 12.asInstanceOf[Short]))
            oprot.writeI32(elem12)
            oprot.writeFieldEnd
            
            }
            if(bean.problemDesc.isDefined){
            val elem13 = bean.problemDesc .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("problemDesc", com.isuwang.org.apache.thrift.protocol.TType.STRING, 13.asInstanceOf[Short]))
            oprot.writeString(elem13)
            oprot.writeFieldEnd
            
            }
            if(bean.resultDesc.isDefined){
            val elem14 = bean.resultDesc .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("resultDesc", com.isuwang.org.apache.thrift.protocol.TType.STRING, 14.asInstanceOf[Short]))
            oprot.writeString(elem14)
            oprot.writeFieldEnd
            
            }
            {
            val elem15 = bean.createdAt 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdAt", com.isuwang.org.apache.thrift.protocol.TType.I64, 15.asInstanceOf[Short]))
            oprot.writeI64(elem15)
            oprot.writeFieldEnd
            
            }
            if(bean.createdBy.isDefined){
            val elem16 = bean.createdBy .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdBy", com.isuwang.org.apache.thrift.protocol.TType.I32, 16.asInstanceOf[Short]))
            oprot.writeI32(elem16)
            oprot.writeFieldEnd
            
            }
            {
            val elem17 = bean.updatedAt 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedAt", com.isuwang.org.apache.thrift.protocol.TType.I64, 17.asInstanceOf[Short]))
            oprot.writeI64(elem17)
            oprot.writeFieldEnd
            
            }
            if(bean.updatedBy.isDefined){
            val elem18 = bean.updatedBy .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedBy", com.isuwang.org.apache.thrift.protocol.TType.I32, 18.asInstanceOf[Short]))
            oprot.writeI32(elem18)
            oprot.writeFieldEnd
            
            }
            {
            val elem19 = bean.questions 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("questions", com.isuwang.org.apache.thrift.protocol.TType.LIST, 19.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem19.size))
        elem19.foreach(elem20 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskItemSerializer().write(elem20, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
            {
            val elem20 = bean.improvements 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("improvements", com.isuwang.org.apache.thrift.protocol.TType.LIST, 20.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem20.size))
        elem20.foreach(elem21 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskItemSerializer().write(elem21, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
            {
            val elem21 = bean.taskLogs 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskLogs", com.isuwang.org.apache.thrift.protocol.TType.LIST, 21.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem21.size))
        elem21.foreach(elem22 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskLogSerializer().write(elem22, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
            {
            val elem22 = bean.taskAttachments 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskAttachments", com.isuwang.org.apache.thrift.protocol.TType.LIST, 22.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem22.size))
        elem22.foreach(elem23 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskAttachmentSerializer().write(elem23, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
            {
            val elem23 = bean.taskRemarks 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskRemarks", com.isuwang.org.apache.thrift.protocol.TType.LIST, 23.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem23.size))
        elem23.foreach(elem24 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskRemarkSerializer().write(elem24, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
            {
            val elem24 = bean.children 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("children", com.isuwang.org.apache.thrift.protocol.TType.LIST, 24.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem24.size))
        elem24.foreach(elem25 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskSerializer().write(elem25, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
            if(bean.handlerName.isDefined){
            val elem25 = bean.handlerName .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("handlerName", com.isuwang.org.apache.thrift.protocol.TType.STRING, 26.asInstanceOf[Short]))
            oprot.writeString(elem25)
            oprot.writeFieldEnd
            
            }
            if(bean.parentTask.isDefined){
            val elem26 = bean.parentTask .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("parentTask", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 27.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TTaskSerializer().write(elem26, oprot)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.isuwang.soa.scala.task.domain.TTaskDetail): Unit = {
      
              if(bean.taskNo == null)
              throw new SoaException(SoaBaseCode.NotNull, "taskNo字段不允许为空")
            
              if(bean.taskSubject == null)
              throw new SoaException(SoaBaseCode.NotNull, "taskSubject字段不允许为空")
            
              if(bean.questions == null)
              throw new SoaException(SoaBaseCode.NotNull, "questions字段不允许为空")
            
              if(bean.improvements == null)
              throw new SoaException(SoaBaseCode.NotNull, "improvements字段不允许为空")
            
              if(bean.taskLogs == null)
              throw new SoaException(SoaBaseCode.NotNull, "taskLogs字段不允许为空")
            
              if(bean.taskAttachments == null)
              throw new SoaException(SoaBaseCode.NotNull, "taskAttachments字段不允许为空")
            
              if(bean.taskRemarks == null)
              throw new SoaException(SoaBaseCode.NotNull, "taskRemarks字段不允许为空")
            
              if(bean.children == null)
              throw new SoaException(SoaBaseCode.NotNull, "children字段不允许为空")
            
                if(bean.parentTask.isDefined)
                new com.isuwang.soa.scala.task.domain.serializer.TTaskSerializer().validate(bean.parentTask.get)
              
    }
    

          @throws[TException]
          override def toString(bean: com.isuwang.soa.scala.task.domain.TTaskDetail): String = if (bean == null) "null" else bean.toString

        }
        
      