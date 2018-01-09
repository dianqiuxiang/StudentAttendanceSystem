package com.stuatdsys.cmis.model;

   /**
    * tbl_callname	点名表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_callname {
	private Integer id;	//主键
	private Integer schedule_Id;	//课表编号
	private Integer student_Id;	//学生编号
	private Integer course_Id;	//课程编号
	private Integer class_Id;	//班级编号
	private String state;	//出勤状态
	private String remark;	//备注信息
	private String callname_Time;	//点名时间
	private String create_Time;	//记录创建时间
	private String update_Time;	//记录修改时间
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setSchedule_Id(Integer schedule_Id){
		this.schedule_Id=schedule_Id;
	}
	public Integer getSchedule_Id(){
		return schedule_Id;
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

	public void setClass_Id(Integer class_Id){
		this.class_Id=class_Id;
	}
	public Integer getClass_Id(){
		return class_Id;
	}

	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return state;
	}

	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}

	public void setCallname_Time(String callname_Time){
		this.callname_Time=callname_Time;
	}
	public String getCallname_Time(){
		return callname_Time;
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

