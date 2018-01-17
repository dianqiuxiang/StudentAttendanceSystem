package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.PowerDao;
import com.stuatdsys.cmis.model.Tbl_power;
import com.stuatdsys.cmis.service.PowerService;

public class PowerServiceImpl extends BaseServiceImpl<Tbl_power> implements PowerService {

	@Resource
	private PowerDao powerDao;
	
	@Override
	public BaseDao<Tbl_power> getBaseDao() {
		// TODO Auto-generated method stub
		return powerDao;
	}
	
}

