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
        public class TTaskItemSerializer implements TCommonBeanSerializer<com.isuwang.soa.task.domain.TTaskItem>{
        
      @Override
      public com.isuwang.soa.task.domain.TTaskItem read(TProtocol iprot) throws TException{

        com.isuwang.soa.task.domain.TTaskItem bean = new com.isuwang.soa.task.domain.TTaskItem();
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
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setSuggestionId(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 4:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setSuggestionType(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 5:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setSuggestionRemark(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 6:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                String elem0 = iprot.readString();
          bean.setSuggestionContent(elem0);
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
      public void write(com.isuwang.soa.task.domain.TTaskItem bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TTaskItem"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("taskId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
            Integer elem1 = bean.getTaskId();
            oprot.writeI32(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("suggestionId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 3));
            Integer elem2 = bean.getSuggestionId();
            oprot.writeI32(elem2);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("suggestionType", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 4));
            Integer elem3 = bean.getSuggestionType();
            oprot.writeI32(elem3);
            
            oprot.writeFieldEnd();
          if(bean.getSuggestionRemark().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("suggestionRemark", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 5));
              String elem4 = bean.getSuggestionRemark().get();
              oprot.writeString(elem4);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("suggestionContent", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 6));
            String elem5 = bean.getSuggestionContent();
            oprot.writeString(elem5);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.soa.task.domain.TTaskItem bean) throws TException{
      
              if(bean.getSuggestionContent() == null)
              throw new SoaException(SoaBaseCode.NotNull, "suggestionContent字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.soa.task.domain.TTaskItem bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      