package com.stuatdsys.cmis.model;

   /**
    * tbl_student	学生表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_student {
	private Integer id;	//主键
	private String stu_No;	//学号
	private String stu_Name;	//姓名
	private Integer class_Id;	//班级编号
	private String create_Time;	//记录创建时间
	private String update_Time;	//记录修改时间
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setStu_No(String stu_No){
		this.stu_No=stu_No;
	}
	public String getStu_No(){
		return stu_No;
	}

	public void setStu_Name(String stu_Name){
		this.stu_Name=stu_Name;
	}
	public String getStu_Name(){
		return stu_Name;
	}

	public void setClass_Id(Integer class_Id){
		this.class_Id=class_Id;
	}
	public Integer getClass_Id(){
		return class_Id;
	}

	public void setCreate_Time(String create_Time){
		this.create_Time=create_Time;
	}
	public String getCreate_Time(){
		return create_Time;
	}

	public void setUpdate_Time(String update_Time){
		this.update_Time=update_Time;
	}
	public String getUpdate_Time(){
		return update_Time;
	}

}

