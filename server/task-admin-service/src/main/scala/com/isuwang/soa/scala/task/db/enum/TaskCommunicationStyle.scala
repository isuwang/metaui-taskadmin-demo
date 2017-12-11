 package com.isuwang.soa.scala.task.db.enum 
 import wangzx.scala_commons.sql.DbEnum 
 import wangzx.scala_commons.sql._ 
 class TaskCommunicationStyle private(val id:Int, val name:String) extends DbEnum { 
 	 override def toString(): String = "(" + id + "," + name + ")"  

 	 override def equals(obj: Any): Boolean = { 
 			 if (obj == null) false 
 			 else if (obj.isInstanceOf[TaskCommunicationStyle]) obj.asInstanceOf[TaskCommunicationStyle].id == this.id 
 			 else false 
 	 } 

 	 override def hashCode(): Int = this.id 
 } 

 object TaskCommunicationStyle { 
	 val VISIT = new TaskCommunicationStyle(1,"VISIT") 
	 val PHONE = new TaskCommunicationStyle(2,"PHONE") 
	 val WECHAT = new TaskCommunicationStyle(3,"WECHAT") 
	 val QQ = new TaskCommunicationStyle(4,"QQ") 
	 val SMS = new TaskCommunicationStyle(5,"SMS") 
	 val OTHER = new TaskCommunicationStyle(6,"OTHER") 
	 def unknown(id: Int) = new TaskCommunicationStyle(id, id+"") 
	 def valueOf(id: Int): TaskCommunicationStyle = id match { 
 		 case 1 => VISIT 
 		 case 2 => PHONE 
 		 case 3 => WECHAT 
 		 case 4 => QQ 
 		 case 5 => SMS 
 		 case 6 => OTHER 
 		 case _ => unknown(id) 
 } 
 def apply(v: Int) = valueOf(v) 
 def unapply(v: TaskCommunicationStyle): Option[Int] = Some(v.id) 
 implicit object Accessor extends DbEnumJdbcValueAccessor[TaskCommunicationStyle](valueOf) 
}
