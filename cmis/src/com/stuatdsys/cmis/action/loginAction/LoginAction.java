package com.stuatdsys.cmis.action.loginAction;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.stuatdsys.cmis.action.BaseAction;
import com.stuatdsys.cmis.model.Tbl_user;
import com.stuatdsys.cmis.service.UserService;

import net.sf.json.groovy.GJson;

@Controller
@RequestMapping(value="/login")
public class LoginAction{
	
	private List<Tbl_user> userList;

	public List<Tbl_user> getUserList() {
		return userList;
	}

	public void setUserList(List<Tbl_user> userList) {
		this.userList = userList;
	}
	@Resource
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/select.do")
	@ResponseBody
	public Object select() {
		Gson gson = new Gson();
		System.out.println(123);
		//调用存储过程，获取列表
		//this.userService.get(1);
		System.out.println(this.userService.selectPK(91).getUsername());
		return gson.toJson("123");
	}
	 public String execute() {
//		 this.contrList = this.tabService.queryContractList(new Contract());

	        return "";
	    }
}
