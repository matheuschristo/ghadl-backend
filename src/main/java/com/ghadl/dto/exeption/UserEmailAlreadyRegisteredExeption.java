package com.ghadl.dto.exeption;

public class UserEmailAlreadyRegisteredExeption extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UserEmailAlreadyRegisteredExeption(String message) {
		super(message);
	}
}
