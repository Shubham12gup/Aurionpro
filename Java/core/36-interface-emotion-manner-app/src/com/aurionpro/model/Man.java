package com.aurionpro.model;

public class Man implements IMannerable, IEmotionable {
	
	@Override
	public void greet() {
		System.out.println("Hii, I am a Man.");
	}
	
	@Override
	public void depart() {
		System.out.println("Man is departing");
	}

	@Override
	public void cry() {
		System.out.println("Man is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Man is laughing");
	}


}
