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
        public class TSuggestionSerializer implements TCommonBeanSerializer<com.isuwang.soa.task.domain.TSuggestion>{
        
      @Override
      public com.isuwang.soa.task.domain.TSuggestion read(TProtocol iprot) throws TException{

        com.isuwang.soa.task.domain.TSuggestion bean = new com.isuwang.soa.task.domain.TSuggestion();
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
          bean.setType(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 4:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setContent(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 5:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setLabels(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 6:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setAssistance(Optional.of(elem0));
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
      public void write(com.isuwang.soa.task.domain.TSuggestion bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TSuggestion"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("type", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
            Integer elem1 = bean.getType();
            oprot.writeI32(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("content", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 4));
            String elem2 = bean.getContent();
            oprot.writeString(elem2);
            
            oprot.writeFieldEnd();
          if(bean.getLabels().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("labels", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 5));
              String elem3 = bean.getLabels().get();
              oprot.writeString(elem3);
              
            }
            if(bean.getAssistance().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("assistance", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 6));
              String elem4 = bean.getAssistance().get();
              oprot.writeString(elem4);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdAt", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 7));
            Long elem5 = bean.getCreatedAt();
            oprot.writeI64(elem5);
            
            oprot.writeFieldEnd();
          if(bean.getCreatedBy().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdBy", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 8));
              Integer elem6 = bean.getCreatedBy().get();
              oprot.writeI32(elem6);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedAt", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 9));
            Long elem7 = bean.getUpdatedAt();
            oprot.writeI64(elem7);
            
            oprot.writeFieldEnd();
          if(bean.getUpdatedBy().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedBy", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 10));
              Integer elem8 = bean.getUpdatedBy().get();
              oprot.writeI32(elem8);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.soa.task.domain.TSuggestion bean) throws TException{
      
              if(bean.getContent() == null)
              throw new SoaException(SoaBaseCode.NotNull, "content字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.soa.task.domain.TSuggestion bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      