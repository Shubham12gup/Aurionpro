package com.aurionpro.test;

import com.aurionpro.model.Invoice;
//import com.aurionpro.model.Invoice;
import com.aurionpro.model.Product;

public class InvoiceTest {
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) {
		Product[] products = { 
				new Product("101", "Cycle", 1000, 10, 5), 
				new Product("102", "Book", 100, 10, 5),
				new Product("103", "Pen", 10, 10, 5), 
				new Product("104", "Pencil", 100, 10, 5),
				new Product("105", "Scale", 50, 10, 5) };

		for (Product product : products) {
			product.printInvoice();
		}

//		Invoice invoice = new Invoice();
		System.out.println(ANSI_GREEN_BACKGROUND + "TOTAL BILL : " + Invoice.getTotalBill() + ANSI_RESET);

		
	}

}
