package com.bs.gy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.gy.bean.Admin;
import com.bs.gy.bean.Qcollection;
import com.bs.gy.service.QcollectionService;

@RestController
@RequestMapping("/qcollection")
public class QcollectionController extends BaseController<Qcollection> {

	@Autowired
	private QcollectionService service;
	
}
