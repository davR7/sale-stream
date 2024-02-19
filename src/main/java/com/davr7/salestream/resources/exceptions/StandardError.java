package com.davr7.salestream.resources.exceptions;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StandardError {
	protected Instant timestamp;
	protected String path;
	protected Integer status;
	protected String error;
}
