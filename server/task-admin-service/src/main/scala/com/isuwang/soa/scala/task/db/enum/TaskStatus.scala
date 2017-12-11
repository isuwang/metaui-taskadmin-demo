 package com.isuwang.soa.scala.task.db.enum 
 import wangzx.scala_commons.sql.DbEnum 
 import wangzx.scala_commons.sql._ 
 class TaskStatus private(val id:Int, val name:String) extends DbEnum { 
 	 override def toString(): String = "(" + id + "," + name + ")"  

 	 override def equals(obj: Any): Boolean = { 
 			 if (obj == null) false 
 			 else if (obj.isInstanceOf[TaskStatus]) obj.asInstanceOf[TaskStatus].id == this.id 
 			 else false 
 	 } 

 	 override def hashCode(): Int = this.id 
 } 

 object TaskStatus { 
	 val SUSPENDING = new TaskStatus(1,"SUSPENDING") 
	 val HANDLING = new TaskStatus(2,"HANDLING") 
	 val SOLVED = new TaskStatus(3,"SOLVED") 
	 val NEEDLESS_TO_HANDLE = new TaskStatus(4,"NEEDLESS_TO_HANDLE") 
	 def unknown(id: Int) = new TaskStatus(id, id+"") 
	 def valueOf(id: Int): TaskStatus = id match { 
 		 case 1 => SUSPENDING 
 		 case 2 => HANDLING 
 		 case 3 => SOLVED 
 		 case 4 => NEEDLESS_TO_HANDLE 
 		 case _ => unknown(id) 
 } 
 def apply(v: Int) = valueOf(v) 
 def unapply(v: TaskStatus): Option[Int] = Some(v.id) 
 implicit object Accessor extends DbEnumJdbcValueAccessor[TaskStatus](valueOf) 
}
