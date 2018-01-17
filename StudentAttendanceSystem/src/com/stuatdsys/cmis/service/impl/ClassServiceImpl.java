package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.ClassDao;
import com.stuatdsys.cmis.model.Tbl_class;
import com.stuatdsys.cmis.service.ClassService;

public class ClassServiceImpl extends BaseServiceImpl<Tbl_class> implements ClassService {

	@Resource
	private ClassDao classDao;
	
	@Override
	public BaseDao<Tbl_class> getBaseDao() {
		// TODO Auto-generated method stub
		return classDao;
	}

}
