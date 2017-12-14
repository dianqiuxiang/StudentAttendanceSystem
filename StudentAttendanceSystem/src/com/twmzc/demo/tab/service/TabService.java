package com.twmzc.demo.tab.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.twmzc.demo.bean.tab.Contract;

public interface TabService {

	List queryContractList(Map contract) throws DataAccessException;
	//修改合同表
	void updateContractList(Contract contract) throws DataAccessException;
	//删除合同
	void deletContract(Contract contract) throws DataAccessException;
}
