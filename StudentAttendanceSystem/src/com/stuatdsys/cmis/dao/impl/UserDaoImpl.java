package com.stuatdsys.cmis.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.stuatdsys.cmis.dao.CallnameDao;
import com.stuatdsys.cmis.dao.UserDao;
import com.stuatdsys.cmis.model.Tbl_user;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<Tbl_user> implements UserDao {
	public UserDaoImpl(){
		super.setNamespace("com.stuatdsys.cmis.dao.impl.UserDaoImpl");		
	}
}

