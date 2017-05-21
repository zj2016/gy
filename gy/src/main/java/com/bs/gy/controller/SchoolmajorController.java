package com.bs.gy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Schoolmajor;
import com.bs.gy.query.Query;
import com.bs.gy.rest.Rest;
import com.bs.gy.service.SchoolmajorService;

@RestController
@RequestMapping("/schoolmajor")
public class SchoolmajorController extends BaseController<Schoolmajor> {

	@Autowired
	private SchoolmajorService service;
	
	@Override
	@RequestMapping(value = "/listN", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public String list(Query query) {
		// TODO Auto-generated method stub
		return super.list(query);
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public @ResponseBody String list(Query query, Integer schoolid){
		Map<String,Object> params = query.toMap();
		List<Schoolmajor> list = service.getList(params);
		int count = service.getCount(params);
		Rest<Schoolmajor> rest = new Rest<Schoolmajor>(count, list);
		return rest.toJson();
	}
	
}
