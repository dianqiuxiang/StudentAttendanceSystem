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
public class UserServiceImpl extends BaseServiceImpl<Tbl_user> implements UserService {
	
	@Resource    
    private UserDao userDao;  
      
    @Override  
    public BaseDao<Tbl_user> getBaseDao() {  
        return userDao;  
    }
    
    @Override
    @Transactional
    public int update()
    {
    	Tbl_user a1=new Tbl_user();
	    a1.setId(1);
	    a1.setUsername("321");
	    a1.setPwd("321");
	    a1.setStudentid(1);
	    a1.setTec_or_stu(2);
	    a1.setDescription("He or she is Student");
	    System.out.println("aaaaaaaaaaaaaaaaaa1");
	    int aa=userDao.update(a1);
	    System.out.println("aaaaaaaaaaaaaaaaaa2");
	    Tbl_user a2=new Tbl_user();
	    a2.setId(2);
	    a2.setUsername("aa");
	    a2.setPwd("aa");
	    a2.setTeacherid(1);
	    a2.setTec_or_stu(1);
	    a2.setDescription("He or she is Teacher");
	    int i = 1 / 0; // 抛出运行时异常，事务回滚
	    System.out.println("aaaaaaaaaaaaaaaaaa3");
	    int ab=userDao.update(a2);
	    System.out.println("aaaaaaaaaaaaaaaaaa4");
	    if (aa == 1 && ab == 1) {  
            return 1;  
        }  
        return 0;
    }
}

