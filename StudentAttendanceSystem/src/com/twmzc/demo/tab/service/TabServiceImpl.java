package com.twmzc.demo.tab.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.twmzc.demo.bean.tab.Contract;
import com.twmzc.demo.tab.dao.TabDao;

public class TabServiceImpl implements TabService {
	
	TabDao tabDao;
	//±í
	@Override
	public List queryContractList(Map contract) throws DataAccessException {
		// TODO Auto-generated method stub
		return this.tabDao.queryContractList(contract);
	}
	
	@Override
	public void updateContractList(Contract contract) throws DataAccessException {
		// TODO Auto-generated method stub
		this.tabDao.updateContractList(contract);
	}
	
	
	@Override
	public void deletContract(Contract contract) throws DataAccessException {
		// TODO Auto-generated method stub
		this.tabDao.deletContract(contract);
	}

	public TabDao getTabDao() {
		return tabDao;
	}
	public void setTabDao(TabDao tabDao) {
		this.tabDao = tabDao;
	}
	
	
	

}
