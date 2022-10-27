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
		this(height, width, ColorType.RED);
	}
	
	public Rectangle(double height) {
		this(height, 10, ColorType.RED);
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
