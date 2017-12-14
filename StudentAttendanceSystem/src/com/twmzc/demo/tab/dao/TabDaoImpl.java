package com.twmzc.demo.tab.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

import com.twmzc.demo.bean.tab.Contract;

public class TabDaoImpl implements TabDao {
	 @Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Contract> queryContractList(Map contract) throws DataAccessException {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.twmzc.demo.tab.dao.TabDaoImpl.queryContractList", null);
	}

	@Override
	public void updateContractList(Contract contract) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletContract(Contract contract) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
