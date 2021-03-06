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

        class TUpdateTaskRequestSerializer extends TCommonBeanSerializer[com.isuwang.soa.scala.task.domain.TUpdateTaskRequest]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.isuwang.soa.scala.task.domain.TUpdateTaskRequest = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var taskId: Int = 0
        var `type`: Int = 0
        var status: Int = 0
        var businessTypeId: Int = 0
        var priority: Int = 0
        var taskSubject: String = null
        var companyId: Option[Int] = None
        var communicationStyle: Option[Int] = None
        var planAt: Option[Long] = None
        var handlerId: Option[Int] = None
        var problemDesc: Option[String] = None
        var resultDesc: Option[String] = None
        var questions: Option[List[com.isuwang.soa.scala.task.domain.TTaskItemRequest]] = None
        var improvements: Option[List[com.isuwang.soa.scala.task.domain.TTaskItemRequest]] = None
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => taskId = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => `type` = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 4 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => status = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 5 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => businessTypeId = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 6 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => priority = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 7 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => taskSubject = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 8 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => companyId = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 9 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => communicationStyle = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 10 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I64 => planAt = Option(iprot.readI64)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 11 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => handlerId = Option(iprot.readI32)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 12 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => problemDesc = Option(iprot.readString)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 13 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => resultDesc = Option(iprot.readString)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 19 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => questions = Option({
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskItemRequestSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        })
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 20 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => improvements = Option({
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskItemRequestSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        })
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.isuwang.soa.scala.task.domain.TUpdateTaskRequest(taskId = taskId,`type` = `type`,status = status,businessTypeId = businessTypeId,priority = priority,taskSubject = taskSubject,companyId = companyId,communicationStyle = communicationStyle,planAt = planAt,handlerId = handlerId,problemDesc = problemDesc,resultDesc = resultDesc,questions = questions,improvements = improvements)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.isuwang.soa.scala.task.domain.TUpdateTaskRequest, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TUpdateTaskRequest"))

      
            {
            val elem0 = bean.taskId 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskId", com.isuwang.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
            oprot.writeI32(elem0)
            oprot.writeFieldEnd
            
            }
            {
            val elem1 = bean.`type` 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("`type`", com.isuwang.org.apache.thrift.protocol.TType.I32, 3.asInstanceOf[Short]))
            oprot.writeI32(elem1)
            oprot.writeFieldEnd
            
            }
            {
            val elem2 = bean.status 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("status", com.isuwang.org.apache.thrift.protocol.TType.I32, 4.asInstanceOf[Short]))
            oprot.writeI32(elem2)
            oprot.writeFieldEnd
            
            }
            {
            val elem3 = bean.businessTypeId 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("businessTypeId", com.isuwang.org.apache.thrift.protocol.TType.I32, 5.asInstanceOf[Short]))
            oprot.writeI32(elem3)
            oprot.writeFieldEnd
            
            }
            {
            val elem4 = bean.priority 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("priority", com.isuwang.org.apache.thrift.protocol.TType.I32, 6.asInstanceOf[Short]))
            oprot.writeI32(elem4)
            oprot.writeFieldEnd
            
            }
            {
            val elem5 = bean.taskSubject 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskSubject", com.isuwang.org.apache.thrift.protocol.TType.STRING, 7.asInstanceOf[Short]))
            oprot.writeString(elem5)
            oprot.writeFieldEnd
            
            }
            if(bean.companyId.isDefined){
            val elem6 = bean.companyId .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("companyId", com.isuwang.org.apache.thrift.protocol.TType.I32, 8.asInstanceOf[Short]))
            oprot.writeI32(elem6)
            oprot.writeFieldEnd
            
            }
            if(bean.communicationStyle.isDefined){
            val elem7 = bean.communicationStyle .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("communicationStyle", com.isuwang.org.apache.thrift.protocol.TType.I32, 9.asInstanceOf[Short]))
            oprot.writeI32(elem7)
            oprot.writeFieldEnd
            
            }
            if(bean.planAt.isDefined){
            val elem8 = bean.planAt .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("planAt", com.isuwang.org.apache.thrift.protocol.TType.I64, 10.asInstanceOf[Short]))
            oprot.writeI64(elem8)
            oprot.writeFieldEnd
            
            }
            if(bean.handlerId.isDefined){
            val elem9 = bean.handlerId .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("handlerId", com.isuwang.org.apache.thrift.protocol.TType.I32, 11.asInstanceOf[Short]))
            oprot.writeI32(elem9)
            oprot.writeFieldEnd
            
            }
            if(bean.problemDesc.isDefined){
            val elem10 = bean.problemDesc .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("problemDesc", com.isuwang.org.apache.thrift.protocol.TType.STRING, 12.asInstanceOf[Short]))
            oprot.writeString(elem10)
            oprot.writeFieldEnd
            
            }
            if(bean.resultDesc.isDefined){
            val elem11 = bean.resultDesc .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("resultDesc", com.isuwang.org.apache.thrift.protocol.TType.STRING, 13.asInstanceOf[Short]))
            oprot.writeString(elem11)
            oprot.writeFieldEnd
            
            }
            if(bean.questions.isDefined){
            val elem12 = bean.questions .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("questions", com.isuwang.org.apache.thrift.protocol.TType.LIST, 19.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem12.size))
        elem12.foreach(elem13 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskItemRequestSerializer().write(elem13, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
            if(bean.improvements.isDefined){
            val elem13 = bean.improvements .get
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("improvements", com.isuwang.org.apache.thrift.protocol.TType.LIST, 20.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem13.size))
        elem13.foreach(elem14 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskItemRequestSerializer().write(elem14, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.isuwang.soa.scala.task.domain.TUpdateTaskRequest): Unit = {
      
              if(bean.taskSubject == null)
              throw new SoaException(SoaBaseCode.NotNull, "taskSubject字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.isuwang.soa.scala.task.domain.TUpdateTaskRequest): String = if (bean == null) "null" else bean.toString

        }
        
      