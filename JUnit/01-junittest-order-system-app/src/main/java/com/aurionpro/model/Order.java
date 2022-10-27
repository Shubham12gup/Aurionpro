package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int id;
	private String date;
	private List<LineItem> items = new ArrayList<LineItem>();

	public Order(int id, String date) {
		super();
		this.id = id;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addLineItem(LineItem item) {
		items.add(item);
	}

	public int itemsCount() {
		return items.size();
	}

	public double calculateOrderTotal() {
		double orderTotal = 0;
		for (LineItem item : items)
			orderTotal = orderTotal + item.calculateLineItemCost();
		return orderTotal;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Order [id=" + id + ", date=" + date + ", items=\n"
				+ (items != null ? items.subList(0, Math.min(items.size(), maxLen)) : null) + "Order Total= " +calculateOrderTotal()+ "]\n\n";
	}

}
