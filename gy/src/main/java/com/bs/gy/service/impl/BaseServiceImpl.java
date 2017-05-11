package com.bs.gy.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.dao.BaseMapper;
import com.bs.gy.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T>{

	@Autowired
	private BaseMapper<T> dao;

	public int add(T t) {
		return dao.insert(t);
	}

	public int remove(Integer id) {
		return dao.deleteByPrimaryKey(id);
	}

	public int update(T t) {
		return dao.updateByPrimaryKey(t);
	}

	public T get(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

	public List<T> getList(Map<String, Object> params) {
		return dao.selectList(params);
	}

	public int getCount(Map<String, Object> params) {
		return dao.selectCount(params);
	}
	
	
}
