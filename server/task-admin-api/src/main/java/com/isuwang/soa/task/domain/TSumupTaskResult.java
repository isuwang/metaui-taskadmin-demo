package com.isuwang.soa.task.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class TSumupTaskResult{
        
            /**
            *
            **/
            public int taskCount ;
            public int getTaskCount(){ return this.taskCount; }
            public void setTaskCount(int taskCount){ this.taskCount = taskCount; }

            public int taskCount(){ return this.taskCount; }
            public TSumupTaskResult taskCount(int taskCount){ this.taskCount = taskCount; return this; }
          
            /**
            *
            **/
            public int companyCount ;
            public int getCompanyCount(){ return this.companyCount; }
            public void setCompanyCount(int companyCount){ this.companyCount = companyCount; }

            public int companyCount(){ return this.companyCount; }
            public TSumupTaskResult companyCount(int companyCount){ this.companyCount = companyCount; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("taskCount").append("\":").append(this.taskCount).append(",");
    stringBuilder.append("\"").append("companyCount").append("\":").append(this.companyCount).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      