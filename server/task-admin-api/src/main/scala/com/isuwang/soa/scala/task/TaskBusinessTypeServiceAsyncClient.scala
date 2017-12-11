package com.isuwang.soa.scala.task

        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.dapeng.remoting.BaseCommonServiceClient
        import com.isuwang.soa.scala.task.TaskBusinessTypeServiceCodec._
        import scala.concurrent.{Future, Promise}
        import java.util.function.BiConsumer

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        object TaskBusinessTypeServiceAsyncClient extends BaseCommonServiceClient("com.isuwang.soa.scala.task.service.TaskBusinessTypeService", "1.0.0"){

        override def isSoaTransactionalProcess: Boolean = {

          var isSoaTransactionalProcess = false
          
          isSoaTransactionalProcess
        }

        
            /**
            * 
            **/
            def findBusinessTypes(request:com.isuwang.soa.scala.task.domain.TBusinessTypeRequest , timeout: Long) : scala.concurrent.Future[com.isuwang.soa.scala.task.domain.TBusinessTypeResponse] = {

            initContext("findBusinessTypes");

            try {
              val _responseFuture = sendBaseAsync(findBusinessTypes_args(request), new FindBusinessTypes_argsSerializer(), new FindBusinessTypes_resultSerializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[findBusinessTypes_result]]

              val promise = Promise[com.isuwang.soa.scala.task.domain.TBusinessTypeResponse]()

              _responseFuture.whenComplete(new BiConsumer[findBusinessTypes_result, Throwable]{

              override def accept(r: findBusinessTypes_result, e: Throwable): Unit = {
                if(e != null)
                  promise.failure(e)
                else
                  promise.success(r.success)
                }
              })
              promise.future
            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }finally {
              destoryContext()
            }
          }
          
            /**
            * 
            **/
            def createBusinessType(request:com.isuwang.soa.scala.task.domain.TSaveBusinessType , timeout: Long) : scala.concurrent.Future[Unit] = {

            initContext("createBusinessType");

            try {
              val _responseFuture = sendBaseAsync(createBusinessType_args(request), new CreateBusinessType_argsSerializer(), new CreateBusinessType_resultSerializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[createBusinessType_result]]

              val promise = Promise[Unit]()

              _responseFuture.whenComplete(new BiConsumer[createBusinessType_result, Throwable]{

              override def accept(r: createBusinessType_result, e: Throwable): Unit = {
                if(e != null)
                  promise.failure(e)
                else
                  promise.success()
                }
              })
              promise.future
            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }finally {
              destoryContext()
            }
          }
          
            /**
            * 
            **/
            def updateBusinessType(request:com.isuwang.soa.scala.task.domain.TSaveBusinessType , timeout: Long) : scala.concurrent.Future[Unit] = {

            initContext("updateBusinessType");

            try {
              val _responseFuture = sendBaseAsync(updateBusinessType_args(request), new UpdateBusinessType_argsSerializer(), new UpdateBusinessType_resultSerializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[updateBusinessType_result]]

              val promise = Promise[Unit]()

              _responseFuture.whenComplete(new BiConsumer[updateBusinessType_result, Throwable]{

              override def accept(r: updateBusinessType_result, e: Throwable): Unit = {
                if(e != null)
                  promise.failure(e)
                else
                  promise.success()
                }
              })
              promise.future
            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }finally {
              destoryContext()
            }
          }
          
            /**
            * 
            **/
            def deleteBusinessType(id:Int , timeout: Long) : scala.concurrent.Future[Unit] = {

            initContext("deleteBusinessType");

            try {
              val _responseFuture = sendBaseAsync(deleteBusinessType_args(id), new DeleteBusinessType_argsSerializer(), new DeleteBusinessType_resultSerializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[deleteBusinessType_result]]

              val promise = Promise[Unit]()

              _responseFuture.whenComplete(new BiConsumer[deleteBusinessType_result, Throwable]{

              override def accept(r: deleteBusinessType_result, e: Throwable): Unit = {
                if(e != null)
                  promise.failure(e)
                else
                  promise.success()
                }
              })
              promise.future
            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }finally {
              destoryContext()
            }
          }
          
            /**
            * 
            **/
            def findAllBusinessTypes4Picker( timeout: Long) : scala.concurrent.Future[List[com.isuwang.soa.scala.task.domain.TTaskPickerContainer]] = {

            initContext("findAllBusinessTypes4Picker");

            try {
              val _responseFuture = sendBaseAsync(findAllBusinessTypes4Picker_args(), new FindAllBusinessTypes4Picker_argsSerializer(), new FindAllBusinessTypes4Picker_resultSerializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[findAllBusinessTypes4Picker_result]]

              val promise = Promise[List[com.isuwang.soa.scala.task.domain.TTaskPickerContainer]]()

              _responseFuture.whenComplete(new BiConsumer[findAllBusinessTypes4Picker_result, Throwable]{

              override def accept(r: findAllBusinessTypes4Picker_result, e: Throwable): Unit = {
                if(e != null)
                  promise.failure(e)
                else
                  promise.success(r.success)
                }
              })
              promise.future
            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }finally {
              destoryContext()
            }
          }
          

      }
      