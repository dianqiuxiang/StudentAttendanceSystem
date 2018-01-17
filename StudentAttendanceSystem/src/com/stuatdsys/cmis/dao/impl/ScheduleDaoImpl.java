package com.stuatdsys.cmis.dao.impl;

import com.stuatdsys.cmis.dao.ScheduleDao;
import com.stuatdsys.cmis.model.Tbl_schedule;

public class ScheduleDaoImpl extends BaseDaoImpl<Tbl_schedule> implements ScheduleDao{

	public ScheduleDaoImpl(){
		super.setNamespace("com.stuatdsys.cmis.dao.impl.ScheduleDaoImpl");		
	}

}

