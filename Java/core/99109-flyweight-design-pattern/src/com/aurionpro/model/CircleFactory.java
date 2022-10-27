package com.aurionpro.model;

import java.util.HashMap;

public class CircleFactory {
	private static final HashMap<String, ICircle> circleMap = new HashMap<String, ICircle>();

	   public static ICircle getCircle(String color) {
	      ICircle circle = (ICircle)circleMap.get(color);

	      if(circle == null) {
	    	  circle = new ColorCircle(color);
	         circleMap.put(color, circle);
	         System.out.println("Creating circle of color : " + color);
	      }
	      return circle;
	   }
}
