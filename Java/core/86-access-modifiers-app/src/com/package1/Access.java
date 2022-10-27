package com.package1;

public class Access {
	
//	private methods can only be accessed in the same class
	private void runPrivateMethod() {
		System.out.println("I am a private method");
	}

//	public methods can be accessed from different class or within the same class
//	and we can access public methods from different package as well as from same package 
	public void runPublicMethod() {
		System.out.println("I am a public method");
	}
	
//	default methods can be accessed from same class and within the same package
	void runDefaultMethod() {
		System.out.println("I am a default method");
	}
	
//	protected methods can be accessed within the same class and within the same package
//	and if we want to access protected methods in different packages then we should use inheritance.
	protected void runProtectedMethod() {
		System.out.println("I am a protected method");
	}
	
	
	public static void main(String[] args) {
		Access privateObj = new Access();
		privateObj.runPrivateMethod();
		
		Access publicObj = new Access();
		publicObj.runPublicMethod();
		
		Access defaultObj = new Access();
		defaultObj.runDefaultMethod();
		
		Access protectedObj = new Access();
		protectedObj.runProtectedMethod();
	}
	
}
