package com.aurionpro.model;

public class InvalidDepositAmmountException extends Exception {
	
	private static final long serialVersionUID = 1L;

	InvalidDepositAmmountException(String string){
		super(string);
	}
}
