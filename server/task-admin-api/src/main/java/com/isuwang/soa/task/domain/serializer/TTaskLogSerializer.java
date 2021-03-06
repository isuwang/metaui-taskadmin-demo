 package com.isuwang.soa.task.domain.serializer;
        import com.isuwang.soa.common.util.serializer.*;import com.isuwang.soa.task.domain.serializer.*;

        import com.isuwang.dapeng.core.*;
        import com.isuwang.org.apache.thrift.*;
        import com.isuwang.org.apache.thrift.protocol.*;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class TTaskLogSerializer implements TCommonBeanSerializer<com.isuwang.soa.task.domain.TTaskLog>{
        
      @Override
      public com.isuwang.soa.task.domain.TTaskLog read(TProtocol iprot) throws TException{

        com.isuwang.soa.task.domain.TTaskLog bean = new com.isuwang.soa.task.domain.TTaskLog();
        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setId(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setTaskId(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 3:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setOperation(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 4:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setOperField(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 5:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setOldValue(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 6:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setNewValue(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 7:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
                long elem0 = iprot.readI64();
          bean.setCreatedAt(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 8:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setCreatedBy(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 9:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
                long elem0 = iprot.readI64();
          bean.setUpdatedAt(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 10:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setUpdatedBy(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
        return bean;
      }
    
      @Override
      public void write(com.isuwang.soa.task.domain.TTaskLog bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TTaskLog"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
            Integer elem1 = bean.getTaskId();
            oprot.writeI32(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("operation", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 3));
            String elem2 = bean.getOperation();
            oprot.writeString(elem2);
            
            oprot.writeFieldEnd();
          if(bean.getOperField().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("operField", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 4));
              String elem3 = bean.getOperField().get();
              oprot.writeString(elem3);
              
            }
            if(bean.getOldValue().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("oldValue", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 5));
              String elem4 = bean.getOldValue().get();
              oprot.writeString(elem4);
              
            }
            if(bean.getNewValue().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("newValue", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 6));
              String elem5 = bean.getNewValue().get();
              oprot.writeString(elem5);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdAt", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 7));
            Long elem6 = bean.getCreatedAt();
            oprot.writeI64(elem6);
            
            oprot.writeFieldEnd();
          if(bean.getCreatedBy().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdBy", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 8));
              Integer elem7 = bean.getCreatedBy().get();
              oprot.writeI32(elem7);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedAt", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 9));
            Long elem8 = bean.getUpdatedAt();
            oprot.writeI64(elem8);
            
            oprot.writeFieldEnd();
          if(bean.getUpdatedBy().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedBy", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 10));
              Integer elem9 = bean.getUpdatedBy().get();
              oprot.writeI32(elem9);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.soa.task.domain.TTaskLog bean) throws TException{
      
              if(bean.getOperation() == null)
              throw new SoaException(SoaBaseCode.NotNull, "operation字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.soa.task.domain.TTaskLog bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      