package com.aurionpro.model;

public class Manager implements IRepresentation{
	

	@Override
	public void show() {
		System.out.println("This is show method of manager");
	}
	
	@Override
	public void present() {
		System.out.println("This is default method of manager");
	}

}
