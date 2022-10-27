package com.aurionpro.model;

import java.util.*;
import java.util.Arrays;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

//		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println("Set1: " + set);

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }));
		System.out.println("Set2: " + set1);
		
		System.out.println("Set2 contains Set1: " +set1.containsAll(set));

		//Union of set and set1
		Set<Integer> union = new HashSet<Integer>(set);
		union.addAll(set1);
		System.out.println("\nUnion of set: \n" + union + "\n");

		//Intersection of set and set1
		Set<Integer> intersection = new HashSet<Integer>(set);
		intersection.retainAll(set1);
		System.out.println("Intersection of set: \n" + intersection + "\n");

		//Difference of set1 and set
		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set);
		System.out.print("Difference of the two Set: \n" +difference+ "\n");

		Set<String> s1 = new HashSet<String>();
		s1.add("Ravi");
		s1.add("Vijay");
		s1.add("Sagar");
		s1.add("Ajay");
		System.out.println("\nString set:"+s1);
		System.out.println("\nString set contains Ram or not: " +s1.contains("Ram"));
		
		System.out.println("\nRemoving Ravi from set");
		s1.remove("Ravi");
		System.out.println(s1);
		

		//Iterating sets
		System.out.println("\nIterating in sets:");
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Deleting all elements from set
		s1.clear();
		System.out.println("Set is empty:" + s1.isEmpty());

	}

}
