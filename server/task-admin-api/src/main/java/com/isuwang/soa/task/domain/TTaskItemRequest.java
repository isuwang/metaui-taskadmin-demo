package com.isuwang.soa.task.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class TTaskItemRequest{
        
            /**
            *

 意见id

            **/
            public int suggestionId ;
            public int getSuggestionId(){ return this.suggestionId; }
            public void setSuggestionId(int suggestionId){ this.suggestionId = suggestionId; }

            public int suggestionId(){ return this.suggestionId; }
            public TTaskItemRequest suggestionId(int suggestionId){ this.suggestionId = suggestionId; return this; }
          
            /**
            *

 意见类型

            **/
            public int suggestionType ;
            public int getSuggestionType(){ return this.suggestionType; }
            public void setSuggestionType(int suggestionType){ this.suggestionType = suggestionType; }

            public int suggestionType(){ return this.suggestionType; }
            public TTaskItemRequest suggestionType(int suggestionType){ this.suggestionType = suggestionType; return this; }
          
            /**
            *

 意见备注

            **/
            public Optional<String> suggestionRemark = Optional.empty();
            public Optional<String> getSuggestionRemark(){ return this.suggestionRemark; }
            public void setSuggestionRemark(Optional<String> suggestionRemark){ this.suggestionRemark = suggestionRemark; }

            public Optional<String> suggestionRemark(){ return this.suggestionRemark; }
            public TTaskItemRequest suggestionRemark(Optional<String> suggestionRemark){ this.suggestionRemark = suggestionRemark; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("suggestionId").append("\":").append(this.suggestionId).append(",");
    stringBuilder.append("\"").append("suggestionType").append("\":").append(this.suggestionType).append(",");
    stringBuilder.append("\"").append("suggestionRemark").append("\":\"").append(this.suggestionRemark.isPresent()?this.suggestionRemark.get():null).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      