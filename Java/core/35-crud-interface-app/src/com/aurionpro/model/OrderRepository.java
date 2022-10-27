package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Creating Order");
	}

	@Override
	public void read() {
		System.out.println("Reading Order");
	}

	@Override
	public void update() {
		System.out.println("Updating Order");
	}

	@Override
	public void delete() {
		System.out.println("Deleting Order");
	}

}
