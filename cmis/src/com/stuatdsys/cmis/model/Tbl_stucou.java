package com.stuatdsys.cmis.model;

   /**
    * tbl_stucou	ѡ�α�
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_stucou {
	private Integer id;	//����
	private Integer student_Id;	//ѧ�����
	private Integer course_Id;	//�γ̱��
	private String grade;	//�ɼ�
	private String create_Time;	//��¼����ʱ��
	private String update_Time;	//��¼�޸�ʱ��
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setStudent_Id(Integer student_Id){
		this.student_Id=student_Id;
	}
	public Integer getStudent_Id(){
		return student_Id;
	}

	public void setCourse_Id(Integer course_Id){
		this.course_Id=course_Id;
	}
	public Integer getCourse_Id(){
		return course_Id;
	}

	public void setGrade(String grade){
		this.grade=grade;
	}
	public String getGrade(){
		return grade;
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

