package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<IItem> items;

	public ShoppingCart() {
		super();
		items = new ArrayList<IItem>();
	}

	public List<IItem> getItems() {
		return items;
	}
	
	public void addItemToCart(IItem item){
		items.add(item);
	}
	
	public double getTotalPrice(){
		double total = 0;
		for (IItem i: items) {
			total = total + i.getPrice();
		}
		return total;
	}
	
	
}
