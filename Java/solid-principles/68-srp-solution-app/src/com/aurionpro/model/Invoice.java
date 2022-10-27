package com.aurionpro.model;

public class Invoice {
	String id;
	String description;
	double amount;
	float tax;
	double discountPercent;
	public Invoice(String id, String description, double amount, float tax, double discountPercent) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}
	public Invoice() {
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
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", tax%=" + tax
				+ ", discountPercent%=" + discountPercent + "]";
	}
	
	public double calculateTax() {
		return (amount * tax)/100;
	}
	
	public double calculateDiscount() {
		return (amount*discountPercent)/100;
	}
	
	public double calculateTotal() {
		return amount + calculateTax() - calculateDiscount();
	}
	
	public void printInvoice() {
		PrintInvoice print = new PrintInvoice();
		print.print(this);
	}
}
