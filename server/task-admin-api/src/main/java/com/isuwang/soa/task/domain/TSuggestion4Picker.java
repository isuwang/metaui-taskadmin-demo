package com.isuwang.soa.task.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class TSuggestion4Picker{
        
            /**
            *
            **/
            public int suggestionId ;
            public int getSuggestionId(){ return this.suggestionId; }
            public void setSuggestionId(int suggestionId){ this.suggestionId = suggestionId; }

            public int suggestionId(){ return this.suggestionId; }
            public TSuggestion4Picker suggestionId(int suggestionId){ this.suggestionId = suggestionId; return this; }
          
            /**
            *
            **/
            public String suggestionContent ;
            public String getSuggestionContent(){ return this.suggestionContent; }
            public void setSuggestionContent(String suggestionContent){ this.suggestionContent = suggestionContent; }

            public String suggestionContent(){ return this.suggestionContent; }
            public TSuggestion4Picker suggestionContent(String suggestionContent){ this.suggestionContent = suggestionContent; return this; }
          
            /**
            *
            **/
            public int suggestionType ;
            public int getSuggestionType(){ return this.suggestionType; }
            public void setSuggestionType(int suggestionType){ this.suggestionType = suggestionType; }

            public int suggestionType(){ return this.suggestionType; }
            public TSuggestion4Picker suggestionType(int suggestionType){ this.suggestionType = suggestionType; return this; }
          
            /**
            *
            **/
            public String suggestionTypeName ;
            public String getSuggestionTypeName(){ return this.suggestionTypeName; }
            public void setSuggestionTypeName(String suggestionTypeName){ this.suggestionTypeName = suggestionTypeName; }

            public String suggestionTypeName(){ return this.suggestionTypeName; }
            public TSuggestion4Picker suggestionTypeName(String suggestionTypeName){ this.suggestionTypeName = suggestionTypeName; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("suggestionId").append("\":").append(this.suggestionId).append(",");
    stringBuilder.append("\"").append("suggestionContent").append("\":\"").append(this.suggestionContent).append("\",");
    stringBuilder.append("\"").append("suggestionType").append("\":").append(this.suggestionType).append(",");
    stringBuilder.append("\"").append("suggestionTypeName").append("\":\"").append(this.suggestionTypeName).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      