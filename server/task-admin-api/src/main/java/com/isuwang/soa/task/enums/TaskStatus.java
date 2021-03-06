package com.isuwang.soa.task.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 
        **/
        public enum TaskStatus implements com.isuwang.org.apache.thrift.TEnum{
        
            /**
            *

待处理

            **/
            SUSPENDING(1),
          
            /**
            *

处理中

            **/
            HANDLING(2),
          
            /**
            *

 已处理

            **/
            SOLVED(3),
          
            /**
            *

 无需处理

            **/
            NEEDLESS_TO_HANDLE(4);
          

        private final int value;

        private TaskStatus(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public static TaskStatus findByValue(int value){
            switch(value){
            
                 case 1:
                    return SUSPENDING;
               
                 case 2:
                    return HANDLING;
               
                 case 3:
                    return SOLVED;
               
                 case 4:
                    return NEEDLESS_TO_HANDLE;
               
               default:
                   return null;
            }
        }
        }
      