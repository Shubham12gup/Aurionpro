package com.aurionpro.model;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Shubh");
		map.put(2, "Sagar");
		map.put(3, "Ram");
		map.put(4, "Ashish");
		map.put(5, "Immanuel");

		System.out.println("Size: " + map.size());
		System.out.println(map);

		map.putIfAbsent(6, "Ashish");
		map.putIfAbsent(1, "Saggy");
		System.out.println(map);

		// Replacing value of key 5 to sammy
		map.put(5, "Sammy");
		System.out.println(map);

		//Checking key or value is present or not
		System.out.println("\nKey 7 is present: " + map.containsKey(7));
		System.out.println("Value \"Rahul\" is present: " + map.containsValue("Rahul"));
		
		System.out.println("\nValue of key 3 is " +map.get(3));
		System.out.println("\nValue of key 7 is " +map.getOrDefault(7, "Null"));
		
		System.out.println("\n" +map.keySet());
		System.out.println(map.entrySet());

		map.replace(1, "Shanky");
		System.out.println("\nChanging value of key 1 to shanky");
		System.out.println(map);
		
		System.out.println("\nRemoving elements from hashmap");
		map.remove(5);
		map.remove(4, "Ashish");
		System.out.println(map);
		
		HashMap<Integer, String> mapNew = (HashMap<Integer, String>) map.clone();
		mapNew.put(7, "RK");
		System.out.println(mapNew);

		System.out.println("\nmap is equal to mapNew: " +map.equals(mapNew));
		
		System.out.println("\nRemoving all elements from hashmap");
		map.clear();
		System.out.println(map);
		
	}

}
