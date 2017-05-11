package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Course;
import com.bs.gy.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController extends BaseController<Course> {

	@Autowired
	private CourseService service;
	
}
