package com.byxx.gtz.utils;

import com.alibaba.fastjson.JSON;

import java.io.IOException;

public class ExampleJson {
	/**
	 * ������ת����JSON�ַ���������Ӧ��ǰ̨
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