package com.stuatdsys.cmis.dao.impl;

import com.stuatdsys.cmis.dao.DepartmentDao;
import com.stuatdsys.cmis.model.Tbl_department;

public class DepartmentDaoImpl extends BaseDaoImpl<Tbl_department> implements DepartmentDao {

	public DepartmentDaoImpl(){
		super.setNamespace("com.stuatdsys.cmis.dao.impl.DepartmentDaoImpl");		
	}
	
}

