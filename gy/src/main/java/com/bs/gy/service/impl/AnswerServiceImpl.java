package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Answer;
import com.bs.gy.dao.AnswerMapper;
import com.bs.gy.service.AnswerService;

@Service
public class AnswerServiceImpl extends BaseServiceImpl<Answer> implements AnswerService{
	
	@Autowired
	private AnswerMapper dao;

}
