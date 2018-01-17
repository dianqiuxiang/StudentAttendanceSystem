package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.TeacherDao;
import com.stuatdsys.cmis.model.Tbl_teacher;
import com.stuatdsys.cmis.service.TeacherService;

public class TeacherServiceImpl extends BaseServiceImpl<Tbl_teacher> implements TeacherService {

	@Resource
	private TeacherDao teacherDao;
	
	@Override
	public BaseDao<Tbl_teacher> getBaseDao() {
		// TODO Auto-generated method stub
		return teacherDao;
	}
	

}

