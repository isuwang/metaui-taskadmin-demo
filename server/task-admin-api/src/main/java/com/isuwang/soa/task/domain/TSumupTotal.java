package com.isuwang.soa.task.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class TSumupTotal{
        
            /**
            *
            **/
            public int taskType ;
            public int getTaskType(){ return this.taskType; }
            public void setTaskType(int taskType){ this.taskType = taskType; }

            public int taskType(){ return this.taskType; }
            public TSumupTotal taskType(int taskType){ this.taskType = taskType; return this; }
          
            /**
            *
            **/
            public String taskTypeName ;
            public String getTaskTypeName(){ return this.taskTypeName; }
            public void setTaskTypeName(String taskTypeName){ this.taskTypeName = taskTypeName; }

            public String taskTypeName(){ return this.taskTypeName; }
            public TSumupTotal taskTypeName(String taskTypeName){ this.taskTypeName = taskTypeName; return this; }
          
            /**
            *
            **/
            public int taskCount ;
            public int getTaskCount(){ return this.taskCount; }
            public void setTaskCount(int taskCount){ this.taskCount = taskCount; }

            public int taskCount(){ return this.taskCount; }
            public TSumupTotal taskCount(int taskCount){ this.taskCount = taskCount; return this; }
          
            /**
            *
            **/
            public int companyCount ;
            public int getCompanyCount(){ return this.companyCount; }
            public void setCompanyCount(int companyCount){ this.companyCount = companyCount; }

            public int companyCount(){ return this.companyCount; }
            public TSumupTotal companyCount(int companyCount){ this.companyCount = companyCount; return this; }
          
            /**
            *
            **/
            public String planAtFromTo ;
            public String getPlanAtFromTo(){ return this.planAtFromTo; }
            public void setPlanAtFromTo(String planAtFromTo){ this.planAtFromTo = planAtFromTo; }

            public String planAtFromTo(){ return this.planAtFromTo; }
            public TSumupTotal planAtFromTo(String planAtFromTo){ this.planAtFromTo = planAtFromTo; return this; }
          
            /**
            *
            **/
            public String updatedAtFromTo ;
            public String getUpdatedAtFromTo(){ return this.updatedAtFromTo; }
            public void setUpdatedAtFromTo(String updatedAtFromTo){ this.updatedAtFromTo = updatedAtFromTo; }

            public String updatedAtFromTo(){ return this.updatedAtFromTo; }
            public TSumupTotal updatedAtFromTo(String updatedAtFromTo){ this.updatedAtFromTo = updatedAtFromTo; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("taskType").append("\":").append(this.taskType).append(",");
    stringBuilder.append("\"").append("taskTypeName").append("\":\"").append(this.taskTypeName).append("\",");
    stringBuilder.append("\"").append("taskCount").append("\":").append(this.taskCount).append(",");
    stringBuilder.append("\"").append("companyCount").append("\":").append(this.companyCount).append(",");
    stringBuilder.append("\"").append("planAtFromTo").append("\":\"").append(this.planAtFromTo).append("\",");
    stringBuilder.append("\"").append("updatedAtFromTo").append("\":\"").append(this.updatedAtFromTo).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      