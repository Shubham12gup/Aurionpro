package com.aurionpro.model;

public class EnumExample {
	
	enum Season { WINTER, SUMMER, RAINY}

	public static void main(String[] args) {
		
		for(Season season: Season.values()) {
			System.out.println(season);
			System.out.println("Index of " + season+ ": " + season.ordinal());

		}
		
		System.out.println("Value of winter: " + Season.valueOf("WINTER"));
		System.out.println("Value of winter: " + Season.valueOf("WINTER").ordinal());
		
	}

}
