package com.aurionpro.model;

public class Printer {
	
	DelegatePrinter dPrinter = new DelegatePrinter();
	
	public void print(){
		dPrinter.print();
	}
}
