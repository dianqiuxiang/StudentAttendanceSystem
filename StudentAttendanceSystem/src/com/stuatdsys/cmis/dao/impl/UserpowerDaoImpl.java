package com.stuatdsys.cmis.dao.impl;

import com.stuatdsys.cmis.dao.UserpowerDao;
import com.stuatdsys.cmis.model.Tbl_userpower;

public class UserpowerDaoImpl extends BaseDaoImpl<Tbl_userpower> implements UserpowerDao {

	public UserpowerDaoImpl(){
		super.setNamespace("com.stuatdsys.cmis.dao.impl.UserpowerDaoImpl");		
	}
	
}

