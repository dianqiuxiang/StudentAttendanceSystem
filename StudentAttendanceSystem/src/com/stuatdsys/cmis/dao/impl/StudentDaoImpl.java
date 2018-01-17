package com.stuatdsys.cmis.dao.impl;

import com.stuatdsys.cmis.dao.StudentDao;
import com.stuatdsys.cmis.model.Tbl_student;

public class StudentDaoImpl extends BaseDaoImpl<Tbl_student> implements StudentDao {

	public StudentDaoImpl(){
		super.setNamespace("com.stuatdsys.cmis.dao.impl.StudentDaoImpl");		
	}
	
}

