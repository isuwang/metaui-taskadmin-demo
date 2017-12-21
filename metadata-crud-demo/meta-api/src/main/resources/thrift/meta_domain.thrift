include "base_model.thrift"
namespace java com.isuwang.soa.meta.domain


struct TFieldMeta {
    1: i32 id

    2: string structName
    /**
    * 字段名，如“orderNo”
    **/
    4: string name,
    /**
    * 字段名，如“订单号”
    **/
    5: optional string label,
    /**
    * 是否必填，true | false
    **/
    6: bool isRequired,
    /**
    * 多否多选，true | false
    **/
    7: bool multi,
    /**
    * 是否可编辑，true|false
    **/
    9: bool editable,
    /**
    * 前是否需要校验，true|false
    **/
    10: bool validate,

    /**
     * 界面是否可见，仅对表单中的字段有效， 默认true
    **/
    23: bool visible

    /**
    * 是否禁用组件
    **/
    24: bool disabled
    /**
    * ui元素，缺省时，会根据datatype和dataTypeExtra，提供默认ui：m2-text|m2-textarea|m2-select-list|m2-radio-group|m2-checkbox
    **/
    3: optional string element,
    /**
    * 显示格式，用于日期显示，如“yyyy-MM-dd”
    **/
    8: optional string format,
    /**
    * 字符长度
    **/
    11: optional i32 length,
    /**
    * 允许最大长度
    **/
    12: optional i32 maxLength,
    /**
    * 允许最小长度
    **/
    13: optional i32 minLength,
    /**
    * 正则匹配
    **/
    14: optional string regexp,
    /**
    *  校验失败时的提示语，如“请输入备注”
    **/
    15: optional string prompt,
    /**
    * 数字最小值
    **/
    16: optional i32 min,
    /**
    * 数字最大值
    **/
    17: optional i32 max,
    /**
    * placeholder
    **/
    18: optional string placeholder,
    /**
    * 候选值，下拉选项中的值，json串，如 "[{value:1,label:'男'},{value:2,label:'女'}]"
    **/
    19: optional string candidates,
    /**
    * 组件显示字段名，针对下拉组件、radio-group组件等，“label”
    **/
    20: optional string candidateLabel,
    /**
    * 组件值字段名，针对下拉组件、radio-group组件等，“value”
    **/
    21: optional string candidateValue

    /**
    * 源字段名,如 "orderNum"
    **/
    22: optional string srcKey,

}

struct TFieldMetaResponse {
    1: base_model.TPageResponse pageResponse
    2: list<TFieldMeta> rows
}

struct TFieldMetaRequest {
    1: base_model.TPageRequest pageRequest
    2: optional string structName
    3: optional string name
}

struct TFieldMetaSaveRequest {
    1: optional i32 id

    2: string structName
    /**
        * 字段名，如“orderNo”
        **/
        4: string name,
    /**
    * ui元素，缺省时，会根据datatype和dataTypeExtra，提供默认ui：m2-text|m2-textarea|m2-select-list|m2-radio-group|m2-checkbox
    **/
    3: optional string element,

    /**
    * 字段名，如“订单号”
    **/
    5: string label,
    /**
    * 是否必填，true | false
    **/
    6: bool isRequired,
    /**
    * 多否多选，true | false
    **/
    7: bool multi,
    /**
    * 显示格式，用于日期显示，如“yyyy-MM-dd”
    **/
    8: optional string format,
    /**
    * 是否可编辑，true|false
    **/
    9: bool editable,
    /**
    * 前是否需要校验，true|false
    **/
    10: bool validate,
    /**
    * 字符长度
    **/
    11: optional i32 length,
    /**
    * 允许最大长度
    **/
    12: optional i32 maxLength,
    /**
    * 允许最小长度
    **/
    13: optional i32 minLength,
    /**
    * 正则匹配
    **/
    14: optional string regexp,
    /**
    *  校验失败时的提示语，如“请输入备注”
    **/
    15: optional string prompt,
    /**
    * 数字最小值
    **/
    16: optional i32 min,
    /**
    * 数字最大值
    **/
    17: optional i32 max,
    /**
    * placeholder
    **/
    18: optional string placeholder,
    /**
    * 候选值，下拉选项中的值，json串，如 "[{value:1,label:'男'},{value:2,label:'女'}]"
    **/
    19: optional string candidates,
    /**
    * 组件显示字段名，针对下拉组件、radio-group组件等，“label”
    **/
    20: optional string candidateLabel,
    /**
    * 组件值字段名，针对下拉组件、radio-group组件等，“value”
    **/
    21: optional string candidateValue

    /**
    * 源字段名,如 "orderNum"
    **/
    22: optional string srcKey,
    /**
    * 界面是否可见，仅对表单中的字段有效， 默认true
    **/
    23: bool visible

    /**
    * 是否禁用组件
    **/
    24: bool disabled
}