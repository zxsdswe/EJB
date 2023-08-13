package com.byxx.gtz.utils;

import com.alibaba.fastjson.JSON;

import java.io.IOException;

public class ExampleJson {
	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * 
	 * @param object
	 * @throws IOException
	 */
	public String getJson(Object object) {
		if(object==null){
			return "";
		}else{
			return JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss");
		}
	}
}