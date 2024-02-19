package com.davr7.salestream.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.davr7.salestream.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest req) {
		Integer statusCode = HttpStatus.NOT_FOUND.value();
		String error = "Resource not found";
		
		ErrorResponse res = new ErrorResponse(Instant.now(), req.getRequestURI(), statusCode, error, ex.getMessage());
		return ResponseEntity.status(statusCode).body(res);
	}
}
