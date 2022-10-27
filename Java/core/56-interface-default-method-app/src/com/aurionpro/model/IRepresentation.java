package com.aurionpro.model;

interface IRepresentation {
	void show();
	
	default void present() {
		System.out.println("This is default method of interface");
	}
	
}
