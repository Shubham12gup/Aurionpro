package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Creating Customer");
	}

	@Override
	public void read() {
		System.out.println("Reading Cutomer");
	}

	@Override
	public void update() {
		System.out.println("Updating Cutomer");
	}

	@Override
	public void delete() {
		System.out.println("Deleting Cutomer");
	}

}
