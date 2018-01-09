package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.UserDao;
import com.stuatdsys.cmis.dao.impl.UserDaoImpl;
import com.stuatdsys.cmis.model.Tbl_user;
import com.stuatdsys.cmis.service.UserService;


@Service("userService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl<Tbl_user> implements UserService {
	
	@Resource    
    private UserDao userDao;  
      
    @Override  
    public BaseDao<Tbl_user> getBaseDao() {  
        return userDao;  
    }  
    
}

