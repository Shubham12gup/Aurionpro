package com.aurionpro.model;

public class Boy extends Man{
	
	@Override
	public void read() {
		System.out.println("Boy is reading");
	}
	
	@Override
	public void play(){
		System.out.println("Boy is playing");
	}	
}
