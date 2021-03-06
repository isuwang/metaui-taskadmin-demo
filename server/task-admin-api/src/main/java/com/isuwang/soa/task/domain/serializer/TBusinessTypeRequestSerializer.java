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
        public class TBusinessTypeRequestSerializer implements TCommonBeanSerializer<com.isuwang.soa.task.domain.TBusinessTypeRequest>{
        
      @Override
      public com.isuwang.soa.task.domain.TBusinessTypeRequest read(TProtocol iprot) throws TException{

        com.isuwang.soa.task.domain.TBusinessTypeRequest bean = new com.isuwang.soa.task.domain.TBusinessTypeRequest();
        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                com.isuwang.soa.common.util.TPageRequest elem0 = new com.isuwang.soa.common.util.TPageRequest();
        elem0=new com.isuwang.soa.common.util.serializer.TPageRequestSerializer().read(iprot);
          bean.setPageRequest(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                 int elem0 = iprot.readI32();
          bean.setBusinessTypeId(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 3:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
                long elem0 = iprot.readI64();
          bean.setUpdateAtStart(Optional.of(elem0));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 4:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
                long elem0 = iprot.readI64();
          bean.setUpdateAtEnd(Optional.of(elem0));
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
      public void write(com.isuwang.soa.task.domain.TBusinessTypeRequest bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TBusinessTypeRequest"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("pageRequest", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.common.util.TPageRequest elem0 = bean.getPageRequest();
             new com.isuwang.soa.common.util.serializer.TPageRequestSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          if(bean.getBusinessTypeId().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("businessTypeId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
              Integer elem1 = bean.getBusinessTypeId().get();
              oprot.writeI32(elem1);
              
            }
            if(bean.getUpdateAtStart().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updateAtStart", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 3));
              Long elem2 = bean.getUpdateAtStart().get();
              oprot.writeI64(elem2);
              
            }
            if(bean.getUpdateAtEnd().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updateAtEnd", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 4));
              Long elem3 = bean.getUpdateAtEnd().get();
              oprot.writeI64(elem3);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.soa.task.domain.TBusinessTypeRequest bean) throws TException{
      
              if(bean.getPageRequest() == null)
              throw new SoaException(SoaBaseCode.NotNull, "pageRequest字段不允许为空");
            
                if(bean.getPageRequest() != null)
                new com.isuwang.soa.common.util.serializer.TPageRequestSerializer().validate(bean.getPageRequest());
              
    }
    
        @Override
        public String toString(com.isuwang.soa.task.domain.TBusinessTypeRequest bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      