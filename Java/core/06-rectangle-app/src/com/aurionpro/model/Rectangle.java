package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	
	public void setHeight(double ht) {
		height = ht;
	}
	
	public void setWidth(double wt) {
		width = wt;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	
	public double calculateArea() {
		return height * width;
		
	}
	
}
