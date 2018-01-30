package com.stuatdsys.cmis.model;

   /**
    * tbl_menu	菜单表
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_menu {
	private Integer id;	//编号（主键，不自增）
	private String name;	//菜单名称
	private String path;	//路径
	private Integer parentID;	//父级菜单ID
	private Integer sequence;	//序号
	private String iconImage;	//图标路径
	private Integer isEnable;	//是否启用
	private String description;	//描述
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setPath(String path){
		this.path=path;
	}
	public String getPath(){
		return path;
	}

	public void setParentID(Integer parentID){
		this.parentID=parentID;
	}
	public Integer getParentID(){
		return parentID;
	}

	public void setSequence(Integer sequence){
		this.sequence=sequence;
	}
	public Integer getSequence(){
		return sequence;
	}

	public void setIconImage(String iconImage){
		this.iconImage=iconImage;
	}
	public String getIconImage(){
		return iconImage;
	}

	public void setIsEnable(Integer isEnable){
		this.isEnable=isEnable;
	}
	public Integer getIsEnable(){
		return isEnable;
	}

	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}

}

