package com.isuwang.soa.scala.task.domain

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        case class TTaskLog(

         /**
        *
        **/
        
        id : Int, /**
        *

 任务id

        **/
        
        taskId : Int, /**
        *

 操作名

        **/
        
        operation : String, /**
        *



        **/
        
        createdAt : Long, /**
        *



        **/
        
        updatedAt : Long, /**
        *

 操作字段名

        **/
        
        operField : Option[String] = None, /**
        *

 原值

        **/
        
        oldValue : Option[String] = None, /**
        *

 新值

        **/
        
        newValue : Option[String] = None, /**
        *



        **/
        
        createdBy : Option[Int] = None, /**
        *



        **/
        
        updatedBy : Option[Int] = None
        )
      