package com.stuatdsys.cmis.model;

   /**
    * tbl_user	�û���Ϣ��
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_user {
	private Integer id;	//���
	private String username;	//�û���
	private String pwd;	//����
	private Integer teacherid;	//��ʦ��ţ������
	private Integer studentid;	//ѧ����ţ������
	private Integer tec_or_stu;	//��ʦ����ѧ��
	private String description;	//����
	
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

