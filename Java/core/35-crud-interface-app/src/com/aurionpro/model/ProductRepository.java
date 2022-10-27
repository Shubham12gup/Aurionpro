package com.aurionpro.model;

public class ProductRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Creating Product");
	}

	@Override
	public void read() {
		System.out.println("Reading Product");
	}

	@Override
	public void update() {
		System.out.println("Updating Product");
	}

	@Override
	public void delete() {
		System.out.println("Deleting Product");
	}

}
