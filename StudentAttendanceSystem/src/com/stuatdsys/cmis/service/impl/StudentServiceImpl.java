package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.StudentDao;
import com.stuatdsys.cmis.model.Tbl_student;
import com.stuatdsys.cmis.service.StudentService;

public class StudentServiceImpl extends BaseServiceImpl<Tbl_student> implements StudentService {

	@Resource
	private StudentDao studentDao;
	
	@Override
	public BaseDao<Tbl_student> getBaseDao() {
		// TODO Auto-generated method stub
		return studentDao;
	}
	
}

