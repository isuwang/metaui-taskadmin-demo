package com.isuwang.soa.common.util;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class TreeNode{
        
            /**
            *
            **/
            public int id ;
            public int getId(){ return this.id; }
            public void setId(int id){ this.id = id; }

            public int id(){ return this.id; }
            public TreeNode id(int id){ this.id = id; return this; }
          
            /**
            *
            **/
            public int parentId ;
            public int getParentId(){ return this.parentId; }
            public void setParentId(int parentId){ this.parentId = parentId; }

            public int parentId(){ return this.parentId; }
            public TreeNode parentId(int parentId){ this.parentId = parentId; return this; }
          
            /**
            *显示名称
            **/
            public String text ;
            public String getText(){ return this.text; }
            public void setText(String text){ this.text = text; }

            public String text(){ return this.text; }
            public TreeNode text(String text){ this.text = text; return this; }
          
            /**
            *是否是叶节点(无子节点)
            **/
            public boolean leaf ;
            public boolean getLeaf(){ return this.leaf; }
            public void setLeaf(boolean leaf){ this.leaf = leaf; }

            public boolean leaf(){ return this.leaf; }
            public TreeNode leaf(boolean leaf){ this.leaf = leaf; return this; }
          
            /**
            *排序
            **/
            public int sort ;
            public int getSort(){ return this.sort; }
            public void setSort(int sort){ this.sort = sort; }

            public int sort(){ return this.sort; }
            public TreeNode sort(int sort){ this.sort = sort; return this; }
          
            /**
            *图标
            **/
            public String icon ;
            public String getIcon(){ return this.icon; }
            public void setIcon(String icon){ this.icon = icon; }

            public String icon(){ return this.icon; }
            public TreeNode icon(String icon){ this.icon = icon; return this; }
          
            /**
            *长路径名称
            **/
            public String fullName ;
            public String getFullName(){ return this.fullName; }
            public void setFullName(String fullName){ this.fullName = fullName; }

            public String fullName(){ return this.fullName; }
            public TreeNode fullName(String fullName){ this.fullName = fullName; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("id").append("\":").append(this.id).append(",");
    stringBuilder.append("\"").append("parentId").append("\":").append(this.parentId).append(",");
    stringBuilder.append("\"").append("text").append("\":\"").append(this.text).append("\",");
    stringBuilder.append("\"").append("leaf").append("\":").append(this.leaf).append(",");
    stringBuilder.append("\"").append("sort").append("\":").append(this.sort).append(",");
    stringBuilder.append("\"").append("icon").append("\":\"").append(this.icon).append("\",");
    stringBuilder.append("\"").append("fullName").append("\":\"").append(this.fullName).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      