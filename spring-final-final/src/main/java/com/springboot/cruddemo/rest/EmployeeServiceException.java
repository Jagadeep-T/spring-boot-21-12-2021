package com.springboot.cruddemo.rest;

public class EmployeeServiceException extends RuntimeException {

	public EmployeeServiceException() {
	}

	public EmployeeServiceException(String message) {
		super(message);
	}

	public EmployeeServiceException(Throwable cause) {
		super(cause);
	}

	public EmployeeServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeeServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
