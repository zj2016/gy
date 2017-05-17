package com.bs.gy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Two;
import com.bs.gy.query.Query;
import com.bs.gy.query.TwoQuery;
import com.bs.gy.rest.Rest;
import com.bs.gy.service.TwoService;

@RestController
@RequestMapping("/two")
public class TwoController extends BaseController<Two> {

	@Autowired
	private TwoService service;
	
	@RequestMapping(value = "/listN", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public String list(TwoQuery query) {
		Map<String,Object> params = query.toMap();
		List<Two> list = service.getList(params);
		int count = service.getCount(params);
		Rest<Two> rest = new Rest<Two>(count, list);
		return rest.toJson();
	}
	
}
