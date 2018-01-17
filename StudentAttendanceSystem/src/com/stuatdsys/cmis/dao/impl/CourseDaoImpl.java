package com.stuatdsys.cmis.dao.impl;

import com.stuatdsys.cmis.dao.CourseDao;
import com.stuatdsys.cmis.model.Tbl_course;

public class CourseDaoImpl extends BaseDaoImpl<Tbl_course> implements CourseDao {

	public CourseDaoImpl(){
		super.setNamespace("com.stuatdsys.cmis.dao.impl.CourseDaoImpl");		
	}
	
}

