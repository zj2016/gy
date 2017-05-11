package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Course;
import com.bs.gy.dao.CourseMapper;
import com.bs.gy.service.CourseService;

@Service
public class CourseServiceImpl extends BaseServiceImpl<Course> implements CourseService{
	
	@Autowired
	private CourseMapper dao;

}
