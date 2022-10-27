package com.aurionpro.model;

public class Boy implements IMannerable {

	@Override
	public void greet() {
		System.out.println("Hii, I am a boy.");
	}

	@Override
	public void depart() {
		System.out.println("Boy is departing");
	}

}
