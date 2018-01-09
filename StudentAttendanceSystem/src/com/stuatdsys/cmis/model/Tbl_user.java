package com.stuatdsys.cmis.model;

   /**
    * tbl_user	用户信息表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_user {
	private Integer id;	//编号
	private String username;	//用户名
	private String pwd;	//密码
	private Integer teacherid;	//教师编号（外键）
	private Integer studentid;	//学生编号（外键）
	private Integer tec_or_stu;	//教师还是学生
	private String description;	//描述
	
	public Tbl_user(){}
	public Tbl_user(Integer id,String username,String pwd,Integer teacherid,Integer studentid,Integer tec_or_stu,String description){
		this.id=id;
		this.username=username;
		this.pwd=pwd;
		this.teacherid=teacherid;
		this.studentid=studentid;
		this.tec_or_stu=tec_or_stu;
		this.description=description;
	}
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}

	public void setPwd(String pwd){
		this.pwd=pwd;
	}
	public String getPwd(){
		return pwd;
	}

	public void setTeacherid(Integer teacherid){
		this.teacherid=teacherid;
	}
	public Integer getTeacherid(){
		return teacherid;
	}

	public void setStudentid(Integer studentid){
		this.studentid=studentid;
	}
	public Integer getStudentid(){
		return studentid;
	}

	public void setTec_or_stu(Integer tec_or_stu){
		this.tec_or_stu=tec_or_stu;
	}
	public Integer getTec_or_stu(){
		return tec_or_stu;
	}

	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}

}

