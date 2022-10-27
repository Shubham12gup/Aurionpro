package com.aurionpro.test;

import com.aurionpro.model.*;

public class ReflectionTest {

	public static void main(String[] args) {
		try {
			String name;
			name = args[0];

			Reflection obj = new Reflection();

			obj.getMethods(Class.forName(name));
			obj.getFields(Class.forName(name));
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Class not found");
		}

	}

}