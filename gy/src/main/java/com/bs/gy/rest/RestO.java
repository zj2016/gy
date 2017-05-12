package com.bs.gy.rest;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestO<T> {
	
	public static final Integer SUCCESS = 200;
	
	public static final Integer FAIL = 500;
	
	private int total;
	private T data;
	private Integer code;
	private String message;
	
	public int getTotal() {
		return total;
	}
	public RestO<T> setTotal(int total) {
		this.total = total;
		return this;
	}
	public T getData() {
		return data;
	}
	public RestO<T> setData(T data) {
		this.data = data;
		return this;
	}
	public Integer getCode() {
		return code;
	}
	public RestO<T> setCode(Integer code) {
		this.code = code;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public RestO<T> setMessage(String message) {
		this.message = message;
		return this;
	}
	public RestO() {
		super();
	}
	public RestO(int total, T data) {
		super();
		this.total = total;
		this.data = data;
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
	
	public RestO(Integer code, String message){
		this.code = code;
		this.message = message;
	}
	
	public static RestO error(Integer code, String message){
		return new RestO(code, message);
	}
	
	public static RestO error(String message){
		return error(FAIL,message);
	}
	
	public static RestO success(){
		return new RestO(SUCCESS, "success");
	}
}
