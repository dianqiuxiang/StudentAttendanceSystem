package com.stuatdsys.cmis.model;

   /**
    * tbl_department	系表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_department {
	private Integer id;	//主键
	private String department_No;	//系号
	private String department_Name;	//系名
	private String create_Time;	//记录创建时间
	private String update_Time;	//记录修改时间
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setDepartment_No(String department_No){
		this.department_No=department_No;
	}
	public String getDepartment_No(){
		return department_No;
	}

	public void setDepartment_Name(String department_Name){
		this.department_Name=department_Name;
	}
	public String getDepartment_Name(){
		return department_Name;
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

