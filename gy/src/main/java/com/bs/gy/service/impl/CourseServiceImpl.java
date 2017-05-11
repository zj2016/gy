package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Course;
import com.bs.gy.dao.CourseMapper;


public class CourseServiceImpl extends BaseServiceImpl<Course>{
	
	@Autowired
	private CourseMapper dao;

}
