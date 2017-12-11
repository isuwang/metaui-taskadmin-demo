package com.isuwang.soa.scala.task

        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.dapeng.remoting.BaseCommonServiceClient
        import com.isuwang.soa.scala.task.TaskAdminServiceCodec._

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        object TaskAdminServiceClient extends BaseCommonServiceClient("com.isuwang.soa.scala.task.service.TaskAdminService", "1.0.0"){

        override def isSoaTransactionalProcess: Boolean = {

          var isSoaTransactionalProcess = false
          
          isSoaTransactionalProcess
        }

        
         /**
         * 
         **/

            def findTasks(request:com.isuwang.soa.scala.task.domain.TTaskRequest ) : com.isuwang.soa.scala.task.domain.TTaskResponse = {

            initContext("findTasks");

            try {
              val response = sendBase(findTasks_args(request), new FindTasks_argsSerializer(), new FindTasks_resultSerializer())

              response.success

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def findTaskDetailById(id:Int ) : com.isuwang.soa.scala.task.domain.TTaskDetail = {

            initContext("findTaskDetailById");

            try {
              val response = sendBase(findTaskDetailById_args(id), new FindTaskDetailById_argsSerializer(), new FindTaskDetailById_resultSerializer())

              response.success

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def createTask(request:com.isuwang.soa.scala.task.domain.TCreateTaskRequest ) : Unit = {

            initContext("createTask");

            try {
              val response = sendBase(createTask_args(request), new CreateTask_argsSerializer(), new CreateTask_resultSerializer())

              

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def updateTask(request:com.isuwang.soa.scala.task.domain.TUpdateTaskRequest ) : Unit = {

            initContext("updateTask");

            try {
              val response = sendBase(updateTask_args(request), new UpdateTask_argsSerializer(), new UpdateTask_resultSerializer())

              

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def unbindSubTask(subTaskId:Int ) : Unit = {

            initContext("unbindSubTask");

            try {
              val response = sendBase(unbindSubTask_args(subTaskId), new UnbindSubTask_argsSerializer(), new UnbindSubTask_resultSerializer())

              

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def createTaskRemark(request:com.isuwang.soa.scala.task.domain.TSaveTaskRemark ) : Unit = {

            initContext("createTaskRemark");

            try {
              val response = sendBase(createTaskRemark_args(request), new CreateTaskRemark_argsSerializer(), new CreateTaskRemark_resultSerializer())

              

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def updateTaskRemark(request:com.isuwang.soa.scala.task.domain.TSaveTaskRemark ) : Unit = {

            initContext("updateTaskRemark");

            try {
              val response = sendBase(updateTaskRemark_args(request), new UpdateTaskRemark_argsSerializer(), new UpdateTaskRemark_resultSerializer())

              

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def deleteTaskRemark(id:Int ) : Unit = {

            initContext("deleteTaskRemark");

            try {
              val response = sendBase(deleteTaskRemark_args(id), new DeleteTaskRemark_argsSerializer(), new DeleteTaskRemark_resultSerializer())

              

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def createTaskLog(request:com.isuwang.soa.scala.task.domain.TCreateTaskLog ) : Unit = {

            initContext("createTaskLog");

            try {
              val response = sendBase(createTaskLog_args(request), new CreateTaskLog_argsSerializer(), new CreateTaskLog_resultSerializer())

              

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def createTaskAttachment(request:com.isuwang.soa.scala.task.domain.TCreateTaskAttachment ) : Int = {

            initContext("createTaskAttachment");

            try {
              val response = sendBase(createTaskAttachment_args(request), new CreateTaskAttachment_argsSerializer(), new CreateTaskAttachment_resultSerializer())

              response.success

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def deleteTaskAttachment(id:Int ) : Unit = {

            initContext("deleteTaskAttachment");

            try {
              val response = sendBase(deleteTaskAttachment_args(id), new DeleteTaskAttachment_argsSerializer(), new DeleteTaskAttachment_resultSerializer())

              

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def findAllTaskNos4Picker() : List[com.isuwang.soa.scala.task.domain.TTaskPickerContainer] = {

            initContext("findAllTaskNos4Picker");

            try {
              val response = sendBase(findAllTaskNos4Picker_args(), new FindAllTaskNos4Picker_argsSerializer(), new FindAllTaskNos4Picker_resultSerializer())

              response.success

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          

        /**
        * getServiceMetadata
        **/
        @throws[SoaException]
        def getServiceMetadata: String = {
          initContext("getServiceMetadata")
          try {
            val _request = new getServiceMetadata_args()
            val _response = sendBase(_request, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer())
            _response.success
          }catch{
            case e: SoaException => throw e
            case e: TException => throw new SoaException(e)
          }
          finally {
            destoryContext()
          }
        }

        }
      