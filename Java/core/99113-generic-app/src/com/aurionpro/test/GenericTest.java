package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.GenericClass;

public class GenericTest {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		
		for (Integer i: intList) {
			GenericClass<Integer> ele = new GenericClass<Integer>(i);
			System.out.println(ele.get());
		}
		
//		GenericClass<String> str = new GenericClass<String>("Hello World");
//		System.out.println(str.get()); 
	}

}
