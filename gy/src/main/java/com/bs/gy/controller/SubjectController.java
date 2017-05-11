package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Subject;
import com.bs.gy.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController extends BaseController<Subject> {

	@Autowired
	private SubjectService service;
	
}
