package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(1);
		pq.add(6);
		pq.add(7);
		System.out.println(pq);

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5));
		System.out.println("Adding arraylist elements in queue");
		pq.addAll(list);
		System.out.println(pq);
//		pq.forEach(System.out::println);
		System.out.println("Size: " + pq.size());

		System.out.println("\nHead: " + pq.peek());
		System.out.println("Head: " + pq.element());
		System.out.println(pq);
		
		System.out.println("\nRemoving Head: " + pq.poll());
		System.out.println(pq);

		System.out.println("Removing Head: " + pq.remove());
		System.out.println(pq);

		pq.removeAll(list);
		System.out.println(pq);

		pq.clear();
		System.out.println(pq);
		System.out.println("Is empty: " + pq.isEmpty());

	}

}
