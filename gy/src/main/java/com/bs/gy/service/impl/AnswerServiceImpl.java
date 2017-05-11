package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Answer;
import com.bs.gy.dao.AnswerMapper;


public class AnswerServiceImpl extends BaseServiceImpl<Answer>{
	
	@Autowired
	private AnswerMapper dao;

}
