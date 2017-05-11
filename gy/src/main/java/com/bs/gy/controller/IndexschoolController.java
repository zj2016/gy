package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Indexschool;
import com.bs.gy.service.IndexschoolService;

@RestController
@RequestMapping("/indexschool")
public class IndexschoolController extends BaseController<Indexschool> {

	@Autowired
	private IndexschoolService service;
	
}
