package com.isuwang.soa.scala.common.util

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 分页查询请求包

        **/
        case class TPageRequest(

         /**
        *

 查询的开始序号（序号从零开始）

        **/
        
        start : Int, /**
        *

 返回记录数

        **/
        
        limit : Int, /**
        *

 排序的字段

        **/
        
        sortFields : Option[String] = None
        )
      