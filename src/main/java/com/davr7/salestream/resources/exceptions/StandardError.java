package com.davr7.salestream.resources.exceptions;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StandardError {
	private Instant timestamp;
	private String path;
	private Integer status;
	private String error;
}
