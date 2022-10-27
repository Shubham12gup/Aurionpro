package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stream<Integer> stream = Stream.of(10, 20, 30, 40);
	stream.forEach(x-> System.out.println(x));
	
	Stream<String> stream1 = Stream.of("Ajay", "Vijay", "Rahul", "Saggy");
	stream1.forEach(x-> System.out.println(x));
	
	List<String> players = Arrays.asList("Ashish", "Ritesh", "Immanuel");
	players.stream().forEach(x-> System.out.println(x));
	
//	Stream<String> str = Stream.generate(()->"Hello").limit(5);
//	str.forEach(x->System.out.println(x));
	
	Stream.generate(()->"Hello").limit(5).forEach(System.out::println);
	
	List<Integer> list = Arrays.asList(10,10,20,20,23,34,45,66,76,77,78);
	for (int x : list) {
		if (x%2 == 0)
			System.out.println(x);
	}
	System.out.println("--------------------------------");
	
	List<Integer> newList = list.stream()
		.filter(x->x%2==0)
		.distinct()
		.limit(5)
		.collect(Collectors.toList());
	
	newList.forEach(System.out::println);
	
	}

}
