package com.aurionpro.model;

//import java.util.*;
public class Rectangle {
	private double height;
	private double width;
	private String color;

	public Rectangle(double height, double width, String color) {
		this.height = validateValues(height);
		this.width = validateValues(width);
		this.color = validateColor(color);
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getColor() {
		return color;
	}

	private String validateColor(String color) {
		if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue"))
			return color.toLowerCase();
		else
			return "red";
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
