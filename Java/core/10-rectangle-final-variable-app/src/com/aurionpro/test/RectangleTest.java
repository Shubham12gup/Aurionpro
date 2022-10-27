package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle smallRectangle = new Rectangle(-10, 20, ColorType.BLUE);
		printAreaDetails(smallRectangle);

		System.out.println("-----------------------------");
		Rectangle bigRectangle = new Rectangle(101, 20, ColorType.GREEN);
		printAreaDetails(bigRectangle);
	}

	private static void printAreaDetails(Rectangle rectangle) {
		System.out.println("Height : " + rectangle.getHeight());
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Area of rectangle = " + rectangle.calculateArea());
		System.out.println("Color of rectangle : " + rectangle.getColor());
	}

}
