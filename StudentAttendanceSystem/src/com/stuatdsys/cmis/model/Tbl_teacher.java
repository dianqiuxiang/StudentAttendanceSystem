package com.stuatdsys.cmis.model;

   /**
    * tbl_teacher	教师表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_teacher {
	private Integer id;	//主键
	private String teacher_No;	//教师工号
	private String teacher_Name;	//教师姓名
	private Integer department_Id;	//系号
	private String create_Time;	//记录创建时间
	private String update_Time;	//记录修改时间
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setTeacher_No(String teacher_No){
		this.teacher_No=teacher_No;
	}
	public String getTeacher_No(){
		return teacher_No;
	}

	public void setTeacher_Name(String teacher_Name){
		this.teacher_Name=teacher_Name;
	}
	public String getTeacher_Name(){
		return teacher_Name;
	}

	public void setDepartment_Id(Integer department_Id){
		this.department_Id=department_Id;
	}
	public Integer getDepartment_Id(){
		return department_Id;
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

