package com.stuatdsys.cmis.model;

   /**
    * tbl_teacher	��ʦ��
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_teacher {
	private Integer id;	//����
	private String teacher_No;	//��ʦ����
	private String teacher_Name;	//��ʦ����
	private Integer department_Id;	//ϵ��
	private String create_Time;	//��¼����ʱ��
	private String update_Time;	//��¼�޸�ʱ��
	
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

