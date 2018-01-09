package com.test.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stuatdsys.cmis.model.Tbl_user;
import com.stuatdsys.cmis.service.UserService;

public class testSpring {
	
	public static void test()
	{
	ApplicationContext ac =   
	          new ClassPathXmlApplicationContext("applicationContext*.xml");  
	  
	    UserService userService=(UserService)ac.getBean("userService");  
	    Tbl_user u=userService.get(new Integer(1));
	    System.out.println(u.getUsername());
	}
	
	public static void main(String[] args) {
		test();
	}
}
