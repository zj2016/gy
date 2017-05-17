package com.bs.gy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.gy.query.Query;
import com.bs.gy.query.TwoQuery;
import com.bs.gy.rest.Rest;
import com.bs.gy.rest.RestO;
import com.bs.gy.service.BaseService;

public class BaseController<T> {

	@Autowired
	private BaseService<T> service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public @ResponseBody String list(Query query){
		Map<String,Object> params = query.toMap();
		List<T> list = service.getList(params);
		int count = service.getCount(params);
		Rest<T> rest = new Rest<T>(count, list);
		return rest.toJson();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	public @ResponseBody String add(T active){
		int result = service.add(active);
		if(result > 0){
			return Rest.success().toJson();
		}
		return Rest.error("添加成功").toJson();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "text/json;charset=UTF-8")
	public @ResponseBody String update(T active){
		int result = service.update(active);
		if(result > 0){
			return Rest.success().toJson();
		}
		return Rest.error("更新成功").toJson();
	}
	
	@RequestMapping(value = "/remove/{id}", produces = "text/json;charset=UTF-8")
	public @ResponseBody String remove(@PathVariable("id") Integer id){
		int result = service.remove(id);
		if(result > 0){
			return Rest.success().toJson();
		}
		return Rest.error("删除成功").toJson();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public @ResponseBody String one(@PathVariable("id") Integer id){
		return RestO.success().setData(service.get(id)).toJson();
	}
	
}
