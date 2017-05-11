package com.bs.gy.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {

	int add(T t);
	
	int remove(Integer id);
	
	int update(T t);
	
	T get(Integer id);
	
	List<T> getList(Map<String, Object> params);
	
	int getCount(Map<String, Object> params);
	
}
