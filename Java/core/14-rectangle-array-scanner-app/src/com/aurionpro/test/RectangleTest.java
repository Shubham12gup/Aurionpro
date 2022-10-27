package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Objects: ");
		int number = sc.nextInt();
		Rectangle[] rectangles = new Rectangle[number];

		for (int i = 0; i < number; i++) {
			System.out.println("Object " + (i+1) + " details");
			System.out.print("Enter height: ");
			double height = sc.nextDouble();
			System.out.print("Enter width: ");
			double width = sc.nextDouble();
			System.out.print("Enter color: ");
			String color = sc.next();
			System.out.println("");
			ColorType clr;
			try {
				clr = ColorType.valueOf(color.toUpperCase());
			} catch (IllegalArgumentException e) {
				clr = ColorType.RED;
			}
			rectangles[i] = new Rectangle(height, width, clr);
		}

		for (Rectangle r : rectangles) {
			printAreaDetails(r);
			System.out.println("-------------------");
		}
	}

	private static void printAreaDetails(Rectangle rectangle) {
		System.out.println("Height : " + rectangle.getHeight());
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Area of rectangle = " + rectangle.calculateArea());
		System.out.println("Color of rectangle : " + rectangle.getColor());
	}

}
