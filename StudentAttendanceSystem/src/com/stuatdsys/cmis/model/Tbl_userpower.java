package com.stuatdsys.cmis.model;

   /**
    * tbl_userpower	�û�Ȩ�ޱ�
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_userpower {
	private Integer id;	//������������
	private Integer user_id;	//�û���ţ������
	private Integer power_id;	//Ȩ�ޱ�ţ������
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setUser_id(Integer user_id){
		this.user_id=user_id;
	}
	public Integer getUser_id(){
		return user_id;
	}

	public void setPower_id(Integer power_id){
		this.power_id=power_id;
	}
	public Integer getPower_id(){
		return power_id;
	}

}

