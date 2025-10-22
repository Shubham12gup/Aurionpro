package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "Shubham", "Rohan", "Abc", "Abc", "Def", "Def", "Rohan", "Rohan", "Rohan", "Def" };

		List<String> arrList = Arrays.asList(arr);

//		arrList.stream().sorted(new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				return o1.equals(o2);
//			}
//		}).forEach(a -> System.out.println(a));

		arrList.stream()
//		.sorted()
		.sorted(Comparator.reverseOrder())
		.forEach(a -> System.out.println(a));

		System.out.println("-------------------------------------------");
		arrList.stream().limit(3).forEach(a -> System.out.println(a));

		System.out.println("-------------------------------------------");
		HashMap<String, Integer> map = new HashMap<>();
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		for (String str : arr) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		treeMap.putAll(map);
		System.out.println("---- Map Print -----");
		treeMap.forEach((K, V) -> System.out.println(K + ":" + V));
		System.out.println("-------------------------------------------");
		
		map.entrySet()
		.stream()
		.sorted(Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(entry -> System.out.println(entry.getKey() +" : "+ entry.getValue()));
		
		System.out.println("-------------------------------------------");
		List<Entry<String, Integer>> entrySet = new ArrayList<>(map.entrySet());

		Collections.sort(entrySet, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}

		});

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("-------------------------------------------");
		entrySet.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

		System.out.println("-------------------------------------------");

	}

}
