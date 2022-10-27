package com.aurionpro.model;

public class CustomAnnotation {

	@CustomAnnotation1
	public void sayGoodMorning() {
		System.out.println("Good Morning :)");
	}
	
	@CustomAnnotation1
	public void sayGoodNight() {
		System.out.println("Good Night :)");
	}
	@CustomAnnotation2
	public void sayGoodEvening() {
		System.out.println("Good Evening :)");
	}
	
	@CustomAnnotation2
	public void sayHello() {
		System.out.println("Hello ");
	}
	
	@CustomAnnotation3
	public void sayByy() {
		System.out.println("Good Morning");
	}
	
	public void sayHii() {
		System.out.println("Good Morning");
	}
}
