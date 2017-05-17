package com.bs.gy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Major;
import com.bs.gy.query.MajorQuery;
import com.bs.gy.query.Query;
import com.bs.gy.rest.Rest;
import com.bs.gy.service.MajorService;

@RestController
@RequestMapping("/major")
public class MajorController extends BaseController<Major> {

	@Autowired
	private MajorService service;
	

	@RequestMapping(value = "/listN", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public String list(MajorQuery query) {
		Map<String,Object> params = query.toMap();
		List<Major> list = service.getList(params);
		int count = service.getCount(params);
		Rest<Major> rest = new Rest<Major>(count, list);
		return rest.toJson();
	}
}
