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

        class TSuggestionResponseSerializer extends TCommonBeanSerializer[com.isuwang.soa.scala.task.domain.TSuggestionResponse]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.isuwang.soa.scala.task.domain.TSuggestionResponse = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var pageResponse: com.isuwang.soa.scala.common.util.TPageResponse = null
        var rows: List[com.isuwang.soa.scala.task.domain.TSuggestion] = List.empty
        

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
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TSuggestionSerializer().read(iprot)}).toList
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

      val bean = com.isuwang.soa.scala.task.domain.TSuggestionResponse(pageResponse = pageResponse,rows = rows)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.isuwang.soa.scala.task.domain.TSuggestionResponse, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TSuggestionResponse"))

      
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
        elem1.foreach(elem2 => { new com.isuwang.soa.scala.task.domain.serializer.TSuggestionSerializer().write(elem2, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.isuwang.soa.scala.task.domain.TSuggestionResponse): Unit = {
      
              if(bean.pageResponse == null)
              throw new SoaException(SoaBaseCode.NotNull, "pageResponse字段不允许为空")
            
                if(bean.pageResponse != null)
                new com.isuwang.soa.scala.common.util.serializer.TPageResponseSerializer().validate(bean.pageResponse)
              
              if(bean.rows == null)
              throw new SoaException(SoaBaseCode.NotNull, "rows字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.isuwang.soa.scala.task.domain.TSuggestionResponse): String = if (bean == null) "null" else bean.toString

        }
        
      