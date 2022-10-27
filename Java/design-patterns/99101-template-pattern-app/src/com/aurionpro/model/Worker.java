package com.aurionpro.model;

public abstract class Worker {
	public abstract void wakeUp();
	public abstract void goToWork();
	public abstract void returnHome();
	public abstract void eat();
	public abstract void sleep();
	
	public void dailyRoutine() {
		wakeUp();
		goToWork();
		returnHome();
		eat();
		sleep();
	}
	
}
