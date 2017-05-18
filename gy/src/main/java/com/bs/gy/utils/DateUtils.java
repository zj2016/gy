package com.bs.gy.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

public class DateUtils {

	public enum DatePattern{
		
		yyyyMMddHHmmss("yyyyMMddHHmmss"),
		
		yyyy_MM_dd("yyyy-MM-dd"),
		
		yyyy_MM_dd_HH_mm_ss("yyyy-MM-dd HH:mm:ss"),
		
		yyyyMMddHHmmssSSS("yyyyMMddHHmmssSSS");
	
		private String pattern;
		public String getPattern() {
			return pattern;
		}
		private DatePattern(String pattern){
			this.pattern = pattern;
		}
		
	}
	
	public static Long getNowDateTime(){
		return System.currentTimeMillis()/1000;
	}
	
	public static String getNowDateTimeYMDHMS(){
		return getNowDateTime(DatePattern.yyyyMMddHHmmss);
	}
	
	public static String getNowDateTime(DatePattern pattern){
		Date date = new Date();
		SimpleDateFormat fm = new SimpleDateFormat(pattern.getPattern());
		return fm.format(date);
	}
	
	public static Long parseStringToLong(String dateTime, DatePattern pattern){
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern.getPattern());
		Date date = new Date();
		try {
			date = dateFormat.parse(dateTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date.getTime()/1000;
	}
	
	public static String parseLongToString(Long dateTime, DatePattern pattern){
		
		if(dateTime == null) return "";
		Date date = new Date(dateTime * 1000);
		
		return DateFormatUtils.format(date, pattern.getPattern());
	}
	
	public static void main(String[] arg0){
		
	}
}
