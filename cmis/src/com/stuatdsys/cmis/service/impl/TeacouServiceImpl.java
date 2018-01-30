package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.TeacouDao;
import com.stuatdsys.cmis.model.Tbl_teacou;
import com.stuatdsys.cmis.service.TeacouService;

public class TeacouServiceImpl extends BaseServiceImpl<Tbl_teacou> implements TeacouService {

	@Resource    
    private TeacouDao teacouDao;
    
	@Override
	public BaseDao<Tbl_teacou> getBaseDao() {
		// TODO Auto-generated method stub
		return teacouDao;
	}
	
}

