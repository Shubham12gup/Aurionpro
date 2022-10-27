package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders = new ArrayList<Order>();

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public int orderCount() {
		return orders.size();
	}
	
	public double cartTotal() {
		double cartTotal=0;
		for (Order ord : orders)
			cartTotal = cartTotal + ord.calculateOrderPrice();
		return cartTotal;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Customer [id=" + id + ", name=" + name + ", orders=\n"
				+ (orders != null ? orders.subList(0, Math.min(orders.size(), maxLen)) : null) + "]";
	}
	
	
}
