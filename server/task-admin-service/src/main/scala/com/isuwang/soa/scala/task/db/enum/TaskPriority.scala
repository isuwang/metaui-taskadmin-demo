 package com.isuwang.soa.scala.task.db.enum 
 import wangzx.scala_commons.sql.DbEnum 
 import wangzx.scala_commons.sql._ 
 class TaskPriority private(val id:Int, val name:String) extends DbEnum { 
 	 override def toString(): String = "(" + id + "," + name + ")"  

 	 override def equals(obj: Any): Boolean = { 
 			 if (obj == null) false 
 			 else if (obj.isInstanceOf[TaskPriority]) obj.asInstanceOf[TaskPriority].id == this.id 
 			 else false 
 	 } 

 	 override def hashCode(): Int = this.id 
 } 

 object TaskPriority { 
	 val HIGH = new TaskPriority(1,"HIGH") 
	 val MEDIUM = new TaskPriority(2,"MEDIUM") 
	 val LOW = new TaskPriority(3,"LOW") 
	 def unknown(id: Int) = new TaskPriority(id, id+"") 
	 def valueOf(id: Int): TaskPriority = id match { 
 		 case 1 => HIGH 
 		 case 2 => MEDIUM 
 		 case 3 => LOW 
 		 case _ => unknown(id) 
 } 
 def apply(v: Int) = valueOf(v) 
 def unapply(v: TaskPriority): Option[Int] = Some(v.id) 
 implicit object Accessor extends DbEnumJdbcValueAccessor[TaskPriority](valueOf) 
}
