 package com.isuwang.soa.scala.task.db.enum 
 import wangzx.scala_commons.sql.DbEnum 
 import wangzx.scala_commons.sql._ 
 class SuggestionType private(val id:Int, val name:String) extends DbEnum { 
 	 override def toString(): String = "(" + id + "," + name + ")"  

 	 override def equals(obj: Any): Boolean = { 
 			 if (obj == null) false 
 			 else if (obj.isInstanceOf[SuggestionType]) obj.asInstanceOf[SuggestionType].id == this.id 
 			 else false 
 	 } 

 	 override def hashCode(): Int = this.id 
 } 

 object SuggestionType { 
	 val QUESTION = new SuggestionType(1,"QUESTION") 
	 val IMPROVEMENT = new SuggestionType(2,"IMPROVEMENT") 
	 def unknown(id: Int) = new SuggestionType(id, id+"") 
	 def valueOf(id: Int): SuggestionType = id match { 
 		 case 1 => QUESTION 
 		 case 2 => IMPROVEMENT 
 		 case _ => unknown(id) 
 } 
 def apply(v: Int) = valueOf(v) 
 def unapply(v: SuggestionType): Option[Int] = Some(v.id) 
 implicit object Accessor extends DbEnumJdbcValueAccessor[SuggestionType](valueOf) 
}
