package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	
	static int z=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		z= 11;
		
		Integer num = 10;
		System.out.println(num.hashCode());
		String str = "abc";
		String str1 = "abc1";
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		
		String name = "FirstName";
		name = "LastName";
		System.out.println(name);
		
		int x = 10;
		System.out.println(display(x));
		
		String arr[] = {"abc", "xyz"};
		
		System.out.println(arr);
		
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);
		
		Object[] arr1 = (Object[]) list.toArray();
		for(Object s: list.toArray())
			System.out.print(s + ",");
		
		System.out.println("-------------------------------------------");
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 30);
		map.put("C", 20);
		map.put("B", 10);
		map.put("D", 40);
		System.out.println(map); // {B=10, C=20, A=30}

		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "C");
		map1.put(3, "B");
		
//		TreeMap<Integer, String> sorted = new TreeMap<>();
		Map<Integer, String> sorted = new TreeMap<>(
		    Comparator.comparing(map1::get)
		);
		
		sorted.putAll(map1);
		System.out.println(sorted); // {B=10, C=20, A=30}
		
		
	}
	
	private static int display(int x) {

		try {
			x = 30;
			return x;
		} catch (Exception e) {
			x = 20;
			return x;
		} finally {
			x = 40;
//			return x;
		}
	}

}
