package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.StucouDao;
import com.stuatdsys.cmis.model.Tbl_stucou;
import com.stuatdsys.cmis.service.StucouService;

public class StucouServiceImpl extends BaseServiceImpl<Tbl_stucou> implements StucouService {

	@Resource
	private StucouDao stucouDao;
	
	@Override
	public BaseDao<Tbl_stucou> getBaseDao() {
		// TODO Auto-generated method stub
		return stucouDao;
	}
	
}

