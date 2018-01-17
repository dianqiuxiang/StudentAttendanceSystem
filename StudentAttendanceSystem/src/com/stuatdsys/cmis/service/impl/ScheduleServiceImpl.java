package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.ScheduleDao;
import com.stuatdsys.cmis.model.Tbl_schedule;
import com.stuatdsys.cmis.service.ScheduleService;

public class ScheduleServiceImpl extends BaseServiceImpl<Tbl_schedule> implements ScheduleService{

	@Resource
	private ScheduleDao scheduleDao;
	
	@Override
	public BaseDao<Tbl_schedule> getBaseDao() {
		// TODO Auto-generated method stub
		return scheduleDao;
	}
	

}

