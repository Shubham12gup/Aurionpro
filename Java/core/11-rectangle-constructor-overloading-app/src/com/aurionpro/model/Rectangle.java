package com.aurionpro.model;

public class Rectangle {
	private final double height;
	private final double width;
	private ColorType color;

	public Rectangle(double height, double width, ColorType color) {
		this.height = validateValues(height);
		this.width = validateValues(width);
		this.color = color;
	}
	
	public Rectangle(double height, double width) {
		this.height = validateValues(height);
		this.width = validateValues(width);
		this.color = ColorType.BLUE;
	}
	
	public Rectangle(double height) {
		this.height = validateValues(height);
		this.width = 10;
	}
	
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public ColorType getColor() {
		return color;
	}

//	***Cant have setters as instance variables are final***
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//	public void setWidth(double width) {
//		this.width = width;
//	}
//
//	public void setColor(ColorType color) {
//		this.color = color;
//	}
	
	private double validateValues(double value) {
		if (value <= 0)
			return 1;
		if (value > 100)
			return 100;
		return value;
	}

	public double calculateArea() {
		return height * width;

	}
}
