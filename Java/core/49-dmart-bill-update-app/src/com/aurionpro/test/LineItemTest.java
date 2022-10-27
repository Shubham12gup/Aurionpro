package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		ArrayList<LineItem> items = new ArrayList<LineItem>();
		
		items.add(new LineItem(1, "Parle-G", 5, 10));
		items.add(new LineItem(2, "MarieGold", 2, 50));
		items.add(new LineItem(2, "MarieGold", 4, 50));
		items.add(new LineItem(3, "Scrubber", 4, 20));
		items.add(new LineItem(4, "Knife", 2, 50));
		items.add(new LineItem(5, "Potato", 3, 40));
		items.add(new LineItem(5, "Potato", 6, 40));
		
		Set<LineItem> item = new HashSet<LineItem>(items);
		double totalBill = 0;
		for(LineItem i: item) {
			System.out.println(i);
			totalBill += i.calculateTotalPrice();
		}
		System.out.println("Total bill of cart : " +totalBill);
		
	}



}
