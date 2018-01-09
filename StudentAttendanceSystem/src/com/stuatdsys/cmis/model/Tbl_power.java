package com.stuatdsys.cmis.model;

   /**
    * tbl_power	权限表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_power {
	private Integer id;	//id
	private String powerCode;	//权限编码
	private String powerName;	//权限名称
	private String description;	//描述
	
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

