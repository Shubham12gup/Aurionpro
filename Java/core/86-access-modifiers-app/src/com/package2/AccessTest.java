package com.package2;

import com.package1.Access;

public class AccessTest extends Access{

	public static void main(String[] args) {
//		Access privateObj = new Access();
//		privateObj.runPrivateMethod(); // compile time error
		
		Access publicObj = new Access();
		publicObj.runPublicMethod();
		
		
//		Access defaultObj = new Access();
//		defaultObj.runDefaultMethod(); // compile time error
//
//		Access protectedObj = new Access();
//		protectedObj.runProtectedMethod(); // compile time error
		
		AccessTest protectedInheritedObj = new AccessTest();
		protectedInheritedObj.runProtectedMethod();
	}

}
