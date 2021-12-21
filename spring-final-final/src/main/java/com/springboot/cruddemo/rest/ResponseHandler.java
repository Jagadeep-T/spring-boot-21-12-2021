package com.springboot.cruddemo.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseHandler {

	public static Object generateResp(String s,HttpStatus status,Object j) {
		Map<String,Object>m=new HashMap<String,Object>();
		m.put("Message", s);
		m.put("Status", status.value());
		m.put("Details", j);
		return new ResponseEntity<Object>(m,status);
	}
}
