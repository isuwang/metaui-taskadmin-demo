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
        public class TCreateTaskAttachmentSerializer implements TCommonBeanSerializer<com.isuwang.soa.task.domain.TCreateTaskAttachment>{
        
      @Override
      public com.isuwang.soa.task.domain.TCreateTaskAttachment read(TProtocol iprot) throws TException{

        com.isuwang.soa.task.domain.TCreateTaskAttachment bean = new com.isuwang.soa.task.domain.TCreateTaskAttachment();
        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
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
          bean.setAttachmentId(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 4:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setAttachmentName(elem0);
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
      public void write(com.isuwang.soa.task.domain.TCreateTaskAttachment bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TCreateTaskAttachment"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
            Integer elem0 = bean.getTaskId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("attachmentId", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 3));
            String elem1 = bean.getAttachmentId();
            oprot.writeString(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("attachmentName", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 4));
            String elem2 = bean.getAttachmentName();
            oprot.writeString(elem2);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.soa.task.domain.TCreateTaskAttachment bean) throws TException{
      
              if(bean.getAttachmentId() == null)
              throw new SoaException(SoaBaseCode.NotNull, "attachmentId字段不允许为空");
            
              if(bean.getAttachmentName() == null)
              throw new SoaException(SoaBaseCode.NotNull, "attachmentName字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.soa.task.domain.TCreateTaskAttachment bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      