package com.stuatdsys.cmis.dao.impl;

import com.stuatdsys.cmis.dao.PowerDao;
import com.stuatdsys.cmis.model.Tbl_power;

public class PowerDaoImpl extends BaseDaoImpl<Tbl_power> implements PowerDao {

	public PowerDaoImpl(){
		super.setNamespace("com.stuatdsys.cmis.dao.impl.PowerDaoImpl");		
	}
	
}

