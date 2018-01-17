package com.stuatdsys.cmis.service.impl;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.dao.MenuDao;
import com.stuatdsys.cmis.model.Tbl_menu;
import com.stuatdsys.cmis.service.MenuService;

public class MenuServiceImpl extends BaseServiceImpl<Tbl_menu> implements MenuService {

	@Resource
	private MenuDao menuDao;
	
	@Override
	public BaseDao<Tbl_menu> getBaseDao() {
		// TODO Auto-generated method stub
		return menuDao;
	}
	
}

