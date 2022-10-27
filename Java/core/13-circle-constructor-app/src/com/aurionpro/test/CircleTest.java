package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {

	public static void main(String[] args) {
		Circle[] circles = {
				new Circle(20, ColorType.BLUE, BorderType.DOTTED),
				new Circle(30, ColorType.GREEN),
				new Circle(25),
				new Circle()
		};

	for(Circle c: circles) {
		printDetails(c);
		System.out.println("---------------------");
	}
}
	private static void printDetails(Circle circles) {
		System.out.println("Radius : " + circles.getRadius());
		System.out.println("Color : " + circles.getColor());
		System.out.println("Border : " + circles.getBorder());
		System.out.println("Area of circle : " + circles.calculateArea());
		System.out.println(circles);
	}
}