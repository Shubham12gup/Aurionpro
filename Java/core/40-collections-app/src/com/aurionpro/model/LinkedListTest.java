package com.aurionpro.model;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> LL = new LinkedList<String>();

		System.out.println("Initial list: " + LL);
//		System.out.println(LL.isEmpty());
		LL.add("Ravi");
		LL.add("Ashish");
		LL.add("Reena");
		LL.add("Immanuel");
		LL.add("Harsh");
		System.out.println(LL);

		LL.add(0, "Shubh");
		System.out.println(LL);

		LL.addFirst("Rocky");
		System.out.println(LL);

		LL.addLast("Meena");
		System.out.println(LL);

		LinkedList<String> LL1 = new LinkedList<String>();
		LL1.add("Tanu");
		LL1.add("Manu");

		LL.addAll(LL1);
		System.out.println(LL);
		System.out.println("------------------------------------------------");

		System.out.println("First element of List: " + LL.peekFirst());
		System.out.println("Last element of List: " + LL.peekLast());
		System.out.println("5th element of List: " + LL.get(5)+ "\n");
		System.out.println("Replace 0 element with Nancy");
		LL.set(0, "Nancy");
		System.out.println(LL);
		System.out.println("------------------------------------------------");

		LL.remove("Nancy");
		LL.remove();
		System.out.println(LL);

		LL.remove(2);
		System.out.println(LL);

		LL.removeAll(LL1);
		System.out.println(LL);

		LL.removeFirst();
		LL.removeLast();
		System.out.println(LL);
		
		LL.clear();
		System.out.println(LL);
		
		System.out.println("Is list empty: " + LL.isEmpty());

	}

}
