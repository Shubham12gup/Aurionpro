package com.aurionpro.test;

public class StringCheck {

	public static void main(String[] args) {
		String name = "Dinesh";
		System.out.println(name.hashCode());
		name = "Nitesh";
		System.out.println(name.hashCode());
		String name1 = new String("Nitesh").intern();
		System.out.println(name1.hashCode());
		
		if(name == name1) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		

	}

}
