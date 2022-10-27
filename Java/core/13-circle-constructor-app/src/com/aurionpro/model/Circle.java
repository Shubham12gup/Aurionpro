package com.aurionpro.model;

public class Circle {
	public double radius;
	public ColorType color;
	public BorderType borderType;

	public Circle(double radius, ColorType color, BorderType borderType) {
		this.radius = radius;
		this.color = color;
		this.borderType = borderType;
	}

	public Circle(double radius, ColorType color) {
		this(radius, color, BorderType.SOLID);
	}

	public Circle(double radius) {
		this(radius, ColorType.BLUE, BorderType.SOLID);
	}

	public Circle() {
		this.radius = 10;
	}

	public double getRadius() {
		return radius;
	}

	public ColorType getColor() {
		return color;
	}

	public BorderType getBorder() {
		return borderType;
	}

	public double calculateArea() {
		return 3.14 * radius * radius;
	}

	public String toString() {
		return "Radius: " +radius+ " Color: " +color + " Border: " +borderType;
	}
}
