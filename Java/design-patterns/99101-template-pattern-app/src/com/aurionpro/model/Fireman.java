package com.aurionpro.model;

public class Fireman extends Worker{

	@Override
	public void wakeUp() {
		System.out.println("Wake up....");
	}

	@Override
	public void goToWork() {
		System.out.println("Go to work,\nSave people from fire....");
	}

	@Override
	public void returnHome() {
		System.out.println("Return home....");
	}

	@Override
	public void eat() {
		System.out.println("Have dinner....");
	}

	@Override
	public void sleep() {
		System.out.println("Go to sleep.");		
	}

}
