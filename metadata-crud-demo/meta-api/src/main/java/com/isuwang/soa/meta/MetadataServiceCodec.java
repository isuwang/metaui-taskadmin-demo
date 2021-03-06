package com.isuwang.soa.meta;
        import com.isuwang.soa.common.util.serializer.*;import com.isuwang.soa.meta.domain.serializer.*;

        import com.isuwang.dapeng.core.*;
        import com.isuwang.org.apache.thrift.*;
        import com.isuwang.org.apache.thrift.protocol.*;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class MetadataServiceCodec {

        
            public static class queryFieldMetas_args {
            
                private com.isuwang.soa.meta.domain.TFieldMetaRequest request;
                public com.isuwang.soa.meta.domain.TFieldMetaRequest getRequest(){
                return this.request;
              }
                public void setRequest(com.isuwang.soa.meta.domain.TFieldMetaRequest request){
                this.request = request;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("request").append("\":").append(this.request == null ? "null" : this.request.toString()).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class queryFieldMetas_result {

            
                  private com.isuwang.soa.meta.domain.TFieldMetaResponse success;
                  public com.isuwang.soa.meta.domain.TFieldMetaResponse getSuccess(){
                  return success;
                }

                  public void setSuccess(com.isuwang.soa.meta.domain.TFieldMetaResponse success){
                  this.success = success;
                }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":").append(this.success == null ? "null" : this.success.toString()).append(",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
          }

            public static class QueryFieldMetas_argsSerializer implements TCommonBeanSerializer<queryFieldMetas_args>{
            
      @Override
      public queryFieldMetas_args read(TProtocol iprot) throws TException{

        queryFieldMetas_args bean = new queryFieldMetas_args();
        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                com.isuwang.soa.meta.domain.TFieldMetaRequest elem0 = new com.isuwang.soa.meta.domain.TFieldMetaRequest();
        elem0=new com.isuwang.soa.meta.domain.serializer.TFieldMetaRequestSerializer().read(iprot);
          bean.setRequest(elem0);
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
      public void write(queryFieldMetas_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("queryFieldMetas_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("request", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.meta.domain.TFieldMetaRequest elem0 = bean.getRequest();
             new com.isuwang.soa.meta.domain.serializer.TFieldMetaRequestSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(queryFieldMetas_args bean) throws TException{
      
              if(bean.getRequest() == null)
              throw new SoaException(SoaBaseCode.NotNull, "request字段不允许为空");
            
                if(bean.getRequest() != null)
                new com.isuwang.soa.meta.domain.serializer.TFieldMetaRequestSerializer().validate(bean.getRequest());
              
    }
    

            @Override
            public String toString(queryFieldMetas_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class QueryFieldMetas_resultSerializer implements TCommonBeanSerializer<queryFieldMetas_result>{
            @Override
            public queryFieldMetas_result read(TProtocol iprot) throws TException{

              queryFieldMetas_result bean = new queryFieldMetas_result();
              com.isuwang.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                    com.isuwang.soa.meta.domain.TFieldMetaResponse elem0 = new com.isuwang.soa.meta.domain.TFieldMetaResponse();
        elem0=new com.isuwang.soa.meta.domain.serializer.TFieldMetaResponseSerializer().read(iprot);
          bean.setSuccess(elem0);
                  }else{
                    com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
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
      public void write(queryFieldMetas_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("queryFieldMetas_result"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 0));
            com.isuwang.soa.meta.domain.TFieldMetaResponse elem0 = bean.getSuccess();
             new com.isuwang.soa.meta.domain.serializer.TFieldMetaResponseSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(queryFieldMetas_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
            
                if(bean.getSuccess() != null)
                new com.isuwang.soa.meta.domain.serializer.TFieldMetaResponseSerializer().validate(bean.getSuccess());
              
    }
    

            @Override
            public String toString(queryFieldMetas_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class queryFieldMetas<I extends com.isuwang.soa.meta.service.MetadataService> extends SoaProcessFunction<I, queryFieldMetas_args, queryFieldMetas_result, QueryFieldMetas_argsSerializer,  QueryFieldMetas_resultSerializer>{
            public queryFieldMetas(){
              super("queryFieldMetas", new QueryFieldMetas_argsSerializer(),  new QueryFieldMetas_resultSerializer());
            }
            
              @Override
              public queryFieldMetas_result getResult(I iface, queryFieldMetas_args args) throws TException{
                queryFieldMetas_result result = new queryFieldMetas_result();
                
                      result.success = iface.queryFieldMetas(args.request);
                    
                return result;
              }
            

            @Override
            public queryFieldMetas_args getEmptyArgsInstance(){
              return new queryFieldMetas_args();
            }

            @Override
            protected boolean isOneway(){
              return false;
            }
          }
          
            public static class createFieldMeta_args {
            
                private com.isuwang.soa.meta.domain.TFieldMetaSaveRequest request;
                public com.isuwang.soa.meta.domain.TFieldMetaSaveRequest getRequest(){
                return this.request;
              }
                public void setRequest(com.isuwang.soa.meta.domain.TFieldMetaSaveRequest request){
                this.request = request;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("request").append("\":").append(this.request == null ? "null" : this.request.toString()).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class createFieldMeta_result {

            
                  @Override
                  public String toString(){
                  return "{}";
                }
                
          }

            public static class CreateFieldMeta_argsSerializer implements TCommonBeanSerializer<createFieldMeta_args>{
            
      @Override
      public createFieldMeta_args read(TProtocol iprot) throws TException{

        createFieldMeta_args bean = new createFieldMeta_args();
        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                com.isuwang.soa.meta.domain.TFieldMetaSaveRequest elem0 = new com.isuwang.soa.meta.domain.TFieldMetaSaveRequest();
        elem0=new com.isuwang.soa.meta.domain.serializer.TFieldMetaSaveRequestSerializer().read(iprot);
          bean.setRequest(elem0);
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
      public void write(createFieldMeta_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("createFieldMeta_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("request", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.meta.domain.TFieldMetaSaveRequest elem0 = bean.getRequest();
             new com.isuwang.soa.meta.domain.serializer.TFieldMetaSaveRequestSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(createFieldMeta_args bean) throws TException{
      
              if(bean.getRequest() == null)
              throw new SoaException(SoaBaseCode.NotNull, "request字段不允许为空");
            
                if(bean.getRequest() != null)
                new com.isuwang.soa.meta.domain.serializer.TFieldMetaSaveRequestSerializer().validate(bean.getRequest());
              
    }
    

            @Override
            public String toString(createFieldMeta_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class CreateFieldMeta_resultSerializer implements TCommonBeanSerializer<createFieldMeta_result>{
            @Override
            public createFieldMeta_result read(TProtocol iprot) throws TException{

              createFieldMeta_result bean = new createFieldMeta_result();
              com.isuwang.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.VOID){
                    
         com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }else{
                    com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
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
      public void write(createFieldMeta_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("createFieldMeta_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(createFieldMeta_result bean) throws TException{
      
    }
    

            @Override
            public String toString(createFieldMeta_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class createFieldMeta<I extends com.isuwang.soa.meta.service.MetadataService> extends SoaProcessFunction<I, createFieldMeta_args, createFieldMeta_result, CreateFieldMeta_argsSerializer,  CreateFieldMeta_resultSerializer>{
            public createFieldMeta(){
              super("createFieldMeta", new CreateFieldMeta_argsSerializer(),  new CreateFieldMeta_resultSerializer());
            }
            
              @Override
              public createFieldMeta_result getResult(I iface, createFieldMeta_args args) throws TException{
                createFieldMeta_result result = new createFieldMeta_result();
                
                      iface.createFieldMeta(args.request);
                    
                return result;
              }
            

            @Override
            public createFieldMeta_args getEmptyArgsInstance(){
              return new createFieldMeta_args();
            }

            @Override
            protected boolean isOneway(){
              return false;
            }
          }
          
            public static class updateFieldMeta_args {
            
                private com.isuwang.soa.meta.domain.TFieldMetaSaveRequest request;
                public com.isuwang.soa.meta.domain.TFieldMetaSaveRequest getRequest(){
                return this.request;
              }
                public void setRequest(com.isuwang.soa.meta.domain.TFieldMetaSaveRequest request){
                this.request = request;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("request").append("\":").append(this.request == null ? "null" : this.request.toString()).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class updateFieldMeta_result {

            
                  @Override
                  public String toString(){
                  return "{}";
                }
                
          }

            public static class UpdateFieldMeta_argsSerializer implements TCommonBeanSerializer<updateFieldMeta_args>{
            
      @Override
      public updateFieldMeta_args read(TProtocol iprot) throws TException{

        updateFieldMeta_args bean = new updateFieldMeta_args();
        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                com.isuwang.soa.meta.domain.TFieldMetaSaveRequest elem0 = new com.isuwang.soa.meta.domain.TFieldMetaSaveRequest();
        elem0=new com.isuwang.soa.meta.domain.serializer.TFieldMetaSaveRequestSerializer().read(iprot);
          bean.setRequest(elem0);
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
      public void write(updateFieldMeta_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("updateFieldMeta_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("request", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.meta.domain.TFieldMetaSaveRequest elem0 = bean.getRequest();
             new com.isuwang.soa.meta.domain.serializer.TFieldMetaSaveRequestSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(updateFieldMeta_args bean) throws TException{
      
              if(bean.getRequest() == null)
              throw new SoaException(SoaBaseCode.NotNull, "request字段不允许为空");
            
                if(bean.getRequest() != null)
                new com.isuwang.soa.meta.domain.serializer.TFieldMetaSaveRequestSerializer().validate(bean.getRequest());
              
    }
    

            @Override
            public String toString(updateFieldMeta_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class UpdateFieldMeta_resultSerializer implements TCommonBeanSerializer<updateFieldMeta_result>{
            @Override
            public updateFieldMeta_result read(TProtocol iprot) throws TException{

              updateFieldMeta_result bean = new updateFieldMeta_result();
              com.isuwang.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.VOID){
                    
         com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }else{
                    com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
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
      public void write(updateFieldMeta_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("updateFieldMeta_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(updateFieldMeta_result bean) throws TException{
      
    }
    

            @Override
            public String toString(updateFieldMeta_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class updateFieldMeta<I extends com.isuwang.soa.meta.service.MetadataService> extends SoaProcessFunction<I, updateFieldMeta_args, updateFieldMeta_result, UpdateFieldMeta_argsSerializer,  UpdateFieldMeta_resultSerializer>{
            public updateFieldMeta(){
              super("updateFieldMeta", new UpdateFieldMeta_argsSerializer(),  new UpdateFieldMeta_resultSerializer());
            }
            
              @Override
              public updateFieldMeta_result getResult(I iface, updateFieldMeta_args args) throws TException{
                updateFieldMeta_result result = new updateFieldMeta_result();
                
                      iface.updateFieldMeta(args.request);
                    
                return result;
              }
            

            @Override
            public updateFieldMeta_args getEmptyArgsInstance(){
              return new updateFieldMeta_args();
            }

            @Override
            protected boolean isOneway(){
              return false;
            }
          }
          
            public static class deleteFieldMeta_args {
            
                private Integer id;
                public Integer getId(){
                return this.id;
              }
                public void setId(Integer id){
                this.id = id;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("id").append("\":").append(id).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class deleteFieldMeta_result {

            
                  @Override
                  public String toString(){
                  return "{}";
                }
                
          }

            public static class DeleteFieldMeta_argsSerializer implements TCommonBeanSerializer<deleteFieldMeta_args>{
            
      @Override
      public deleteFieldMeta_args read(TProtocol iprot) throws TException{

        deleteFieldMeta_args bean = new deleteFieldMeta_args();
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
      public void write(deleteFieldMeta_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("deleteFieldMeta_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(deleteFieldMeta_args bean) throws TException{
      
    }
    

            @Override
            public String toString(deleteFieldMeta_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class DeleteFieldMeta_resultSerializer implements TCommonBeanSerializer<deleteFieldMeta_result>{
            @Override
            public deleteFieldMeta_result read(TProtocol iprot) throws TException{

              deleteFieldMeta_result bean = new deleteFieldMeta_result();
              com.isuwang.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.VOID){
                    
         com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }else{
                    com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
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
      public void write(deleteFieldMeta_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("deleteFieldMeta_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(deleteFieldMeta_result bean) throws TException{
      
    }
    

            @Override
            public String toString(deleteFieldMeta_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class deleteFieldMeta<I extends com.isuwang.soa.meta.service.MetadataService> extends SoaProcessFunction<I, deleteFieldMeta_args, deleteFieldMeta_result, DeleteFieldMeta_argsSerializer,  DeleteFieldMeta_resultSerializer>{
            public deleteFieldMeta(){
              super("deleteFieldMeta", new DeleteFieldMeta_argsSerializer(),  new DeleteFieldMeta_resultSerializer());
            }
            
              @Override
              public deleteFieldMeta_result getResult(I iface, deleteFieldMeta_args args) throws TException{
                deleteFieldMeta_result result = new deleteFieldMeta_result();
                
                      iface.deleteFieldMeta(args.id);
                    
                return result;
              }
            

            @Override
            public deleteFieldMeta_args getEmptyArgsInstance(){
              return new deleteFieldMeta_args();
            }

            @Override
            protected boolean isOneway(){
              return false;
            }
          }
          

        public static class getServiceMetadata_args {

          @Override
          public String toString() {
            return "{}";
          }
        }


        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }

          @Override
          public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
              stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
              stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

            return stringBuilder.toString();
          }
        }

        public static class GetServiceMetadata_argsSerializer implements TCommonBeanSerializer<getServiceMetadata_args> {

          @Override
          public getServiceMetadata_args read(TProtocol iprot) throws TException {

            getServiceMetadata_args bean =new getServiceMetadata_args();
            com.isuwang.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
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
          public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_args bean) throws TException {}

          @Override
          public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
          }

        }

        public static class GetServiceMetadata_resultSerializer implements TCommonBeanSerializer<getServiceMetadata_result> {
          @Override
          public getServiceMetadata_result read(TProtocol iprot) throws TException {

            getServiceMetadata_result bean = new getServiceMetadata_result();
            com.isuwang.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
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
          public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
          }

          @Override
          public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        public static class getServiceMetadata<I extends com.isuwang.soa.meta.service.MetadataService> extends SoaProcessFunction<I, getServiceMetadata_args, getServiceMetadata_result, GetServiceMetadata_argsSerializer, GetServiceMetadata_resultSerializer> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public getServiceMetadata_result getResult(I iface, getServiceMetadata_args args) throws TException {
            getServiceMetadata_result result = new getServiceMetadata_result();

            try (InputStreamReader isr = new InputStreamReader(MetadataServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.soa.meta.service.MetadataService.xml"));
            BufferedReader in = new BufferedReader(isr)) {
              int len = 0;
              StringBuilder str = new StringBuilder("");
              String line;
              while ((line = in.readLine()) != null) {

                if (len != 0) {
                  str.append("\r\n").append(line);
                } else {
                  str.append(line);
                }
                len++;
              }
              result.success = str.toString();

            } catch (Exception e) {
              e.printStackTrace();
              result.success = "";
            }

            return result;
          }

          @Override
          public getServiceMetadata_args getEmptyArgsInstance() {
            return new getServiceMetadata_args();
          }

          @Override
          protected boolean isOneway() {
            return false;
          }
        }

        @SuppressWarnings("unchecked")
        public static class Processor<I extends com.isuwang.soa.meta.service.MetadataService> extends SoaCommonBaseProcessor{
          public Processor(I iface){
            super(iface, getProcessMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends com.isuwang.soa.meta.service.MetadataService> java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TCommonBeanSerializer<?>, ? extends TCommonBeanSerializer<?>>> getProcessMap(java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TCommonBeanSerializer<?>, ? extends TCommonBeanSerializer<?>>> processMap){
            
                processMap.put("queryFieldMetas", new queryFieldMetas());
              
                processMap.put("createFieldMeta", new createFieldMeta());
              
                processMap.put("updateFieldMeta", new updateFieldMeta());
              
                processMap.put("deleteFieldMeta", new deleteFieldMeta());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());

            return processMap;
          }
        }

        }
      