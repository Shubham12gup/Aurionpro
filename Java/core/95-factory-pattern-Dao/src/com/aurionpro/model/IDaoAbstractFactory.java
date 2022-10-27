package com.aurionpro.model;

public interface IDaoAbstractFactory {
	
	public IDao createDao(String type);
	
}
