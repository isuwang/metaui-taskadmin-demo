
        package com.isuwang.soa.meta.service;

        import com.isuwang.dapeng.core.Processor;
        import com.isuwang.dapeng.core.Service;
        import com.isuwang.dapeng.core.SoaGlobalTransactional;

        import java.util.concurrent.Future;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 
        **/
        @Service(name="com.isuwang.soa.meta.service.MetadataService",version = "1.0.0")
        @Processor(className = "com.isuwang.soa.meta.MetadataServiceCodec$Processor")
        public interface MetadataService {
        
            /**
            * 
            **/
            
            
               com.isuwang.soa.meta.domain.TFieldMetaResponse queryFieldMetas( com.isuwang.soa.meta.domain.TFieldMetaRequest request) throws com.isuwang.dapeng.core.SoaException;
              
          
            /**
            * 
            **/
            
            
               void createFieldMeta( com.isuwang.soa.meta.domain.TFieldMetaSaveRequest request) throws com.isuwang.dapeng.core.SoaException;
              
          
            /**
            * 
            **/
            
            
               void updateFieldMeta( com.isuwang.soa.meta.domain.TFieldMetaSaveRequest request) throws com.isuwang.dapeng.core.SoaException;
              
          
            /**
            * 
            **/
            
            
               void deleteFieldMeta( Integer id) throws com.isuwang.dapeng.core.SoaException;
              
          
        }
        