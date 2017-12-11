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

        class TSumupTotalSerializer extends TCommonBeanSerializer[com.isuwang.soa.scala.task.domain.TSumupTotal]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.isuwang.soa.scala.task.domain.TSumupTotal = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var taskType: Int = 0
        var taskTypeName: String = null
        var taskCount: Int = 0
        var companyCount: Int = 0
        var planAtFromTo: String = null
        var updatedAtFromTo: String = null
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => taskType = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 2 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => taskTypeName = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => taskCount = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 4 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => companyCount = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 5 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => planAtFromTo = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 6 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => updatedAtFromTo = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.isuwang.soa.scala.task.domain.TSumupTotal(taskType = taskType,taskTypeName = taskTypeName,taskCount = taskCount,companyCount = companyCount,planAtFromTo = planAtFromTo,updatedAtFromTo = updatedAtFromTo)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.isuwang.soa.scala.task.domain.TSumupTotal, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TSumupTotal"))

      
            {
            val elem0 = bean.taskType 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskType", com.isuwang.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
            oprot.writeI32(elem0)
            oprot.writeFieldEnd
            
            }
            {
            val elem1 = bean.taskTypeName 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskTypeName", com.isuwang.org.apache.thrift.protocol.TType.STRING, 2.asInstanceOf[Short]))
            oprot.writeString(elem1)
            oprot.writeFieldEnd
            
            }
            {
            val elem2 = bean.taskCount 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskCount", com.isuwang.org.apache.thrift.protocol.TType.I32, 3.asInstanceOf[Short]))
            oprot.writeI32(elem2)
            oprot.writeFieldEnd
            
            }
            {
            val elem3 = bean.companyCount 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("companyCount", com.isuwang.org.apache.thrift.protocol.TType.I32, 4.asInstanceOf[Short]))
            oprot.writeI32(elem3)
            oprot.writeFieldEnd
            
            }
            {
            val elem4 = bean.planAtFromTo 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("planAtFromTo", com.isuwang.org.apache.thrift.protocol.TType.STRING, 5.asInstanceOf[Short]))
            oprot.writeString(elem4)
            oprot.writeFieldEnd
            
            }
            {
            val elem5 = bean.updatedAtFromTo 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedAtFromTo", com.isuwang.org.apache.thrift.protocol.TType.STRING, 6.asInstanceOf[Short]))
            oprot.writeString(elem5)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.isuwang.soa.scala.task.domain.TSumupTotal): Unit = {
      
              if(bean.taskTypeName == null)
              throw new SoaException(SoaBaseCode.NotNull, "taskTypeName字段不允许为空")
            
              if(bean.planAtFromTo == null)
              throw new SoaException(SoaBaseCode.NotNull, "planAtFromTo字段不允许为空")
            
              if(bean.updatedAtFromTo == null)
              throw new SoaException(SoaBaseCode.NotNull, "updatedAtFromTo字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.isuwang.soa.scala.task.domain.TSumupTotal): String = if (bean == null) "null" else bean.toString

        }
        
      