package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bs.gy.query.Query;
import com.bs.gy.rest.RestResult;
import com.bs.gy.service.BaseService;

public class BaseController<T> {

	@Autowired
	private BaseService<T> service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public RestResult list(Query query){
		return RestResult.success().setResponse(service.getList(query.toMap()));
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public RestResult add(T active){
		int result = service.add(active);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("Ìí¼ÓÊ§°Ü");
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public RestResult update(T active){
		int result = service.update(active);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("¸üÐÂÊ§°Ü");
	}
	
	@RequestMapping(value = "/remove/{id}")
	public RestResult remove(@PathVariable("id") Integer id){
		int result = service.remove(id);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("É¾³ýÊ§°Ü");
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public RestResult one(@PathVariable("id") Integer id){
		return RestResult.success().setResponse(service.get(id));
	}
	
}
