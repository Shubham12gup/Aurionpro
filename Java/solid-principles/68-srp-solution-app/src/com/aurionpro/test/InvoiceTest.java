package com.aurionpro.test;

import com.aurionpro.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("101", "Cycle", 100, 10, 5);
		invoice.printInvoice();
	}

}
