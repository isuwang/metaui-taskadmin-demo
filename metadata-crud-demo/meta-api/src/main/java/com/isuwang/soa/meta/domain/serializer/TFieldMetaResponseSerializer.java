 package com.isuwang.soa.meta.domain.serializer;
        import com.isuwang.soa.common.util.serializer.*;import com.isuwang.soa.meta.domain.serializer.*;

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
        public class TFieldMetaResponseSerializer implements TCommonBeanSerializer<com.isuwang.soa.meta.domain.TFieldMetaResponse>{
        
      @Override
      public com.isuwang.soa.meta.domain.TFieldMetaResponse read(TProtocol iprot) throws TException{

        com.isuwang.soa.meta.domain.TFieldMetaResponse bean = new com.isuwang.soa.meta.domain.TFieldMetaResponse();
        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                com.isuwang.soa.common.util.TPageResponse elem0 = new com.isuwang.soa.common.util.TPageResponse();
        elem0=new com.isuwang.soa.common.util.serializer.TPageResponseSerializer().read(iprot);
          bean.setPageResponse(elem0);
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.LIST){
                 com.isuwang.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
        java.util.List<com.isuwang.soa.meta.domain.TFieldMeta> elem0 = new java.util.ArrayList<>(_list0.size);
        for(int _i0 = 0; _i0 < _list0.size; ++ _i0){
          com.isuwang.soa.meta.domain.TFieldMeta elem1 = new com.isuwang.soa.meta.domain.TFieldMeta();
        elem1=new com.isuwang.soa.meta.domain.serializer.TFieldMetaSerializer().read(iprot);
          elem0.add(elem1);
        }
        iprot.readListEnd();
          bean.setRows(elem0);
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
      public void write(com.isuwang.soa.meta.domain.TFieldMetaResponse bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TFieldMetaResponse"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("pageResponse", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.common.util.TPageResponse elem0 = bean.getPageResponse();
             new com.isuwang.soa.common.util.serializer.TPageResponseSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("rows", com.isuwang.org.apache.thrift.protocol.TType.LIST, (short) 2));
            java.util.List<com.isuwang.soa.meta.domain.TFieldMeta> elem1 = bean.getRows();
            
          oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem1.size()));
          for(com.isuwang.soa.meta.domain.TFieldMeta elem2 : elem1){
           new com.isuwang.soa.meta.domain.serializer.TFieldMetaSerializer().write(elem2, oprot);
        }
          oprot.writeListEnd();
        
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.soa.meta.domain.TFieldMetaResponse bean) throws TException{
      
              if(bean.getPageResponse() == null)
              throw new SoaException(SoaBaseCode.NotNull, "pageResponse字段不允许为空");
            
                if(bean.getPageResponse() != null)
                new com.isuwang.soa.common.util.serializer.TPageResponseSerializer().validate(bean.getPageResponse());
              
              if(bean.getRows() == null)
              throw new SoaException(SoaBaseCode.NotNull, "rows字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.soa.meta.domain.TFieldMetaResponse bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      