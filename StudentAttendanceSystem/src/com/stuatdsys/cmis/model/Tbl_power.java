package com.stuatdsys.cmis.model;

   /**
    * tbl_power	Ȩ�ޱ�
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_power {
	private Integer id;	//id
	private String powerCode;	//Ȩ�ޱ���
	private String powerName;	//Ȩ������
	private String description;	//����
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setPowerCode(String powerCode){
		this.powerCode=powerCode;
	}
	public String getPowerCode(){
		return powerCode;
	}

	public void setPowerName(String powerName){
		this.powerName=powerName;
	}
	public String getPowerName(){
		return powerName;
	}

	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}

}

