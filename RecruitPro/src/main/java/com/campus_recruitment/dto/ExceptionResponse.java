package com.campus_recruitment.dto;

import java.security.Timestamp;
import java.time.Instant;

public class ExceptionResponse {
	private String message;
	private String path;
	private Instant instant;
	private Timestamp timestamp;

	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionResponse(String message, String path, Instant instant, Timestamp timestamp) {
		super();
		this.message = message;
		this.path = path;
		this.instant = instant;
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}
