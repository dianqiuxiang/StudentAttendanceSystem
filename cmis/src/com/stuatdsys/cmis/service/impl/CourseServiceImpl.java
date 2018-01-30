package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.CourseDao;
import com.stuatdsys.cmis.model.Tbl_course;
import com.stuatdsys.cmis.service.CourseService;

public class CourseServiceImpl extends  BaseServiceImpl<Tbl_course> implements CourseService {

	@Resource
	private CourseDao courseDao;
	
	@Override
	public BaseDao<Tbl_course> getBaseDao() {
		// TODO Auto-generated method stub
		return courseDao;
	}
	
}

