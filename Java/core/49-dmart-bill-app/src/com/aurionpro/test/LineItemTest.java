package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		ArrayList<LineItem> items = new ArrayList<LineItem>();
		
		items.add(new LineItem(1, "Parle-G", 5, 10));
		items.add(new LineItem(2, "MarieGold", 2, 50));
		items.add(new LineItem(3, "Scrubber", 4, 20));
		items.add(new LineItem(4, "Knife", 2, 50));
		items.add(new LineItem(5, "Potato", 3, 40));
		
		double totalBill = 0;
		for(LineItem item: items) {
			System.out.println(item);
			totalBill += item.calculateTotalPrice();
		}
		System.out.println("Total bill of cart : " +totalBill);
		
	}

}
