package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle[] rectangles = {
				new Rectangle(-10, 20),
				new Rectangle(-10, 20),
				new Rectangle(10),
				new Rectangle(40, 101, ColorType.GREEN),
				new Rectangle(-40, 200, ColorType.GREEN),
		};
		
		Rectangle r1 = new Rectangle(-10, 20);
		Rectangle r2 = new Rectangle(-10, 20);
		
		System.out.println(r1.equals(r2));
//		for(Rectangle rect: rectangles) {
//			printAreaDetails(rect);
//			System.out.println("---------------");
//		}

		//Rectangle r1 = new Rectangle(10, 20, ColorType.BLUE);
		//Calling count from variable of Class Rectangle 
		System.out.println("Object Count = " + Rectangle.count +"\n");
		
		//Calling count from Object.
		//System.out.println("Object Count = " + r1.getCount +"\n");

	}
	
	private static void printAreaDetails(Rectangle rectangle) {
		System.out.println("Height : " + rectangle.getHeight());
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Area of rectangle = " + rectangle.calculateArea());
		System.out.println("Color of rectangle : " + rectangle.getColor());
		//System.out.println("Object Count = " + Rectangle.count +"\n");

	}

}
