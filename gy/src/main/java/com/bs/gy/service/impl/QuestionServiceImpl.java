package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Question;
import com.bs.gy.dao.QuestionMapper;


public class QuestionServiceImpl extends BaseServiceImpl<Question>{
	
	@Autowired
	private QuestionMapper dao;

}
