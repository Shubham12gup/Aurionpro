package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	
	public List<String> getBrands(String color){
		
		List<String> brands = new ArrayList<>();
		
		if(color.equals("Light")) {
			brands.add("Lite American");
			brands.add("Munich Helles");
			brands.add("Dortmunder Export");
		}
		
		if(color.equals("Dark")) {
			brands.add("Dark American");
			brands.add("Munich Dunkel");
			brands.add("Schwarzbier");
			
		}

		if(color.equals("Amber")) {
			brands.add("North German Altbier");
			brands.add("California Common Beer");
			brands.add("Dusseldorf Altbier");
			
		}
		
		if(color.equals("Brown")) {
			brands.add("Sweetwater Georgia Brown");
			brands.add("Durty Mud Season Hoppy Brown");
			
		}
		return brands;
		
	}
}
