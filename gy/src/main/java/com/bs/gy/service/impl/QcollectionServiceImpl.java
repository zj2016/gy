package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.gy.bean.Qcollection;
import com.bs.gy.dao.QcollectionMapper;
import com.bs.gy.service.QcollectionService;


@Service
public class QcollectionServiceImpl extends BaseServiceImpl<Qcollection> implements QcollectionService{
	
	@Autowired
	private QcollectionMapper dao;

}
