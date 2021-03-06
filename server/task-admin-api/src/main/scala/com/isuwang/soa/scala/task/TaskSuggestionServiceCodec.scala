package com.isuwang.soa.scala.task
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
        object TaskSuggestionServiceCodec {

        
            case class findSuggestions_args(request:com.isuwang.soa.scala.task.domain.TSuggestionRequest)

            case class findSuggestions_result(success:com.isuwang.soa.scala.task.domain.TSuggestionResponse)

            class FindSuggestions_argsSerializer extends TCommonBeanSerializer[findSuggestions_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): findSuggestions_args = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var request: com.isuwang.soa.scala.task.domain.TSuggestionRequest = null
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => request = new com.isuwang.soa.scala.task.domain.serializer.TSuggestionRequestSerializer().read(iprot)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = findSuggestions_args(request = request)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: findSuggestions_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findSuggestions_args"))

      
            {
            val elem0 = bean.request 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("request", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 1.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TSuggestionRequestSerializer().write(elem0, oprot)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: findSuggestions_args): Unit = {
      
              if(bean.request == null)
              throw new SoaException(SoaBaseCode.NotNull, "request字段不允许为空")
            
                if(bean.request != null)
                new com.isuwang.soa.scala.task.domain.serializer.TSuggestionRequestSerializer().validate(bean.request)
              
    }
    

            override def toString(bean: findSuggestions_args): String = if(bean == null)  "null" else bean.toString
            }

            class FindSuggestions_resultSerializer extends TCommonBeanSerializer[findSuggestions_result]{

            @throws[TException]
            override def read(iprot: TProtocol): findSuggestions_result = {

              var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              var success : com.isuwang.soa.scala.task.domain.TSuggestionResponse = null

              while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.isuwang.org.apache.thrift.protocol.TType.STRUCT =>  success = new com.isuwang.soa.scala.task.domain.serializer.TSuggestionResponseSerializer().read(iprot)
                          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = findSuggestions_result(success)
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: findSuggestions_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findSuggestions_result"))

      
            {
            val elem0 = bean.success 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 0.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TSuggestionResponseSerializer().write(elem0, oprot)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: findSuggestions_result): Unit = {
      
              if(bean.success == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空")
            
                if(bean.success != null)
                new com.isuwang.soa.scala.task.domain.serializer.TSuggestionResponseSerializer().validate(bean.success)
              
    }
    

            override def toString(bean: findSuggestions_result): String = if(bean == null)  "null" else bean.toString
          }

            class findSuggestions extends SoaProcessFunction[com.isuwang.soa.scala.task.service.TaskSuggestionService, findSuggestions_args, findSuggestions_result, FindSuggestions_argsSerializer,  FindSuggestions_resultSerializer]("findSuggestions", new FindSuggestions_argsSerializer(), new FindSuggestions_resultSerializer()){

            override def isOneway: Boolean = false

            override def getEmptyArgsInstance: findSuggestions_args = null


            @throws[TException]
            def getResult(iface: com.isuwang.soa.scala.task.service.TaskSuggestionService, args: findSuggestions_args):findSuggestions_result = {

              val _result = iface.findSuggestions(args.request)
              findSuggestions_result(_result )
            }
          }
          
            case class createSuggestion_args(request:com.isuwang.soa.scala.task.domain.TSaveSuggestion)

            case class createSuggestion_result()

            class CreateSuggestion_argsSerializer extends TCommonBeanSerializer[createSuggestion_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): createSuggestion_args = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var request: com.isuwang.soa.scala.task.domain.TSaveSuggestion = null
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => request = new com.isuwang.soa.scala.task.domain.serializer.TSaveSuggestionSerializer().read(iprot)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = createSuggestion_args(request = request)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: createSuggestion_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("createSuggestion_args"))

      
            {
            val elem0 = bean.request 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("request", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 1.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TSaveSuggestionSerializer().write(elem0, oprot)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: createSuggestion_args): Unit = {
      
              if(bean.request == null)
              throw new SoaException(SoaBaseCode.NotNull, "request字段不允许为空")
            
                if(bean.request != null)
                new com.isuwang.soa.scala.task.domain.serializer.TSaveSuggestionSerializer().validate(bean.request)
              
    }
    

            override def toString(bean: createSuggestion_args): String = if(bean == null)  "null" else bean.toString
            }

            class CreateSuggestion_resultSerializer extends TCommonBeanSerializer[createSuggestion_result]{

            @throws[TException]
            override def read(iprot: TProtocol): createSuggestion_result = {

              var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              

              while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.isuwang.org.apache.thrift.protocol.TType.VOID =>  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = createSuggestion_result()
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: createSuggestion_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("createSuggestion_result"))

      
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: createSuggestion_result): Unit = {
      
    }
    

            override def toString(bean: createSuggestion_result): String = if(bean == null)  "null" else bean.toString
          }

            class createSuggestion extends SoaProcessFunction[com.isuwang.soa.scala.task.service.TaskSuggestionService, createSuggestion_args, createSuggestion_result, CreateSuggestion_argsSerializer,  CreateSuggestion_resultSerializer]("createSuggestion", new CreateSuggestion_argsSerializer(), new CreateSuggestion_resultSerializer()){

            override def isOneway: Boolean = false

            override def getEmptyArgsInstance: createSuggestion_args = null


            @throws[TException]
            def getResult(iface: com.isuwang.soa.scala.task.service.TaskSuggestionService, args: createSuggestion_args):createSuggestion_result = {

              val _result = iface.createSuggestion(args.request)
              createSuggestion_result( )
            }
          }
          
            case class updateSuggestion_args(request:com.isuwang.soa.scala.task.domain.TSaveSuggestion)

            case class updateSuggestion_result()

            class UpdateSuggestion_argsSerializer extends TCommonBeanSerializer[updateSuggestion_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): updateSuggestion_args = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var request: com.isuwang.soa.scala.task.domain.TSaveSuggestion = null
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRUCT => request = new com.isuwang.soa.scala.task.domain.serializer.TSaveSuggestionSerializer().read(iprot)
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = updateSuggestion_args(request = request)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: updateSuggestion_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("updateSuggestion_args"))

      
            {
            val elem0 = bean.request 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("request", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 1.asInstanceOf[Short]))
             new com.isuwang.soa.scala.task.domain.serializer.TSaveSuggestionSerializer().write(elem0, oprot)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: updateSuggestion_args): Unit = {
      
              if(bean.request == null)
              throw new SoaException(SoaBaseCode.NotNull, "request字段不允许为空")
            
                if(bean.request != null)
                new com.isuwang.soa.scala.task.domain.serializer.TSaveSuggestionSerializer().validate(bean.request)
              
    }
    

            override def toString(bean: updateSuggestion_args): String = if(bean == null)  "null" else bean.toString
            }

            class UpdateSuggestion_resultSerializer extends TCommonBeanSerializer[updateSuggestion_result]{

            @throws[TException]
            override def read(iprot: TProtocol): updateSuggestion_result = {

              var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              

              while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.isuwang.org.apache.thrift.protocol.TType.VOID =>  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = updateSuggestion_result()
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: updateSuggestion_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("updateSuggestion_result"))

      
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: updateSuggestion_result): Unit = {
      
    }
    

            override def toString(bean: updateSuggestion_result): String = if(bean == null)  "null" else bean.toString
          }

            class updateSuggestion extends SoaProcessFunction[com.isuwang.soa.scala.task.service.TaskSuggestionService, updateSuggestion_args, updateSuggestion_result, UpdateSuggestion_argsSerializer,  UpdateSuggestion_resultSerializer]("updateSuggestion", new UpdateSuggestion_argsSerializer(), new UpdateSuggestion_resultSerializer()){

            override def isOneway: Boolean = false

            override def getEmptyArgsInstance: updateSuggestion_args = null


            @throws[TException]
            def getResult(iface: com.isuwang.soa.scala.task.service.TaskSuggestionService, args: updateSuggestion_args):updateSuggestion_result = {

              val _result = iface.updateSuggestion(args.request)
              updateSuggestion_result( )
            }
          }
          
            case class deleteSuggestion_args(id:Int)

            case class deleteSuggestion_result()

            class DeleteSuggestion_argsSerializer extends TCommonBeanSerializer[deleteSuggestion_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): deleteSuggestion_args = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var id: Int = 0
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => id = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = deleteSuggestion_args(id = id)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: deleteSuggestion_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("deleteSuggestion_args"))

      
            {
            val elem0 = bean.id 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
            oprot.writeI32(elem0)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: deleteSuggestion_args): Unit = {
      
    }
    

            override def toString(bean: deleteSuggestion_args): String = if(bean == null)  "null" else bean.toString
            }

            class DeleteSuggestion_resultSerializer extends TCommonBeanSerializer[deleteSuggestion_result]{

            @throws[TException]
            override def read(iprot: TProtocol): deleteSuggestion_result = {

              var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              

              while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.isuwang.org.apache.thrift.protocol.TType.VOID =>  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = deleteSuggestion_result()
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: deleteSuggestion_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("deleteSuggestion_result"))

      
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: deleteSuggestion_result): Unit = {
      
    }
    

            override def toString(bean: deleteSuggestion_result): String = if(bean == null)  "null" else bean.toString
          }

            class deleteSuggestion extends SoaProcessFunction[com.isuwang.soa.scala.task.service.TaskSuggestionService, deleteSuggestion_args, deleteSuggestion_result, DeleteSuggestion_argsSerializer,  DeleteSuggestion_resultSerializer]("deleteSuggestion", new DeleteSuggestion_argsSerializer(), new DeleteSuggestion_resultSerializer()){

            override def isOneway: Boolean = false

            override def getEmptyArgsInstance: deleteSuggestion_args = null


            @throws[TException]
            def getResult(iface: com.isuwang.soa.scala.task.service.TaskSuggestionService, args: deleteSuggestion_args):deleteSuggestion_result = {

              val _result = iface.deleteSuggestion(args.id)
              deleteSuggestion_result( )
            }
          }
          
            case class findAllSuggestions4PickerByType_args(`type`:Int)

            case class findAllSuggestions4PickerByType_result(success:List[com.isuwang.soa.scala.task.domain.TSuggestion4Picker])

            class FindAllSuggestions4PickerByType_argsSerializer extends TCommonBeanSerializer[findAllSuggestions4PickerByType_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): findAllSuggestions4PickerByType_args = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var `type`: Int = 0
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => `type` = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = findAllSuggestions4PickerByType_args(`type` = `type`)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: findAllSuggestions4PickerByType_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findAllSuggestions4PickerByType_args"))

      
            {
            val elem0 = bean.`type` 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("`type`", com.isuwang.org.apache.thrift.protocol.TType.I32, 1.asInstanceOf[Short]))
            oprot.writeI32(elem0)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: findAllSuggestions4PickerByType_args): Unit = {
      
    }
    

            override def toString(bean: findAllSuggestions4PickerByType_args): String = if(bean == null)  "null" else bean.toString
            }

            class FindAllSuggestions4PickerByType_resultSerializer extends TCommonBeanSerializer[findAllSuggestions4PickerByType_result]{

            @throws[TException]
            override def read(iprot: TProtocol): findAllSuggestions4PickerByType_result = {

              var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              var success : List[com.isuwang.soa.scala.task.domain.TSuggestion4Picker] = List.empty

              while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.isuwang.org.apache.thrift.protocol.TType.LIST =>  success = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.isuwang.soa.scala.task.domain.serializer.TSuggestion4PickerSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = findAllSuggestions4PickerByType_result(success)
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: findAllSuggestions4PickerByType_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findAllSuggestions4PickerByType_result"))

      
            {
            val elem0 = bean.success 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.LIST, 0.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem0.size))
        elem0.foreach(elem1 => { new com.isuwang.soa.scala.task.domain.serializer.TSuggestion4PickerSerializer().write(elem1, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: findAllSuggestions4PickerByType_result): Unit = {
      
              if(bean.success == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空")
            
    }
    

            override def toString(bean: findAllSuggestions4PickerByType_result): String = if(bean == null)  "null" else bean.toString
          }

            class findAllSuggestions4PickerByType extends SoaProcessFunction[com.isuwang.soa.scala.task.service.TaskSuggestionService, findAllSuggestions4PickerByType_args, findAllSuggestions4PickerByType_result, FindAllSuggestions4PickerByType_argsSerializer,  FindAllSuggestions4PickerByType_resultSerializer]("findAllSuggestions4PickerByType", new FindAllSuggestions4PickerByType_argsSerializer(), new FindAllSuggestions4PickerByType_resultSerializer()){

            override def isOneway: Boolean = false

            override def getEmptyArgsInstance: findAllSuggestions4PickerByType_args = null


            @throws[TException]
            def getResult(iface: com.isuwang.soa.scala.task.service.TaskSuggestionService, args: findAllSuggestions4PickerByType_args):findAllSuggestions4PickerByType_result = {

              val _result = iface.findAllSuggestions4PickerByType(args.`type`)
              findAllSuggestions4PickerByType_result(_result )
            }
          }
          

        case class getServiceMetadata_args()

        case class getServiceMetadata_result(success: String)

        class GetServiceMetadata_argsSerializer extends TCommonBeanSerializer[getServiceMetadata_args] {

          @throws[TException]
          override def read(iprot: TProtocol): getServiceMetadata_args = {

            iprot.readStructBegin

            var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null

            while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {
              schemeField = iprot.readFieldBegin
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
              iprot.readFieldEnd
            }

            iprot.readStructEnd

            val bean = getServiceMetadata_args()
            validate(bean)

            bean
          }

          @throws[TException]
          override def write(bean: getServiceMetadata_args, oproto: TProtocol): Unit = {
            validate(bean)
            oproto.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"))

            oproto.writeFieldStop
            oproto.writeStructEnd
          }

          @throws[TException]
          override def validate(bean: getServiceMetadata_args): Unit = {}

          override def toString(bean: getServiceMetadata_args): String = if (bean == null) "null" else bean.toString
        }



        class GetServiceMetadata_resultSerializer extends TCommonBeanSerializer[getServiceMetadata_result] {
          @throws[TException]
          override def read(iprot: TProtocol): getServiceMetadata_result = {
            iprot.readStructBegin

            var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null

            var success: String = null

            while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {
              schemeField = iprot.readFieldBegin

              schemeField.id match {
                case 0 =>
                schemeField.`type` match {
                  case com.isuwang.org.apache.thrift.protocol.TType.STRING => success = iprot.readString
                  case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }
                case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
              }
              iprot.readFieldEnd
            }

            iprot.readStructEnd
            val bean = getServiceMetadata_result(success)
            validate(bean)

            bean
          }

          @throws[TException]
          override def write(bean: getServiceMetadata_result, oproto: TProtocol): Unit = {
            validate(bean)
            oproto.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"))

            oproto.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRING, 0.asInstanceOf[Short]))
            oproto.writeString(bean.success)
            oproto.writeFieldEnd

            oproto.writeFieldStop
            oproto.writeStructEnd
          }

          @throws[TException]
          override def validate(bean: getServiceMetadata_result): Unit = {
            if (bean.success == null)
            throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空")
          }

          override def toString(bean: getServiceMetadata_result): String = if (bean == null) "null" else bean.toString

        }



  class getServiceMetadata extends SoaProcessFunction[com.isuwang.soa.scala.task.service.TaskSuggestionService, getServiceMetadata_args, getServiceMetadata_result, GetServiceMetadata_argsSerializer, GetServiceMetadata_resultSerializer](
  "getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer()) {

      override def isOneway: Boolean = false

      override def getEmptyArgsInstance: getServiceMetadata_args = getServiceMetadata_args()

      @throws[TException]
      override def getResult(iface: com.isuwang.soa.scala.task.service.TaskSuggestionService, args: getServiceMetadata_args): getServiceMetadata_result = {

        val source = scala.io.Source.fromInputStream(TaskSuggestionServiceCodec.getClass.getClassLoader.getResourceAsStream("com.isuwang.soa.scala.task.service.TaskSuggestionService.xml"))
        val success = source.mkString
        source.close
        getServiceMetadata_result(success)
      }
      }

      class Processor(iface: com.isuwang.soa.scala.task.service.TaskSuggestionService) extends SoaCommonBaseProcessor(iface, Processor.getProcessMap)

        object Processor{

          type PF = SoaProcessFunction[com.isuwang.soa.scala.task.service.TaskSuggestionService, _, _, _ <: TCommonBeanSerializer[_], _ <: TCommonBeanSerializer[_]]

          def getProcessMap(): java.util.Map[String, PF] = {
             val map = new java.util.HashMap[String, PF]()
            map.put("findSuggestions", new findSuggestions)
              map.put("createSuggestion", new createSuggestion)
              map.put("updateSuggestion", new updateSuggestion)
              map.put("deleteSuggestion", new deleteSuggestion)
              map.put("findAllSuggestions4PickerByType", new findAllSuggestions4PickerByType)
              
            map.put("getServiceMetadata", new getServiceMetadata)
            map
          }

        }
        }
      