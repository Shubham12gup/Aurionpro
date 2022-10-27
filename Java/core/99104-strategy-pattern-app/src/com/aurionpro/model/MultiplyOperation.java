package com.aurionpro.model;

public class MultiplyOperation implements IOperation {

	@Override
	public int doOperation(int i, int j) {
		return i*j;
	}

}
