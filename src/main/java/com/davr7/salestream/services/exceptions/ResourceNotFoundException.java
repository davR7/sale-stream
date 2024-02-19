package com.davr7.salestream.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String id){
		super("Resource not found: "+id);
	};
}
