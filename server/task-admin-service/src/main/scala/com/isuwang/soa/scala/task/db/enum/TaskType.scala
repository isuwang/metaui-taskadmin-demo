 package com.isuwang.soa.scala.task.db.enum 
 import wangzx.scala_commons.sql.DbEnum 
 import wangzx.scala_commons.sql._ 
 class TaskType private(val id:Int, val name:String) extends DbEnum { 
 	 override def toString(): String = "(" + id + "," + name + ")"  

 	 override def equals(obj: Any): Boolean = { 
 			 if (obj == null) false 
 			 else if (obj.isInstanceOf[TaskType]) obj.asInstanceOf[TaskType].id == this.id 
 			 else false 
 	 } 

 	 override def hashCode(): Int = this.id 
 } 

 object TaskType { 
	 val TODO = new TaskType(1,"TODO") 
	 val COMPLAINT = new TaskType(2,"COMPLAINT") 
	 val REVIEW_RECORD = new TaskType(3,"REVIEW_RECORD") 
	 def unknown(id: Int) = new TaskType(id, id+"") 
	 def valueOf(id: Int): TaskType = id match { 
 		 case 1 => TODO 
 		 case 2 => COMPLAINT 
 		 case 3 => REVIEW_RECORD 
 		 case _ => unknown(id) 
 } 
 def apply(v: Int) = valueOf(v) 
 def unapply(v: TaskType): Option[Int] = Some(v.id) 
 implicit object Accessor extends DbEnumJdbcValueAccessor[TaskType](valueOf) 
}
