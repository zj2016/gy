package com.bs.gy.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.bs.gy.bean.Admin;
import com.bs.gy.rest.RestO;


public class AuthorInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Admin admin = (Admin) request.getSession().getAttribute("_admin");
		if(admin != null){
			return true;
		}
		
		response.getWriter().write(RestO.error("没有登录！").toJson());
		response.getWriter().flush();
		return false;
	}
	
}
