package com.aurionpro.model;

public class Manager implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Manager Start working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager Stop working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager Start Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager Stop Eating");
	}
	

}
