package com.stuatdsys.cmis.model;

   /**
    * tbl_class	�༶��
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_class {
	private Integer id;	//����
	private String class_No;	//�༶��
	private String class_Name;	//�༶����
	private Integer department_Id;	//ϵ���
	private Integer teacher_Id;	//��ʦ���
	private String create_Time;	//��¼����ʱ��
	private String update_Time;	//��¼�޸�ʱ��
	
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

