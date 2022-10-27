package com.aurionpro.model;

import java.util.*;

public class ArraysTest {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		
		//Adding Elements.
		list.add("Ravi");
		list.add("Vijay");
		list.add("Sagar");
		list.add("Ajay");
		System.out.println(list+"\n");
		
		
		list.add(1, "Shubh");
		list.add(1, "Ashish");
		list.add("Immanuel");
		System.out.println(list);
		System.out.println("Size: " +list.size());
		
		System.out.println("Is there Ram: " + list.contains("Ram") + "\n");
		
		// Traversing list through Iterator
		System.out.println("\nIterating in list:");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Removing of element
		System.out.println("\nRemoving ravi and then first element and displaying list");
		list.remove("Ravi");
		list.remove(0);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		System.out.println("Is list empty: " +list.isEmpty());
	}

}
