package com.springboot.cruddemo.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class EmployeeRestExceptionHandler {

	//Add eh for Customerntfound
	@ExceptionHandler(value= {EmployeeServiceException.class})
	public ResponseEntity<EmployeeErrorResponse> handleEmployeeServiceException(EmployeeServiceException ex,WebRequest request) {
		
		//create error response
		EmployeeErrorResponse error = new EmployeeErrorResponse(
											HttpStatus.INTERNAL_SERVER_ERROR.value(),
											ex.getMessage(),
											new Date());
		
		//return Responseentity
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
//catch all exception 
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<EmployeeErrorResponse> handleException(Exception ex,WebRequest request) {
		
		
		EmployeeErrorResponse error = new EmployeeErrorResponse(
										HttpStatus.INTERNAL_SERVER_ERROR.value(),
										ex.getMessage(),
										new Date());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}





