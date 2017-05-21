package com.bs.gy.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Major;
import com.bs.gy.bean.Subject;
import com.bs.gy.bean.Two;
import com.bs.gy.query.Query;
import com.bs.gy.rest.RestO;
import com.bs.gy.service.MajorService;
import com.bs.gy.service.SubjectService;
import com.bs.gy.service.TwoService;

@RestController
@RequestMapping("/subject")
public class SubjectController extends BaseController<Subject> {

	@Autowired
	private SubjectService service;
	
	@Autowired
	private TwoService twoService;
	
	@Autowired
	private MajorService majorService;
	
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "text/json;charset=UTF-8")
	public String one(@PathVariable("id") Integer id) {
		
		Subject subject = service.get(id);
		Query query = new Query();
		query.setLimit(1000);
		Map<String, Object> params = query.toMap();
		params.put("subjectid", id);
		List<Two> twoList = twoService.getList(params);
		subject.setTwoList(twoList);
		List<Major> majorList = new ArrayList<Major>();
		for (Two t : twoList) {
			params = query.toMap();
			params.put("twoid", t.getIds());
			majorList.addAll(majorService.getList(params));
		}
		subject.setMajorList(majorList);
		return RestO.success().setData(subject).toJson();
	}
}
