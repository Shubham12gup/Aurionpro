package com.aurionpro.model;

public class Tesla implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Tesla Start");
	}

	@Override
	public void stop() {
		System.out.println("Tesla Stop");
	}

}
