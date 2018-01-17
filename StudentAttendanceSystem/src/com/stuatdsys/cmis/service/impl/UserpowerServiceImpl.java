package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.UserpowerDao;
import com.stuatdsys.cmis.model.Tbl_userpower;
import com.stuatdsys.cmis.service.UserpowerService;

public class UserpowerServiceImpl  extends BaseServiceImpl<Tbl_userpower>  implements UserpowerService {
	
	@Resource    
    private UserpowerDao userpowerDao;  
      
    @Override  
    public BaseDao<Tbl_userpower> getBaseDao() {  
        return userpowerDao;  
    }
	
}

