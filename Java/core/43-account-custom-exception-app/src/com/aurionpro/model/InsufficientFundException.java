package com.aurionpro.model;

public class InsufficientFundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	InsufficientFundException(String string){
		super(string);
	}


}
