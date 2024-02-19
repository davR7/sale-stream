package com.davr7.salestream.resources.exceptions;

import java.time.Instant;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ErrorResponse extends StandardError {
	private String message;

	public ErrorResponse(Instant timestamp, String path, Integer status, String error, String message) {
		super(timestamp, path, status, error);
		this.message = message;
	}
}
