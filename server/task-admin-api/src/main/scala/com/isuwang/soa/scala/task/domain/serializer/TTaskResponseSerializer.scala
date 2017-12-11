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

        class TTaskResponseSerializer extends TCommonBeanSerializer[com.isuwang.soa.scala.task.domain.TTaskResponse]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.isuwang.soa.scala.task.domain.TTaskResponse = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var pageResponse: com.isuwang.soa.scala.common.util.TPageResponse = null
        var rows: List[com.isuwang.soa.scala.task.domain.TTask] = List.empty
        var todayTodo: com.isuwang.soa.scala.task.domain.TSumupTaskResult = null
        var expiredTodo: com.isuwang.soa.scala.task.domain.TSumupTaskResult = null
        var unhandleComplaint: com.isuwang.soa.scala.task.domain.TSumupTaskResult = null
        var handlingComplaint: com.isuwang.soa.scala.task.domain.TSumupTaskResult = null
        var sumupTotal: List[com.isuwang.soa.scala.task.domain.TSumupTotal] = List.empty
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => pageResponse = new com.isuwang.soa.scala.common.util.serializer.TPageResponseSerializer().read(iprot)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 2 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => rows = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TTaskSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => todayTodo = new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().read(iprot)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 4 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => expiredTodo = new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().read(iprot)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 5 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => unhandleComplaint = new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().read(iprot)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 6 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => handlingComplaint = new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().read(iprot)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 7 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.LIST => sumupTotal = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TSumupTotalSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.isuwang.soa.scala.task.domain.TTaskResponse(pageResponse = pageResponse,rows = rows,todayTodo = todayTodo,expiredTodo = expiredTodo,unhandleComplaint = unhandleComplaint,handlingComplaint = handlingComplaint,sumupTotal = sumupTotal)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.isuwang.soa.scala.task.domain.TTaskResponse, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TTaskResponse"))

      
            {
            val elem0 = bean.pageResponse 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("pageResponse", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 1.asInstanceOf[Short]))
             new com.isuwang.soa.scala.common.util.serializer.TPageResponseSerializer().write(elem0, oprot)
            oprot.writeFieldEnd
            
            }
            {
            val elem1 = bean.rows 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("rows", com.isuwang.org.apache.thrift.protocol.TType.LIST, 2.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem1.size))
        elem1.foreach(elem2 => { new com.isuwang.soa.scala.task.domain.serializer.TTaskSerializer().write(elem2, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
            {
            val elem2 = bean.todayTodo 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("todayTodo", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 3.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().write(elem2, oprot)
            oprot.writeFieldEnd
            
            }
            {
            val elem3 = bean.expiredTodo 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("expiredTodo", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 4.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().write(elem3, oprot)
            oprot.writeFieldEnd
            
            }
            {
            val elem4 = bean.unhandleComplaint 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("unhandleComplaint", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 5.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().write(elem4, oprot)
            oprot.writeFieldEnd
            
            }
            {
            val elem5 = bean.handlingComplaint 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("handlingComplaint", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 6.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().write(elem5, oprot)
            oprot.writeFieldEnd
            
            }
            {
            val elem6 = bean.sumupTotal 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("sumupTotal", com.isuwang.org.apache.thrift.protocol.TType.LIST, 7.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem6.size))
        elem6.foreach(elem7 => { new com.isuwang.soa.scala.task.domain.serializer.TSumupTotalSerializer().write(elem7, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.isuwang.soa.scala.task.domain.TTaskResponse): Unit = {
      
              if(bean.pageResponse == null)
              throw new SoaException(SoaBaseCode.NotNull, "pageResponse字段不允许为空")
            
                if(bean.pageResponse != null)
                new com.isuwang.soa.scala.common.util.serializer.TPageResponseSerializer().validate(bean.pageResponse)
              
              if(bean.rows == null)
              throw new SoaException(SoaBaseCode.NotNull, "rows字段不允许为空")
            
              if(bean.todayTodo == null)
              throw new SoaException(SoaBaseCode.NotNull, "todayTodo字段不允许为空")
            
                if(bean.todayTodo != null)
                new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().validate(bean.todayTodo)
              
              if(bean.expiredTodo == null)
              throw new SoaException(SoaBaseCode.NotNull, "expiredTodo字段不允许为空")
            
                if(bean.expiredTodo != null)
                new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().validate(bean.expiredTodo)
              
              if(bean.unhandleComplaint == null)
              throw new SoaException(SoaBaseCode.NotNull, "unhandleComplaint字段不允许为空")
            
                if(bean.unhandleComplaint != null)
                new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().validate(bean.unhandleComplaint)
              
              if(bean.handlingComplaint == null)
              throw new SoaException(SoaBaseCode.NotNull, "handlingComplaint字段不允许为空")
            
                if(bean.handlingComplaint != null)
                new com.isuwang.soa.scala.task.domain.serializer.TSumupTaskResultSerializer().validate(bean.handlingComplaint)
              
              if(bean.sumupTotal == null)
              throw new SoaException(SoaBaseCode.NotNull, "sumupTotal字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.isuwang.soa.scala.task.domain.TTaskResponse): String = if (bean == null) "null" else bean.toString

        }
        
      