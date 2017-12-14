package com.twmzc.demo.tab.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.twmzc.demo.bean.tab.Contract;

public interface TabService {

	List queryContractList(Map contract) throws DataAccessException;
	//�޸ĺ�ͬ��
	void updateContractList(Contract contract) throws DataAccessException;
	//ɾ����ͬ
	void deletContract(Contract contract) throws DataAccessException;
}
