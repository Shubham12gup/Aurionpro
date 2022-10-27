package com.aurionpro.model;

public class Invoice {
	Product product;
	
	static double totalBill;
	
//	public Invoice() {};
	
	public Invoice(Product product) {
		this.product = product;
		this.totalBill = calculateTotalBill(); 
	}

	public static double getTotalBill() {
		return totalBill;
	}

	@Override
	public String toString() {
		return "Product [id=" + product.id + ", description=" + product.description + ", amount=" + product.amount + ", tax%=" + product.tax
				+ ", discountPercent%=" + product.discountPercent + "]";
	}
	
	public double calculateTax() {
		return (product.amount * product.tax)/100;
	}
	
	public double calculateDiscount() {
		return (product.amount*product.discountPercent)/100;
	}
	
	public double calculateProductTotal() {
		return product.amount + calculateTax() - calculateDiscount();
	}
	
	
	public void printInvoice() {
		System.out.println(toString());
		System.out.println("Tax Amount: " + calculateTax());
		System.out.println("Discount Amount: " + calculateDiscount());
		System.out.println("Total Amount: " + calculateProductTotal());
		System.out.println("-------------------------------------------------------");

	}
	
	public double calculateTotalBill() {
		totalBill += calculateProductTotal();
		return totalBill;
	}
	
}
