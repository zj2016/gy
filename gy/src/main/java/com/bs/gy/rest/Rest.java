package com.bs.gy.rest;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Rest<T> {
	
	public static final Integer SUCCESS = 200;
	
	public static final Integer FAIL = 500;
	
	private int total;
	private List<T> data;
	private Integer code;
	private String message;
	
	public int getTotal() {
		return total;
	}
	public Rest<T> setTotal(int total) {
		this.total = total;
		return this;
	}
	public List<T> getData() {
		return data;
	}
	public Rest<T> setData(List<T> data) {
		this.data = data;
		return this;
	}
	public Integer getCode() {
		return code;
	}
	public Rest<T> setCode(Integer code) {
		this.code = code;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public Rest<T> setMessage(String message) {
		this.message = message;
		return this;
	}
	public Rest() {
		super();
	}
	public Rest(int total, List<T> data) {
		super();
		this.total = total;
		this.data = data;
		this.code = SUCCESS;
		this.message = "success";
	}
	public String toJson(){
		ObjectMapper om = new ObjectMapper();
		try {
			return om.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public Rest(Integer code, String message){
		this.code = code;
		this.message = message;
	}
	
	public static Rest error(Integer code, String message){
		return new Rest(code, message);
	}
	
	public static Rest error(String message){
		return error(FAIL,message);
	}
	
	public static Rest success(){
		return new Rest(SUCCESS, "success");
	}
}
