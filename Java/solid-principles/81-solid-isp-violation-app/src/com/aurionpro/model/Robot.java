package com.aurionpro.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot Start working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stop working");
	}

	@Override
	public void startEat() throws RuntimeException{
		throw new RuntimeException("Robots dont eat");
	}

	@Override
	public void stopEat() throws RuntimeException{
		throw new RuntimeException("Robots dont eat");
	}

}
