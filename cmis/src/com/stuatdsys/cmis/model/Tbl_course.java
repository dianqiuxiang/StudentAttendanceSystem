package com.stuatdsys.cmis.model;

   /**
    * tbl_course	�γ̱�
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_course {
	private Integer id;	//����
	private String course_No;	//�γ̺�
	private String course_Name;	//�γ���
	private Integer course_Gredit;	//ѧ��
	private String course_Hours;	//ѧʱ
	private String course_Term;	//�ڿ�ѧ��
	private String create_Time;	//��¼����ʱ��
	private String update_Time;	//��¼�޸�ʱ��
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setCourse_No(String course_No){
		this.course_No=course_No;
	}
	public String getCourse_No(){
		return course_No;
	}

	public void setCourse_Name(String course_Name){
		this.course_Name=course_Name;
	}
	public String getCourse_Name(){
		return course_Name;
	}

	public void setCourse_Gredit(Integer course_Gredit){
		this.course_Gredit=course_Gredit;
	}
	public Integer getCourse_Gredit(){
		return course_Gredit;
	}

	public void setCourse_Hours(String course_Hours){
		this.course_Hours=course_Hours;
	}
	public String getCourse_Hours(){
		return course_Hours;
	}

	public void setCourse_Term(String course_Term){
		this.course_Term=course_Term;
	}
	public String getCourse_Term(){
		return course_Term;
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

