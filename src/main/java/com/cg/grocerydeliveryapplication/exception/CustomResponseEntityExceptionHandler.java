package com.cg.grocerydeliveryapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler{
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleProjectIdException(CategoryIDException ex, WebRequest request)
	{
		CategoryIdExceptionResponse exceptionResponse=new CategoryIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
				
	}
	

}
