package com.bs.gy.dao;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {

	List<T> selectList(Map<String, Object> params);
	
	int selectCount(Map<String, Object> params);
	
	int deleteByPrimaryKey(Integer ids);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer ids);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
	
}
