package com.isuwang.soa.task.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class TSuggestion{
        
            /**
            *
            **/
            public int id ;
            public int getId(){ return this.id; }
            public void setId(int id){ this.id = id; }

            public int id(){ return this.id; }
            public TSuggestion id(int id){ this.id = id; return this; }
          
            /**
            *

 意见类型，1: 问题, 2: 改进

            **/
            public int type ;
            public int getType(){ return this.type; }
            public void setType(int type){ this.type = type; }

            public int type(){ return this.type; }
            public TSuggestion type(int type){ this.type = type; return this; }
          
            /**
            *

 内容

            **/
            public String content ;
            public String getContent(){ return this.content; }
            public void setContent(String content){ this.content = content; }

            public String content(){ return this.content; }
            public TSuggestion content(String content){ this.content = content; return this; }
          
            /**
            *

 标签，多个标签逗号分隔

            **/
            public Optional<String> labels = Optional.empty();
            public Optional<String> getLabels(){ return this.labels; }
            public void setLabels(Optional<String> labels){ this.labels = labels; }

            public Optional<String> labels(){ return this.labels; }
            public TSuggestion labels(Optional<String> labels){ this.labels = labels; return this; }
          
            /**
            *

 帮助

            **/
            public Optional<String> assistance = Optional.empty();
            public Optional<String> getAssistance(){ return this.assistance; }
            public void setAssistance(Optional<String> assistance){ this.assistance = assistance; }

            public Optional<String> assistance(){ return this.assistance; }
            public TSuggestion assistance(Optional<String> assistance){ this.assistance = assistance; return this; }
          
            /**
            *



            **/
            public long createdAt ;
            public long getCreatedAt(){ return this.createdAt; }
            public void setCreatedAt(long createdAt){ this.createdAt = createdAt; }

            public long createdAt(){ return this.createdAt; }
            public TSuggestion createdAt(long createdAt){ this.createdAt = createdAt; return this; }
          
            /**
            *



            **/
            public Optional<Integer> createdBy = Optional.empty();
            public Optional<Integer> getCreatedBy(){ return this.createdBy; }
            public void setCreatedBy(Optional<Integer> createdBy){ this.createdBy = createdBy; }

            public Optional<Integer> createdBy(){ return this.createdBy; }
            public TSuggestion createdBy(Optional<Integer> createdBy){ this.createdBy = createdBy; return this; }
          
            /**
            *



            **/
            public long updatedAt ;
            public long getUpdatedAt(){ return this.updatedAt; }
            public void setUpdatedAt(long updatedAt){ this.updatedAt = updatedAt; }

            public long updatedAt(){ return this.updatedAt; }
            public TSuggestion updatedAt(long updatedAt){ this.updatedAt = updatedAt; return this; }
          
            /**
            *



            **/
            public Optional<Integer> updatedBy = Optional.empty();
            public Optional<Integer> getUpdatedBy(){ return this.updatedBy; }
            public void setUpdatedBy(Optional<Integer> updatedBy){ this.updatedBy = updatedBy; }

            public Optional<Integer> updatedBy(){ return this.updatedBy; }
            public TSuggestion updatedBy(Optional<Integer> updatedBy){ this.updatedBy = updatedBy; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("id").append("\":").append(this.id).append(",");
    stringBuilder.append("\"").append("type").append("\":").append(this.type).append(",");
    stringBuilder.append("\"").append("content").append("\":\"").append(this.content).append("\",");
    stringBuilder.append("\"").append("labels").append("\":\"").append(this.labels.isPresent()?this.labels.get():null).append("\",");
    stringBuilder.append("\"").append("assistance").append("\":\"").append(this.assistance.isPresent()?this.assistance.get():null).append("\",");
    stringBuilder.append("\"").append("createdAt").append("\":").append(this.createdAt).append(",");
    stringBuilder.append("\"").append("createdBy").append("\":").append(this.createdBy.isPresent()?this.createdBy.get():null).append(",");
    stringBuilder.append("\"").append("updatedAt").append("\":").append(this.updatedAt).append(",");
    stringBuilder.append("\"").append("updatedBy").append("\":").append(this.updatedBy.isPresent()?this.updatedBy.get():null).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      