package com.stuatdsys.cmis.model;

   /**
    * tbl_menu	�˵���
    * Wed Dec 27 16:41:36 CST 2017
    */ 


public class Tbl_menu {
	private Integer id;	//��ţ���������������
	private String name;	//�˵�����
	private String path;	//·��
	private Integer parentID;	//�����˵�ID
	private Integer sequence;	//���
	private String iconImage;	//ͼ��·��
	private Integer isEnable;	//�Ƿ�����
	private String description;	//����
	
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

