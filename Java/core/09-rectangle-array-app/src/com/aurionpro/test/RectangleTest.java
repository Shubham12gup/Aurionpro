package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle[] rectangles = {
				new Rectangle(-10, 20, ColorType.BLUE),
				new Rectangle(-40, 10, ColorType.BLUE),
				new Rectangle(10, 10, ColorType.RED),
				new Rectangle(40, 101, ColorType.GREEN),
				new Rectangle(-40, 200, ColorType.GREEN),
		};
		
		for(Rectangle rect: rectangles) {
			printAreaDetails(rect);
			System.out.println("-----------------------------");
		}
	}

	private static void printAreaDetails(Rectangle rectangle) {
		System.out.println("Height : " + rectangle.getHeight());
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Area of rectangle = " + rectangle.calculateArea());
		System.out.println("Color of rectangle : " + rectangle.getColor());
	}

}
