package com.stuatdsys.cmis.model;

   /**
    * tbl_stucou	选课表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_stucou {
	private Integer id;	//主键
	private Integer student_Id;	//学生编号
	private Integer course_Id;	//课程编号
	private String grade;	//成绩
	private String create_Time;	//记录创建时间
	private String update_Time;	//记录修改时间
	
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

