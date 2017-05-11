package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Question;
import com.bs.gy.dao.QuestionMapper;
import com.bs.gy.service.QuestionService;

@Service
public class QuestionServiceImpl extends BaseServiceImpl<Question> implements QuestionService{
	
	@Autowired
	private QuestionMapper dao;

}
