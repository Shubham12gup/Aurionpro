package com.aurionpro.model;

public class Infant extends Man{
	
	@Override
	public void read() {
		System.out.println("Infant is reading");
	}
	
	@Override
	public void play(){
		System.out.println("Infant is playing");
	}	

}
