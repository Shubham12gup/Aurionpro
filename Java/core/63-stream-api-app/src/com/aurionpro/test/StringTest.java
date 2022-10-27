package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StringTest {

	public static void main(String[] args) {
		String[] names = {"Jay", "Nimesh", "Sagar", "Nitin", "Rahul"};
		
//		a. print names of first 3 students sorted in ascending order
//		b. print names of first 3 students sorted in ascending order if their names contain 'a'
//		c. print names of students sorted in descending order
//		d. print first 3 characters of names of students
//		e. print the names of the students that contains less than or equal to 4 characters
		
		List<String> list = Arrays.asList(names);
		list.stream()
		.sorted()
		.limit(3)
		.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		list.stream()
		.filter(name->name.toLowerCase().contains("a"))
		.sorted()
		.limit(3)
		.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		list.stream()
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.forEach(System.out::println);
		System.out.println("--------------------------------");
		
		list.stream()
		.map(n -> n.substring(0, 3))
		.forEach(x->System.out.println(x));
		System.out.println("--------------------------------");

		list.stream()
		.filter(n -> n.length()<=4)
		.forEach(x->System.out.println(x));

		
	}

}
