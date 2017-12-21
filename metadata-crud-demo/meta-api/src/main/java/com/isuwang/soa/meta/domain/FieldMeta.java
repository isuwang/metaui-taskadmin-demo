package com.isuwang.soa.meta.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.1.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class FieldMeta{
        
            /**
            *

  idl 数据类型， primitive|list|map|set|struct|action，如“i32”、“list”，“TOrder”


 ui元素，缺省时，会根据datatype和dataTypeExtra，提供默认ui：h2-text|h2-textarea|h2-select-list|h2-radio-group|h2-checkbox

            **/
            public Optional<String> element = Optional.empty();
            public Optional<String> getElement(){ return this.element; }
            public void setElement(Optional<String> element){ this.element = element; }

            public Optional<String> element(){ return this.element; }
            public FieldMeta element(Optional<String> element){ this.element = element; return this; }
          
            /**
            *

 字段名，如“orderNo”

            **/
            public String name ;
            public String getName(){ return this.name; }
            public void setName(String name){ this.name = name; }

            public String name(){ return this.name; }
            public FieldMeta name(String name){ this.name = name; return this; }
          
            /**
            *

 字段名，如“订单号”

            **/
            public Optional<String> label = Optional.empty();
            public Optional<String> getLabel(){ return this.label; }
            public void setLabel(Optional<String> label){ this.label = label; }

            public Optional<String> label(){ return this.label; }
            public FieldMeta label(Optional<String> label){ this.label = label; return this; }
          
            /**
            *

 是否必填，true | false

            **/
            public boolean isRequired ;
            public boolean getIsRequired(){ return this.isRequired; }
            public void setIsRequired(boolean isRequired){ this.isRequired = isRequired; }

            public boolean isRequired(){ return this.isRequired; }
            public FieldMeta isRequired(boolean isRequired){ this.isRequired = isRequired; return this; }
          
            /**
            *

 多否多选，true | false

            **/
            public boolean mutil ;
            public boolean getMutil(){ return this.mutil; }
            public void setMutil(boolean mutil){ this.mutil = mutil; }

            public boolean mutil(){ return this.mutil; }
            public FieldMeta mutil(boolean mutil){ this.mutil = mutil; return this; }
          
            /**
            *

 显示格式，用于日期显示，如“yyyy-MM-dd”

            **/
            public Optional<String> format = Optional.empty();
            public Optional<String> getFormat(){ return this.format; }
            public void setFormat(Optional<String> format){ this.format = format; }

            public Optional<String> format(){ return this.format; }
            public FieldMeta format(Optional<String> format){ this.format = format; return this; }
          
            /**
            *

 是否可编辑，true|false

            **/
            public boolean editable ;
            public boolean getEditable(){ return this.editable; }
            public void setEditable(boolean editable){ this.editable = editable; }

            public boolean editable(){ return this.editable; }
            public FieldMeta editable(boolean editable){ this.editable = editable; return this; }
          
            /**
            *

 前是否需要校验，true|false

            **/
            public boolean validate ;
            public boolean getValidate(){ return this.validate; }
            public void setValidate(boolean validate){ this.validate = validate; }

            public boolean validate(){ return this.validate; }
            public FieldMeta validate(boolean validate){ this.validate = validate; return this; }
          
            /**
            *

 字符长度

            **/
            public Optional<Integer> length = Optional.empty();
            public Optional<Integer> getLength(){ return this.length; }
            public void setLength(Optional<Integer> length){ this.length = length; }

            public Optional<Integer> length(){ return this.length; }
            public FieldMeta length(Optional<Integer> length){ this.length = length; return this; }
          
            /**
            *

 允许最大长度

            **/
            public Optional<Integer> maxLength = Optional.empty();
            public Optional<Integer> getMaxLength(){ return this.maxLength; }
            public void setMaxLength(Optional<Integer> maxLength){ this.maxLength = maxLength; }

            public Optional<Integer> maxLength(){ return this.maxLength; }
            public FieldMeta maxLength(Optional<Integer> maxLength){ this.maxLength = maxLength; return this; }
          
            /**
            *

 允许最小长度

            **/
            public Optional<Integer> minLength = Optional.empty();
            public Optional<Integer> getMinLength(){ return this.minLength; }
            public void setMinLength(Optional<Integer> minLength){ this.minLength = minLength; }

            public Optional<Integer> minLength(){ return this.minLength; }
            public FieldMeta minLength(Optional<Integer> minLength){ this.minLength = minLength; return this; }
          
            /**
            *

 正则匹配

            **/
            public Optional<String> regexp = Optional.empty();
            public Optional<String> getRegexp(){ return this.regexp; }
            public void setRegexp(Optional<String> regexp){ this.regexp = regexp; }

            public Optional<String> regexp(){ return this.regexp; }
            public FieldMeta regexp(Optional<String> regexp){ this.regexp = regexp; return this; }
          
            /**
            *

  校验失败时的提示语，如“请输入备注”

            **/
            public Optional<String> prompt = Optional.empty();
            public Optional<String> getPrompt(){ return this.prompt; }
            public void setPrompt(Optional<String> prompt){ this.prompt = prompt; }

            public Optional<String> prompt(){ return this.prompt; }
            public FieldMeta prompt(Optional<String> prompt){ this.prompt = prompt; return this; }
          
            /**
            *

 数字最小值

            **/
            public Optional<Integer> min = Optional.empty();
            public Optional<Integer> getMin(){ return this.min; }
            public void setMin(Optional<Integer> min){ this.min = min; }

            public Optional<Integer> min(){ return this.min; }
            public FieldMeta min(Optional<Integer> min){ this.min = min; return this; }
          
            /**
            *

 数字最大值

            **/
            public Optional<Integer> max = Optional.empty();
            public Optional<Integer> getMax(){ return this.max; }
            public void setMax(Optional<Integer> max){ this.max = max; }

            public Optional<Integer> max(){ return this.max; }
            public FieldMeta max(Optional<Integer> max){ this.max = max; return this; }
          
            /**
            *

 placeholder

            **/
            public Optional<String> placeholder = Optional.empty();
            public Optional<String> getPlaceholder(){ return this.placeholder; }
            public void setPlaceholder(Optional<String> placeholder){ this.placeholder = placeholder; }

            public Optional<String> placeholder(){ return this.placeholder; }
            public FieldMeta placeholder(Optional<String> placeholder){ this.placeholder = placeholder; return this; }
          
            /**
            *

 候选值，下拉选项中的值，json串，如 "[{value:1,label:'男'},{value:2,label:'女'}]"

            **/
            public Optional<String> candidates = Optional.empty();
            public Optional<String> getCandidates(){ return this.candidates; }
            public void setCandidates(Optional<String> candidates){ this.candidates = candidates; }

            public Optional<String> candidates(){ return this.candidates; }
            public FieldMeta candidates(Optional<String> candidates){ this.candidates = candidates; return this; }
          
            /**
            *

 组件显示字段名，针对下拉组件、radio-group组件等，“label”

            **/
            public Optional<String> candidateLabel = Optional.empty();
            public Optional<String> getCandidateLabel(){ return this.candidateLabel; }
            public void setCandidateLabel(Optional<String> candidateLabel){ this.candidateLabel = candidateLabel; }

            public Optional<String> candidateLabel(){ return this.candidateLabel; }
            public FieldMeta candidateLabel(Optional<String> candidateLabel){ this.candidateLabel = candidateLabel; return this; }
          
            /**
            *

 组件值字段名，针对下拉组件、radio-group组件等，“value”

            **/
            public Optional<String> candidateValue = Optional.empty();
            public Optional<String> getCandidateValue(){ return this.candidateValue; }
            public void setCandidateValue(Optional<String> candidateValue){ this.candidateValue = candidateValue; }

            public Optional<String> candidateValue(){ return this.candidateValue; }
            public FieldMeta candidateValue(Optional<String> candidateValue){ this.candidateValue = candidateValue; return this; }
          
            /**
            *

 源字段名,如 "orderNum"

            **/
            public Optional<String> srcKey = Optional.empty();
            public Optional<String> getSrcKey(){ return this.srcKey; }
            public void setSrcKey(Optional<String> srcKey){ this.srcKey = srcKey; }

            public Optional<String> srcKey(){ return this.srcKey; }
            public FieldMeta srcKey(Optional<String> srcKey){ this.srcKey = srcKey; return this; }
          
            /**
            *

 界面是否可见，仅对表单中的字段有效， 默认true

            **/
            public boolean visible ;
            public boolean getVisible(){ return this.visible; }
            public void setVisible(boolean visible){ this.visible = visible; }

            public boolean visible(){ return this.visible; }
            public FieldMeta visible(boolean visible){ this.visible = visible; return this; }
          
            /**
            *

 是否禁用组件

            **/
            public boolean disabled ;
            public boolean getDisabled(){ return this.disabled; }
            public void setDisabled(boolean disabled){ this.disabled = disabled; }

            public boolean disabled(){ return this.disabled; }
            public FieldMeta disabled(boolean disabled){ this.disabled = disabled; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("element").append("\":\"").append(this.element.isPresent()?this.element.get():null).append("\",");
    stringBuilder.append("\"").append("name").append("\":\"").append(this.name).append("\",");
    stringBuilder.append("\"").append("label").append("\":\"").append(this.label.isPresent()?this.label.get():null).append("\",");
    stringBuilder.append("\"").append("isRequired").append("\":").append(this.isRequired).append(",");
    stringBuilder.append("\"").append("mutil").append("\":").append(this.mutil).append(",");
    stringBuilder.append("\"").append("format").append("\":\"").append(this.format.isPresent()?this.format.get():null).append("\",");
    stringBuilder.append("\"").append("editable").append("\":").append(this.editable).append(",");
    stringBuilder.append("\"").append("validate").append("\":").append(this.validate).append(",");
    stringBuilder.append("\"").append("length").append("\":").append(this.length.isPresent()?this.length.get():null).append(",");
    stringBuilder.append("\"").append("maxLength").append("\":").append(this.maxLength.isPresent()?this.maxLength.get():null).append(",");
    stringBuilder.append("\"").append("minLength").append("\":").append(this.minLength.isPresent()?this.minLength.get():null).append(",");
    stringBuilder.append("\"").append("regexp").append("\":\"").append(this.regexp.isPresent()?this.regexp.get():null).append("\",");
    stringBuilder.append("\"").append("prompt").append("\":\"").append(this.prompt.isPresent()?this.prompt.get():null).append("\",");
    stringBuilder.append("\"").append("min").append("\":").append(this.min.isPresent()?this.min.get():null).append(",");
    stringBuilder.append("\"").append("max").append("\":").append(this.max.isPresent()?this.max.get():null).append(",");
    stringBuilder.append("\"").append("placeholder").append("\":\"").append(this.placeholder.isPresent()?this.placeholder.get():null).append("\",");
    stringBuilder.append("\"").append("candidates").append("\":\"").append(this.candidates.isPresent()?this.candidates.get():null).append("\",");
    stringBuilder.append("\"").append("candidateLabel").append("\":\"").append(this.candidateLabel.isPresent()?this.candidateLabel.get():null).append("\",");
    stringBuilder.append("\"").append("candidateValue").append("\":\"").append(this.candidateValue.isPresent()?this.candidateValue.get():null).append("\",");
    stringBuilder.append("\"").append("srcKey").append("\":\"").append(this.srcKey.isPresent()?this.srcKey.get():null).append("\",");
    stringBuilder.append("\"").append("visible").append("\":").append(this.visible).append(",");
    stringBuilder.append("\"").append("disabled").append("\":").append(this.disabled).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      