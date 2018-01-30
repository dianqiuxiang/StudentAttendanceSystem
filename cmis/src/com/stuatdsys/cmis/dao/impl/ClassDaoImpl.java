package com.stuatdsys.cmis.dao.impl;

import com.stuatdsys.cmis.dao.ClassDao;
import com.stuatdsys.cmis.model.Tbl_class;

public class ClassDaoImpl extends BaseDaoImpl<Tbl_class> implements ClassDao {

	public ClassDaoImpl(){
		super.setNamespace("com.stuatdsys.cmis.dao.impl.ClassDaoImpl");		
	}
	
}
