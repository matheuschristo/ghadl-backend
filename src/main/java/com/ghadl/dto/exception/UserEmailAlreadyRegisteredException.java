package com.ghadl.dto.exception;

public class UserEmailAlreadyRegisteredException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UserEmailAlreadyRegisteredException(String message) {
		super(message);
	}
}
