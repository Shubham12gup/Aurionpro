package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class RegionCountryTest {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Region> region = new ArrayList<Region>();
		HashMap<Integer, String> regionMap = new HashMap<Integer, String>();
		File regionFile = new File("./lib1/Region.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(regionFile))) {
			for (String line; (line = br.readLine()) != null;) { 
				StringTokenizer tokenizer1 = new StringTokenizer(line.replace("\"", "").replace(" ", ""), ",", false);
				while (tokenizer1.hasMoreElements()) {
					String id = tokenizer1.nextToken();
					String name = tokenizer1.nextToken();
					region.add(new Region(Integer.parseInt(id), name));
					regionMap.put(Integer.parseInt(id), name);
				}
			}
		}
		ArrayList<Country> country = new ArrayList<Country>();
		File countryFile = new File("./lib1/Country.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(countryFile))) {
			for (String line; (line = br.readLine()) != null;) { 
				StringTokenizer tokenizer1 = new StringTokenizer(line.replace("\"", "").replace(" ", ""), ",", false);
				while (tokenizer1.hasMoreElements()) {
					String code = tokenizer1.nextToken();
					String name = tokenizer1.nextToken();
					String id = tokenizer1.nextToken();
					country.add(new Country(code, name, Integer.parseInt(id)));
				}
			}
		}
		
		ArrayList<Country> region1 = new ArrayList<Country>();
		ArrayList<Country> region2 = new ArrayList<Country>();
		ArrayList<Country> region3 = new ArrayList<Country>();
		ArrayList<Country> region4 = new ArrayList<Country>();
		
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
		System.out.println("European countrys");
		printRegionCountry(region1);
		System.out.println("Number of countries in " + regionMap.get(1) + " : " +region1.size());
		System.out.println("------------------------------------------");
		
		System.out.println("American countrys");
		printRegionCountry(region2);
		System.out.println("Number of countries in " + regionMap.get(2) + " : " +region2.size());
		System.out.println("------------------------------------------");

		System.out.println("Asian countrys");
		printRegionCountry(region3);
		System.out.println("Number of countries in " + regionMap.get(3) + " : " +region3.size());
		System.out.println("------------------------------------------");

		System.out.println("MiddleEast countrys");
		printRegionCountry(region4);
		System.out.println("Number of countries in " + regionMap.get(4) + " : " +region4.size());
		System.out.println("------------------------------------------");
		
		System.out.print("Enter country code : ");
		Scanner sc = new Scanner(System.in);
		String inputCode = sc.next();
		
		for (Country c: country) {
			if (inputCode.equalsIgnoreCase(c.getCode())) {
 				System.out.println("Code: " + c.getCode() + "\nCountry Name: " +c.getName() + "\nRegion: " + regionMap.get(c.getId()));
			}
		}
		System.out.println("-------------------------------");
	}
	
	private static void printRegionCountry(ArrayList<Country> region) {
		for (Country r:region)
			System.out.println(r);
	}
}
