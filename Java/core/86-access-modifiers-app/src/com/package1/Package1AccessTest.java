package com.package1;

public class Package1AccessTest {

	public static void main(String[] args) {
//		Access privateObj = new Access();
//		privateObj.runPrivateMethod(); // compile time error
		
		Access publicObj = new Access();
		publicObj.runPublicMethod();
		
		Access defaultObj = new Access();
		defaultObj.runDefaultMethod();
		
		Access protectedObj = new Access();
		protectedObj.runProtectedMethod();
	}

}
