package com.aurionpro.test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.CustomAnnotation;
import com.aurionpro.model.CustomAnnotation1;
import com.aurionpro.model.CustomAnnotation2;
import com.aurionpro.model.CustomAnnotation3;

public class CustomAnnotationTest {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	
	public static void main(String[] args) {
		
		System.out.println(ANSI_GREEN_BACKGROUND + "Methods List" + ANSI_RESET);
		CustomAnnotation annotation = new CustomAnnotation();
		Method[] methods = annotation.getClass().getDeclaredMethods();
		List<Method> methodsOfAnnotation1 = new ArrayList<Method>();
		List<Method> methodsOfAnnotation2 = new ArrayList<Method>();
		List<Method> methodsOfAnnotation3 = new ArrayList<Method>();
		
		for (Method m : methods) {
			System.out.println(m.getName());
			methodSeggregation(methodsOfAnnotation1, methodsOfAnnotation2, methodsOfAnnotation3, m);
		}
		
		printMethodsOfAnnotation(methodsOfAnnotation1, CustomAnnotation1.class);
		printMethodsOfAnnotation(methodsOfAnnotation2, CustomAnnotation2.class);
		printMethodsOfAnnotation(methodsOfAnnotation3, CustomAnnotation3.class);
	}

	public static void methodSeggregation(List<Method> methodsOfAnnotation1, List<Method> methodsOfAnnotation2,
			List<Method> methodsOfAnnotation3, Method m) {
		if (m.isAnnotationPresent(CustomAnnotation1.class))
			methodsOfAnnotation1.add(m);
		else if (m.isAnnotationPresent(CustomAnnotation2.class))
			methodsOfAnnotation2.add(m);
		else if (m.isAnnotationPresent(CustomAnnotation3.class))
			methodsOfAnnotation3.add(m);
	}

	private static void printMethodsOfAnnotation(List<Method> methodsOfAnnotation1, Class class1) {
		System.out.println("---------------------------------");
		System.out.println(ANSI_GREEN_BACKGROUND + "Methods List of " + class1.getSimpleName() + ANSI_RESET);
		for(Method a : methodsOfAnnotation1) {
			System.out.println(a.getName());
		}
	}
	
	
}