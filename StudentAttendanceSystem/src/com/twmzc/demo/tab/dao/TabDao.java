package com.twmzc.demo.tab.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.twmzc.demo.bean.tab.Contract;

public interface TabDao {
	//���
	List queryContractList(Map contract) throws DataAccessException;
	
	public void updateContractList(Contract contract) throws DataAccessException;
	//ɾ����ͬ
	void deletContract(Contract contract) throws DataAccessException;
}
