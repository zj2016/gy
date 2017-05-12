package com.bs.gy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bs.gy.query.Query;
import com.bs.gy.rest.Rest;
import com.bs.gy.rest.RestResult;
import com.bs.gy.service.BaseService;
import com.fasterxml.jackson.core.JsonProcessingException;

public class BaseController<T> {

	@Autowired
	private BaseService<T> service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Query query) throws JsonProcessingException{
		Map<String,Object> params = query.toMap();
		List<T> list = service.getList(params);
		int count = service.getCount(params);
		Rest<T> rest = new Rest<T>(count, list);
		System.out.println(rest.toJson());
		return rest.toJson();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public RestResult add(T active){
		int result = service.add(active);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("添加成功");
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public RestResult update(T active){
		int result = service.update(active);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("更新成功");
	}
	
	@RequestMapping(value = "/remove/{id}")
	public RestResult remove(@PathVariable("id") Integer id){
		int result = service.remove(id);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("删除成功");
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public RestResult one(@PathVariable("id") Integer id){
		return RestResult.success().setResponse(service.get(id));
	}
	
}
