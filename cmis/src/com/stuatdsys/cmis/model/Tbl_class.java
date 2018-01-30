package com.stuatdsys.cmis.model;

   /**
    * tbl_class	班级表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_class {
	private Integer id;	//主键
	private String class_No;	//班级号
	private String class_Name;	//班级名称
	private Integer department_Id;	//系编号
	private Integer teacher_Id;	//教师编号
	private String create_Time;	//记录创建时间
	private String update_Time;	//记录修改时间
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setClass_No(String class_No){
		this.class_No=class_No;
	}
	public String getClass_No(){
		return class_No;
	}

	public void setClass_Name(String class_Name){
		this.class_Name=class_Name;
	}
	public String getClass_Name(){
		return class_Name;
	}

	public void setDepartment_Id(Integer department_Id){
		this.department_Id=department_Id;
	}
	public Integer getDepartment_Id(){
		return department_Id;
	}

	public void setTeacher_Id(Integer teacher_Id){
		this.teacher_Id=teacher_Id;
	}
	public Integer getTeacher_Id(){
		return teacher_Id;
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

