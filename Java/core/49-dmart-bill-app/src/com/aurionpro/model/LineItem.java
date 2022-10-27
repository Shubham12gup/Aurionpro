package com.aurionpro.model;

public class LineItem {
	int id;
	String name;
	int quantity;
	double unitPrice;
	double totalCost;
	
	public LineItem(int id, String name, int quantity, double unitPrice) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalCost = calculateTotalPrice();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double getTotalCost() {
		return totalCost;
	}
	
	public double calculateTotalPrice() {
		return quantity * unitPrice;
	}
	
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", totalCost=" + totalCost + "]";
	}
}
