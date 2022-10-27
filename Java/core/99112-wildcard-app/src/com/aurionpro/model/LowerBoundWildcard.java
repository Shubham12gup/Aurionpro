package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcard {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(10, 20, 30, 40);
		printOnlyIntegerClassorSuperClass(intList);
		List<Number> numberList = Arrays.asList(10, 20, 30, 40);
		printOnlyIntegerClassorSuperClass(numberList);

//		List<Double> doubleList = Arrays.asList(13.2, 15.6, 9.7, 22.5);
//		printOnlyIntegerClassorSuperClass(doubleList);

	}
	
//	This will take only integer or superclass of integer.
	public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
		System.out.println(list);
	}
}
