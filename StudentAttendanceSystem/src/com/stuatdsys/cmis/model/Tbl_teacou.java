package com.stuatdsys.cmis.model;

   /**
    * tbl_teacou	�ڿα�
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_teacou {
	private Integer id;	//����
	private Integer teacher_Id;	//��ʦ���
	private Integer course_Id;	//�γ̱��
	private String create_Time;	//��¼����ʱ��
	private String update_Time;	//��¼�޸�ʱ��
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setTeacher_Id(Integer teacher_Id){
		this.teacher_Id=teacher_Id;
	}
	public Integer getTeacher_Id(){
		return teacher_Id;
	}

	public void setCourse_Id(Integer course_Id){
		this.course_Id=course_Id;
	}
	public Integer getCourse_Id(){
		return course_Id;
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

