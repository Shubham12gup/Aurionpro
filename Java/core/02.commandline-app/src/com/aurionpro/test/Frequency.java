package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		//int[] arr = new int[args.length];
		int[] arr = {5, 8, 5, 7, 8, 10};
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++)
        {
            int count = 1;

            // Move the index ahead whenever
            // you encounter duplicates
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + ": " + count);
        }
		
		System.out.println("======================================");
		
		String str = "MISSISIPPI";
		Map<Character, Integer> map = new HashMap<>();

//		for(int i=0; i<str.length(); i++) {
//			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//		}
		
		for(char c: str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> m:map.entrySet()) {				
			System.out.println(m.getKey() + ": "+ m.getValue());
		}
		
		System.out.println("---Sorted ----");
		Map<Character, Integer> sorted = new TreeMap<>(Comparator.comparing(map::get));
		sorted.putAll(map);
		System.out.println("\nSort using TreeMap and Comparator");
		System.out.println(sorted);
		
		Map<Character, Integer> sorted1 = new TreeMap<>();
		sorted1.putAll(map);
		System.out.println("\nSort using TreeMap");
		System.out.println(sorted1);
		
		System.out.println("=====================");

//		Sorting By Value and Printing 
		List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
		
//		Collections.sort((List<T>) entryList);
		
		
//		Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });
//		
		
		Collections.sort(entryList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
		
		for(Map.Entry<Character, Integer> m:entryList) {				
			System.out.println(m.getKey() + ": "+ m.getValue());
		}
		
		
		System.out.println("======================================");
		
		
		System.out.println("\n===== Using Streams ===== ");
		
		String s = "MISSISIPPI";

        Map<Character, Long> countMap = s.chars()
                                             .mapToObj(c -> (char) c)
                                             .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Character Occurrences:");
        countMap.forEach((k, v) -> System.out.println(k + " : " + v));
        
        countMap.entrySet().forEach(e -> System.out.println(e.getKey() +  " " +e.getValue()));
		
	}

}
