package com.isuwang.soa.task;

      import com.isuwang.dapeng.core.*;
      import com.isuwang.org.apache.thrift.*;
      import com.isuwang.dapeng.remoting.BaseCommonServiceClient;
      import java.util.concurrent.CompletableFuture;
      import java.util.concurrent.Future;
      import com.isuwang.soa.task.TaskSuggestionServiceCodec.*;

      /**
       * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      **/
      public class TaskSuggestionServiceClient extends BaseCommonServiceClient{

      public TaskSuggestionServiceClient() {
        super("com.isuwang.soa.task.service.TaskSuggestionService", "1.0.0");
      }

      @Override
      protected boolean isSoaTransactionalProcess(){
        return false;
      }

      
       /**
       * 
       **/
          
              public com.isuwang.soa.task.domain.TSuggestionResponse findSuggestions(com.isuwang.soa.task.domain.TSuggestionRequest request) throws SoaException{
                initContext("findSuggestions");

          try {
             findSuggestions_args findSuggestions_args = new findSuggestions_args();
          findSuggestions_args.setRequest(request);
            

          findSuggestions_result response = sendBase(findSuggestions_args, new FindSuggestions_argsSerializer(), new FindSuggestions_resultSerializer());

             
                  
                        return response.getSuccess();
                      
                
          }catch (SoaException e){
              throw e;
          } catch (TException e){
              throw new SoaException(e);
          }finally {
            destoryContext();
          }
          }
            
        
       /**
       * 
       **/
          
              public void createSuggestion(com.isuwang.soa.task.domain.TSaveSuggestion request) throws SoaException{
                initContext("createSuggestion");

          try {
             createSuggestion_args createSuggestion_args = new createSuggestion_args();
          createSuggestion_args.setRequest(request);
            

          createSuggestion_result response = sendBase(createSuggestion_args, new CreateSuggestion_argsSerializer(), new CreateSuggestion_resultSerializer());

             
                  
                
          }catch (SoaException e){
              throw e;
          } catch (TException e){
              throw new SoaException(e);
          }finally {
            destoryContext();
          }
          }
            
        
       /**
       * 
       **/
          
              public void updateSuggestion(com.isuwang.soa.task.domain.TSaveSuggestion request) throws SoaException{
                initContext("updateSuggestion");

          try {
             updateSuggestion_args updateSuggestion_args = new updateSuggestion_args();
          updateSuggestion_args.setRequest(request);
            

          updateSuggestion_result response = sendBase(updateSuggestion_args, new UpdateSuggestion_argsSerializer(), new UpdateSuggestion_resultSerializer());

             
                  
                
          }catch (SoaException e){
              throw e;
          } catch (TException e){
              throw new SoaException(e);
          }finally {
            destoryContext();
          }
          }
            
        
       /**
       * 
       **/
          
              public void deleteSuggestion(Integer id) throws SoaException{
                initContext("deleteSuggestion");

          try {
             deleteSuggestion_args deleteSuggestion_args = new deleteSuggestion_args();
          deleteSuggestion_args.setId(id);
            

          deleteSuggestion_result response = sendBase(deleteSuggestion_args, new DeleteSuggestion_argsSerializer(), new DeleteSuggestion_resultSerializer());

             
                  
                
          }catch (SoaException e){
              throw e;
          } catch (TException e){
              throw new SoaException(e);
          }finally {
            destoryContext();
          }
          }
            
        
       /**
       * 
       **/
          
              public java.util.List<com.isuwang.soa.task.domain.TSuggestion4Picker> findAllSuggestions4PickerByType(Integer type) throws SoaException{
                initContext("findAllSuggestions4PickerByType");

          try {
             findAllSuggestions4PickerByType_args findAllSuggestions4PickerByType_args = new findAllSuggestions4PickerByType_args();
          findAllSuggestions4PickerByType_args.setType(type);
            

          findAllSuggestions4PickerByType_result response = sendBase(findAllSuggestions4PickerByType_args, new FindAllSuggestions4PickerByType_argsSerializer(), new FindAllSuggestions4PickerByType_resultSerializer());

             
                  
                        return response.getSuccess();
                      
                
          }catch (SoaException e){
              throw e;
          } catch (TException e){
              throw new SoaException(e);
          }finally {
            destoryContext();
          }
          }
            
        

      /**
      * getServiceMetadata
      **/
      public String getServiceMetadata() throws SoaException {
        initContext("getServiceMetadata");
        try {
          getServiceMetadata_args getServiceMetadata_args = new getServiceMetadata_args();
          getServiceMetadata_result response = sendBase(getServiceMetadata_args, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          return response.getSuccess();
        }catch (SoaException e){
          throw e;
        } catch (TException e){
          throw new SoaException(e);
        } finally {
          destoryContext();
        }
      }

      }
    