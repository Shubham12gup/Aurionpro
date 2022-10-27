package com.aurionpro.model;

public class PrintInvoice {
	
	public void print(Invoice in) {
		System.out.println(in.toString());
		System.out.println("Tax Amount: " + in.calculateTax());
		System.out.println("Discount Amount: " +in.calculateDiscount());
		System.out.println("Total Amount: " +in.calculateTotal());
	}
	
}
