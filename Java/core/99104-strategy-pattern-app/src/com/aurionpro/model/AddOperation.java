package com.aurionpro.model;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int i, int j) {
		return i+j;
	}

}
