package com.bs.gy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bs.gy.bean.Qcollection;
import com.bs.gy.dao.QcollectionMapper;


public class QcollectionServiceImpl extends BaseServiceImpl<Qcollection>{
	
	@Autowired
	private QcollectionMapper dao;

}
