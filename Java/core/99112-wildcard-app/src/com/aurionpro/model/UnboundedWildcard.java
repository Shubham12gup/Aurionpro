package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {

	public static void main(String[] args) {

		// Integer List
		List<Integer> list1 = Arrays.asList(1, 2, 3);

		// Double list
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
		List<String> list3 = Arrays.asList("Shubh", "Harshal");
		
		printlist(list1);
		printlist(list2);
		printlist(list3);
	}

	private static void printlist(List<?> list) {
		System.out.println(list);
	}
	
}
