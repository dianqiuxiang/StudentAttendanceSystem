package com.stuatdsys.cmis.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.stuatdsys.cmis.dao.BaseDao;
import com.stuatdsys.cmis.service.BaseService;
import com.stuatdsys.cmis.utils.PageEntity;
import com.stuatdsys.cmis.utils.PagingResult;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	/** 
     * 由业务类实现 
     * @return 
     */  
    public abstract BaseDao<T> getBaseDao();  
    
	@Override
	public int insert(T entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(T entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateParam(Map param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int primaryKey) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteParam(Map param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int truncate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count(Object param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int primaryKey) {
		// TODO Auto-generated method stub
		return getBaseDao().get(primaryKey);
	}

	@Override
	public List<T> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> selectParam(Map param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PagingResult<T> selectPagination(PageEntity param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBatch(List<T> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<T> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBatch(List<Integer> list) {
		// TODO Auto-generated method stub
		return 0;
	}



}
