package com.isuwang.soa.meta.dbc.domain
import wangzx.scala_commons.sql._

/**
  * @author dapeng-tool
  */@Table(value = "fields", camelToUnderscore = true)
class Fields extends java.io.Serializable {
  /**
    *
    */
  @Id(auto=true)
  var id : Int =_

  var structName : String =_

  /**
    * 字段名，如"orderNo"
    */
  var name : String =_

  /**
    * 替换元素，如 "paper-input"
    */
  var element : String =_

  /**
    * 字段名，如"订单号"
    */
  var label : String =_

  /**
    * 是否必填 1: 是 0：否
    */
  var required : Int =_

  /**
    * 多否多选  1: 是 0：否
    */
  var multi : Int =_

  /**
    * 显示格式，用于日期显示，如“yyyy-MM-dd”
    */
  var format : String =_

  /**
    * 是否可编辑  1: 是 0：否
    */
  var editable : Int =_

  /**
    * 前是否需要校验， 1: 是 0：否
    */
  var validate : Int =_

  /**
    * 字符允许长度
    */
  var length : Int =_

  /**
    * 允许最大长度
    */
  var maxLength : Int =_

  /**
    * 允许最小长度
    */
  var minLength : Int =_

  /**
    * 正则匹配
    */
  var regexp : String =_

  /**
    * 校验失败时的提示语，如“请输入备注”
    */
  var prompt : String =_

  /**
    * 数字最小值
    */
  var min : Int =_

  /**
    * 数字最大值
    */
  var max : Int =_

  /**
    * 下拉选项中的值，json串，如 "[{value:1,label:'男'},{value:2,label:'女'}]"
    */
  var candidates : String =_

  /**
    * 组件显示字段名，针对下拉组件、radio-group组件等，“label”
    */
  var candidateLabel : String =_

  /**
    * 组件值字段名，针对下拉组件、radio-group组件等，“value”
    */
  var candidateValue : String =_

  /**
    * placeholder
    */
  var placeholder : String =_

  /**
    * 源字段，如"orderNum"
    */
  var srcKey : String =_

  /**
    * 界面是否可见 1: 是 0：否
    */
  var visible : Int =_

  /**
    * 是否禁用组件
    */
  var disabled : Int =_
  /**
    *
    */
  var createdAt : java.sql.Timestamp =_

  /**
    *
    */
  var createdBy : Int =_

  /**
    *
    */
  var updatedAt : java.sql.Timestamp =_

  /**
    *
    */
  var updatedBy : Int =_

}
