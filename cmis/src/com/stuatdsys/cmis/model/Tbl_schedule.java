package com.stuatdsys.cmis.model;

   /**
    * tbl_schedule	�α�
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_schedule {
	private Integer id;	//����
	private Integer course_Id;	//�γ̺�
	private Integer class_Id;	//���
	private String schedule_Address;	//�Ͽεص�
	private String schedule_Start;	//�Ͽ�ʱ��
	private String schedule_End;	//�¿�ʱ��
	private String schedule_Weekday;	//���ڼ�
	private String create_Time;	//��¼����ʱ��
	private String update_Time;	//��¼�޸�ʱ��
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setCourse_Id(Integer course_Id){
		this.course_Id=course_Id;
	}
	public Integer getCourse_Id(){
		return course_Id;
	}

	public void setClass_Id(Integer class_Id){
		this.class_Id=class_Id;
	}
	public Integer getClass_Id(){
		return class_Id;
	}

	public void setSchedule_Address(String schedule_Address){
		this.schedule_Address=schedule_Address;
	}
	public String getSchedule_Address(){
		return schedule_Address;
	}

	public void setSchedule_Start(String schedule_Start){
		this.schedule_Start=schedule_Start;
	}
	public String getSchedule_Start(){
		return schedule_Start;
	}

	public void setSchedule_End(String schedule_End){
		this.schedule_End=schedule_End;
	}
	public String getSchedule_End(){
		return schedule_End;
	}

	public void setSchedule_Weekday(String schedule_Weekday){
		this.schedule_Weekday=schedule_Weekday;
	}
	public String getSchedule_Weekday(){
		return schedule_Weekday;
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

