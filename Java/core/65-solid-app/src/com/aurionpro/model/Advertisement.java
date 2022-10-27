package com.aurionpro.model;

public class Advertisement {
	
	IDisplayable disp;
	
	public void setDisplayModule(IDisplayable disp) {
		this.disp = disp;
	}
	
	public void showDisplay() {
		disp.display();
	}
}
