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
        public class TBusinessTypeSerializer implements TCommonBeanSerializer<com.isuwang.soa.task.domain.TBusinessType>{
        
      @Override
      public com.isuwang.soa.task.domain.TBusinessType read(TProtocol iprot) throws TException{

        com.isuwang.soa.task.domain.TBusinessType bean = new com.isuwang.soa.task.domain.TBusinessType();
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
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setTypeName(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 3:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setSuggestionContent(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 4:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setQuestions(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 5:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setQuestions2Str(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 6:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setImprovements(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 7:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setImprovements2Str(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 8:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
                long elem0 = iprot.readI64();
          bean.setCreatedAt(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 9:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setCreator(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 10:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setCreatedBy(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 11:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
                long elem0 = iprot.readI64();
          bean.setUpdatedAt(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 12:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setUpdatedBy(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 13:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setUpdater(Optional.of(elem0));
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
      public void write(com.isuwang.soa.task.domain.TBusinessType bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TBusinessType"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("typeName", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 2));
            String elem1 = bean.getTypeName();
            oprot.writeString(elem1);
            
            oprot.writeFieldEnd();
          if(bean.getSuggestionContent().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("suggestionContent", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 3));
              String elem2 = bean.getSuggestionContent().get();
              oprot.writeString(elem2);
              
            }
            if(bean.getQuestions().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("questions", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 4));
              String elem3 = bean.getQuestions().get();
              oprot.writeString(elem3);
              
            }
            if(bean.getQuestions2Str().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("questions2Str", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 5));
              String elem4 = bean.getQuestions2Str().get();
              oprot.writeString(elem4);
              
            }
            if(bean.getImprovements().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("improvements", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 6));
              String elem5 = bean.getImprovements().get();
              oprot.writeString(elem5);
              
            }
            if(bean.getImprovements2Str().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("improvements2Str", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 7));
              String elem6 = bean.getImprovements2Str().get();
              oprot.writeString(elem6);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdAt", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 8));
            Long elem7 = bean.getCreatedAt();
            oprot.writeI64(elem7);
            
            oprot.writeFieldEnd();
          if(bean.getCreator().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("creator", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 9));
              String elem8 = bean.getCreator().get();
              oprot.writeString(elem8);
              
            }
            if(bean.getCreatedBy().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdBy", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 10));
              Integer elem9 = bean.getCreatedBy().get();
              oprot.writeI32(elem9);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedAt", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 11));
            Long elem10 = bean.getUpdatedAt();
            oprot.writeI64(elem10);
            
            oprot.writeFieldEnd();
          if(bean.getUpdatedBy().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedBy", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 12));
              Integer elem11 = bean.getUpdatedBy().get();
              oprot.writeI32(elem11);
              
            }
            if(bean.getUpdater().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updater", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 13));
              String elem12 = bean.getUpdater().get();
              oprot.writeString(elem12);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.soa.task.domain.TBusinessType bean) throws TException{
      
              if(bean.getTypeName() == null)
              throw new SoaException(SoaBaseCode.NotNull, "typeName字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.soa.task.domain.TBusinessType bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      