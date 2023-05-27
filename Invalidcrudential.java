package com.studentmanagmentsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
@Data
public class Invalidcrudential extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String resourcename;
	private String fieldname;
	
	public Invalidcrudential(String resourcename, String fieldname) {
		super(resourcename+" not found with id:"+fieldname+" :");
		this.resourcename = resourcename;
		this.fieldname = fieldname;
	}
}
