package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class RegionTest {

	public static void main(String[] args) {
		HashMap<Integer, String> regionMap = new HashMap<Integer, String>();
		regionMap.put(1, "Europe");
		regionMap.put(2, "Americas");
		regionMap.put(3, "Asia");
		regionMap.put(4, "Middle East and Africa");
		
		Region[] region = { 
				new Region(1, "Europe"),
				new Region(2, "Americas"),
				new Region(3, "Asia"),
				new Region(4, "Middle East and Africa")
				};
		
		Country[]  country = {
					new Country("IT", "Italy", 1),
					new Country("JP", "Japan", 3),
					new Country("US", "United States of America", 2),
					new Country("CA", "Canada", 2),
					new Country("CN", "China", 3),
					new Country("IN", "India", 3),
					new Country("AU", "Australia", 3),
					new Country("ZW", "Zimbabwe",4),
					new Country("SG", "Singapore", 3),
					new Country("UK", "United Kingdom", 1),
					new Country("FR", "France", 1),
					new Country("DE", "Germany", 1),
					new Country("ZM", "Zambia", 4),
					new Country("EG", "Egypt", 4),
					new Country("BR", "Brazil", 2),
					new Country("CH", "Switzerland", 1),
					new Country("NL", "Netherlands", 1),
					new Country("MX", "Mexico", 2),
					new Country("KW", "Kuwait", 4),
					new Country("IL", "Israel", 4),
					new Country("DK", "Denmark", 1),
					new Country("HK", "HongKong", 3),
					new Country("NG", "Nigeria", 4),
					new Country("AR", "Argentina", 2),
					new Country("BE", "Belgium", 1) 
					};
		
		ArrayList<Country> region1Countrys = new ArrayList<Country>();
		ArrayList<Country> region2Countrys = new ArrayList<Country>();
		ArrayList<Country> region3Countrys = new ArrayList<Country>();
		ArrayList<Country> region4Countrys = new ArrayList<Country>();
		
		countryClassifier(country, region1Countrys, region2Countrys, region3Countrys, region4Countrys);
		
		System.out.println("European countrys");
		printRegionCountry(region1Countrys);
		
		System.out.println("American countrys");
		printRegionCountry(region2Countrys);

		System.out.println("Asian countrys");
		printRegionCountry(region3Countrys);

		System.out.println("MiddleEast countrys");
		printRegionCountry(region4Countrys);
		
		
		System.out.print("Enter country code : ");
		Scanner sc = new Scanner(System.in);
		String inputCode = sc.next();
		
		for (Country c: country) {
			if (c.getCode().equals(inputCode)) {
 				System.out.println("Code: " + c.getCode() + "\nCountry Name: " +c.getName() + "\nRegion: " + regionMap.get(c.getId()));
			}
		}
	}

	public static void countryClassifier(Country[] country, ArrayList<Country> region1, ArrayList<Country> region2,
			ArrayList<Country> region3, ArrayList<Country> region4) {
		for (Country c: country) {
			if (c.getId() == 1) 
				region1.add(c);
			
			if (c.getId() == 2) 
				region2.add(c);
			
			if (c.getId() == 3) 
				region3.add(c);
			
			if (c.getId() == 4) 
				region4.add(c);
		}
	}

	private static void printRegionCountry(ArrayList<Country> region) {
		for (Country r:region)
			System.out.println(r);
		System.out.println(region.size());
		System.out.println("------------------------------------------");
	}
	
	
}
