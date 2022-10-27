package com.aurionpro.model;

public class Biscuit implements IItem {
	
	String name;
	double price;
	
	
	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
