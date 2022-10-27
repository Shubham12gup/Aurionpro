package com.aurionpro.model;

public class CellAlreadyMarkedException extends Exception {
	
	private static final long serialVersionUID = 1L;

	CellAlreadyMarkedException(String msg){
		super(msg);
	}
	
}
