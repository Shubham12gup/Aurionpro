package com.aurionpro.model;

public class StrategyOperation implements IOperation {
	
	IOperation operation;
	
	public StrategyOperation(IOperation operation) {
		super();
		this.operation = operation;
	}

	@Override
	public int doOperation(int i, int j) {
		return operation.doOperation(i, j);
	}
	
	public void setOperation(IOperation operation) {
		this.operation = operation;
	}

}
