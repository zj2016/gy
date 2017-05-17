package com.bs.gy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.School;
import com.bs.gy.query.Query;
import com.bs.gy.rest.Rest;
import com.bs.gy.service.SchoolAllService;
import com.bs.gy.service.SchoolService;
import com.bs.gy.vo.SchoolAll;

@RestController
@RequestMapping("/school")
public class SchoolController extends BaseController<School> {

	@Autowired
	private SchoolService service;
	@Autowired
	private SchoolAllService allService;
	
	@Override
	@RequestMapping(value = "/list" ,method = RequestMethod.GET)
	public String list(Query query) {

		Map<String,Object> params = query.toMap();
		List<SchoolAll> list = allService.getList(params);
		int count = allService.getCount(params);
		Rest<SchoolAll> rest = new Rest<SchoolAll>(count, list);
		return rest.toJson();
	}
	
}
