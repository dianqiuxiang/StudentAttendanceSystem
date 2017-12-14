package com.twmzc.demo.tab.action;

import java.awt.event.ActionEvent;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.twmzc.demo.bean.tab.Contract;
import com.twmzc.demo.tab.service.TabService;

import net.sf.json.JSONObject;

public class TabContractJsonAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	/************************定义**********************************/
	//货别表
	List <Contract> contrList;
	TabService tabService;
	ActionContext context;
	
	/************************返回表 json格式 curlist**********************************/
	public String seleContrList() {
		//调用存储过程，获取列表
		this.contrList = this.tabService.queryContractList(null);
		System.out.println(this.contrList);
		return SUCCESS;
	}
	public Object postValue(Map parameterMap,String key) {
		Object []temp = (Object[])parameterMap.get(key);
		if(temp!=null&&!"".equals(temp[0])) {
			return temp[0];
		}
		return null;
	}
	 public String execute() {
//		 this.contrList = this.tabService.queryContractList(new Contract());

	        return "success";
	    }
	
	
	/************************get set**********************************/
	 @JSON(serialize=false)
	 public List<Contract> getContrList() {
			return contrList;
		}
	 @JSON(serialize=false)
		public void setContrList(List<Contract> contrList) {
			this.contrList = contrList;
		}
	 @JSON(serialize=false)
		public TabService getTabService() {
			return tabService;
		}
	 @JSON(serialize=false)
		public void setTabService(TabService tabService) {
			this.tabService = tabService;
		}

	

}
