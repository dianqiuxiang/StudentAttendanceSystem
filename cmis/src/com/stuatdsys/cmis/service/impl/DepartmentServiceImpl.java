package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.DepartmentDao;
import com.stuatdsys.cmis.model.Tbl_department;
import com.stuatdsys.cmis.service.DepartmentService;

public class DepartmentServiceImpl  extends  BaseServiceImpl<Tbl_department> implements DepartmentService {

	@Resource
	private DepartmentDao departmentDao;
		
	@Override
	public BaseDao<Tbl_department> getBaseDao() {
		// TODO Auto-generated method stub
		return departmentDao;
	}
	
}

