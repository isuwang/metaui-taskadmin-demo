package com.isuwang.soa.task.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 
        **/
        public enum TaskType implements com.isuwang.org.apache.thrift.TEnum{
        
            /**
            *

待办事项

            **/
            TODO(1),
          
            /**
            *

 投诉

            **/
            COMPLAINT(2),
          
            /**
            *

 回访记录

            **/
            REVIEW_RECORD(3);
          

        private final int value;

        private TaskType(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public static TaskType findByValue(int value){
            switch(value){
            
                 case 1:
                    return TODO;
               
                 case 2:
                    return COMPLAINT;
               
                 case 3:
                    return REVIEW_RECORD;
               
               default:
                   return null;
            }
        }
        }
      