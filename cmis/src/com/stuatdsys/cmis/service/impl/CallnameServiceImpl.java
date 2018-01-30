package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.CallnameDao;
import com.stuatdsys.cmis.model.Tbl_callname;
import com.stuatdsys.cmis.service.CallnameService;

public class CallnameServiceImpl extends BaseServiceImpl<Tbl_callname> implements CallnameService {

	@Resource
	private CallnameDao callnameDao;
	
		@Override
	public BaseDao<Tbl_callname> getBaseDao() {
		// TODO Auto-generated method stub
		return callnameDao;
	}

}
