package com.aurionpro.model;

public class Product {
	String id;
	String description;
	double amount;
	float tax;
	double discountPercent;
	
	public Product(String id, String description, double amount, float tax, double discountPercent) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}
	
	public String getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public double getAmount() {
		return amount;
	}
	public float getTax() {
		return tax;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	
	public void printInvoice() {
		Invoice print = new Invoice(this);
		print.printInvoice();
	}
	
//	public static void totalBill()
//	{
//		Invoice.getTotalBill();
//	}
	
}
