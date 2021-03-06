package com.isuwang.soa.task.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class TUpdateTaskRequest{
        
            /**
            *

 任务记录id

            **/
            public int taskId ;
            public int getTaskId(){ return this.taskId; }
            public void setTaskId(int taskId){ this.taskId = taskId; }

            public int taskId(){ return this.taskId; }
            public TUpdateTaskRequest taskId(int taskId){ this.taskId = taskId; return this; }
          
            /**
            *

 任务类型，1: 待办事项, 2: 投诉, 3: 回访记录

            **/
            public int type ;
            public int getType(){ return this.type; }
            public void setType(int type){ this.type = type; }

            public int type(){ return this.type; }
            public TUpdateTaskRequest type(int type){ this.type = type; return this; }
          
            /**
            *

 状态，1：待处理，2: 处理中，3：已处理，4：无需处理

            **/
            public int status ;
            public int getStatus(){ return this.status; }
            public void setStatus(int status){ this.status = status; }

            public int status(){ return this.status; }
            public TUpdateTaskRequest status(int status){ this.status = status; return this; }
          
            /**
            *

 业务类型id

            **/
            public int businessTypeId ;
            public int getBusinessTypeId(){ return this.businessTypeId; }
            public void setBusinessTypeId(int businessTypeId){ this.businessTypeId = businessTypeId; }

            public int businessTypeId(){ return this.businessTypeId; }
            public TUpdateTaskRequest businessTypeId(int businessTypeId){ this.businessTypeId = businessTypeId; return this; }
          
            /**
            *

 优先级, 1:高， 2: 中, 3: 低

            **/
            public int priority ;
            public int getPriority(){ return this.priority; }
            public void setPriority(int priority){ this.priority = priority; }

            public int priority(){ return this.priority; }
            public TUpdateTaskRequest priority(int priority){ this.priority = priority; return this; }
          
            /**
            *

 任务主题

            **/
            public String taskSubject ;
            public String getTaskSubject(){ return this.taskSubject; }
            public void setTaskSubject(String taskSubject){ this.taskSubject = taskSubject; }

            public String taskSubject(){ return this.taskSubject; }
            public TUpdateTaskRequest taskSubject(String taskSubject){ this.taskSubject = taskSubject; return this; }
          
            /**
            *

 关联的公司id

            **/
            public Optional<Integer> companyId = Optional.empty();
            public Optional<Integer> getCompanyId(){ return this.companyId; }
            public void setCompanyId(Optional<Integer> companyId){ this.companyId = companyId; }

            public Optional<Integer> companyId(){ return this.companyId; }
            public TUpdateTaskRequest companyId(Optional<Integer> companyId){ this.companyId = companyId; return this; }
          
            /**
            *

 沟通姿势/方式, 1: 微信...

            **/
            public Optional<Integer> communicationStyle = Optional.empty();
            public Optional<Integer> getCommunicationStyle(){ return this.communicationStyle; }
            public void setCommunicationStyle(Optional<Integer> communicationStyle){ this.communicationStyle = communicationStyle; }

            public Optional<Integer> communicationStyle(){ return this.communicationStyle; }
            public TUpdateTaskRequest communicationStyle(Optional<Integer> communicationStyle){ this.communicationStyle = communicationStyle; return this; }
          
            /**
            *

 计划日期

            **/
            public Optional<Long> planAt = Optional.empty();
            public Optional<Long> getPlanAt(){ return this.planAt; }
            public void setPlanAt(Optional<Long> planAt){ this.planAt = planAt; }

            public Optional<Long> planAt(){ return this.planAt; }
            public TUpdateTaskRequest planAt(Optional<Long> planAt){ this.planAt = planAt; return this; }
          
            /**
            *

 经办人

            **/
            public Optional<Integer> handlerId = Optional.empty();
            public Optional<Integer> getHandlerId(){ return this.handlerId; }
            public void setHandlerId(Optional<Integer> handlerId){ this.handlerId = handlerId; }

            public Optional<Integer> handlerId(){ return this.handlerId; }
            public TUpdateTaskRequest handlerId(Optional<Integer> handlerId){ this.handlerId = handlerId; return this; }
          
            /**
            *

 计划或投诉问题

            **/
            public Optional<String> problemDesc = Optional.empty();
            public Optional<String> getProblemDesc(){ return this.problemDesc; }
            public void setProblemDesc(Optional<String> problemDesc){ this.problemDesc = problemDesc; }

            public Optional<String> problemDesc(){ return this.problemDesc; }
            public TUpdateTaskRequest problemDesc(Optional<String> problemDesc){ this.problemDesc = problemDesc; return this; }
          
            /**
            *

 结果

            **/
            public Optional<String> resultDesc = Optional.empty();
            public Optional<String> getResultDesc(){ return this.resultDesc; }
            public void setResultDesc(Optional<String> resultDesc){ this.resultDesc = resultDesc; }

            public Optional<String> resultDesc(){ return this.resultDesc; }
            public TUpdateTaskRequest resultDesc(Optional<String> resultDesc){ this.resultDesc = resultDesc; return this; }
          
            /**
            *

 问题

            **/
            public Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> questions = Optional.empty();
            public Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> getQuestions(){ return this.questions; }
            public void setQuestions(Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> questions){ this.questions = questions; }

            public Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> questions(){ return this.questions; }
            public TUpdateTaskRequest questions(Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> questions){ this.questions = questions; return this; }
          
            /**
            *

 改进措施

            **/
            public Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> improvements = Optional.empty();
            public Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> getImprovements(){ return this.improvements; }
            public void setImprovements(Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> improvements){ this.improvements = improvements; }

            public Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> improvements(){ return this.improvements; }
            public TUpdateTaskRequest improvements(Optional<java.util.List<com.isuwang.soa.task.domain.TTaskItemRequest>> improvements){ this.improvements = improvements; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("taskId").append("\":").append(this.taskId).append(",");
    stringBuilder.append("\"").append("type").append("\":").append(this.type).append(",");
    stringBuilder.append("\"").append("status").append("\":").append(this.status).append(",");
    stringBuilder.append("\"").append("businessTypeId").append("\":").append(this.businessTypeId).append(",");
    stringBuilder.append("\"").append("priority").append("\":").append(this.priority).append(",");
    stringBuilder.append("\"").append("taskSubject").append("\":\"").append(this.taskSubject).append("\",");
    stringBuilder.append("\"").append("companyId").append("\":").append(this.companyId.isPresent()?this.companyId.get():null).append(",");
    stringBuilder.append("\"").append("communicationStyle").append("\":").append(this.communicationStyle.isPresent()?this.communicationStyle.get():null).append(",");
    stringBuilder.append("\"").append("planAt").append("\":").append(this.planAt.isPresent()?this.planAt.get():null).append(",");
    stringBuilder.append("\"").append("handlerId").append("\":").append(this.handlerId.isPresent()?this.handlerId.get():null).append(",");
    stringBuilder.append("\"").append("problemDesc").append("\":\"").append(this.problemDesc.isPresent()?this.problemDesc.get():null).append("\",");
    stringBuilder.append("\"").append("resultDesc").append("\":\"").append(this.resultDesc.isPresent()?this.resultDesc.get():null).append("\",");
    stringBuilder.append("\"").append("questions").append("\":").append(this.questions.isPresent()?this.questions.get():null).append(",");
    stringBuilder.append("\"").append("improvements").append("\":").append(this.improvements.isPresent()?this.improvements.get():null).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      