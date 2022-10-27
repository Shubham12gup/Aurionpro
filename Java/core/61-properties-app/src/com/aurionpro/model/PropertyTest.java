package com.aurionpro.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("Shubh", "Shubh@123");
		prop.setProperty("Ashish", "Ashish@123");
		prop.setProperty("Reena", "Reena@123");
		try {
			prop.store(new FileWriter("./lib/pass.properties"), "ID and Passwords");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("Shubh"));
		System.out.println(prop.getProperty("Ashish"));
		System.out.println(prop.getProperty("Reena"));
		System.out.println("-----------------------------------");
		
		Properties prop2 = new Properties();
		FileReader reader;
		try {
			reader = new FileReader("./lib/Roll.properties");
			prop2.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop2.getProperty("101"));
		System.out.println(prop2.getProperty("102"));
		System.out.println(prop2.getProperty("103"));
		System.out.println("-----------------------------------");
		
		Properties systemProp = System.getProperties();
		Set<Map.Entry<Object, Object>> systemPropSet = systemProp.entrySet();
		
		Iterator<Map.Entry<Object, Object>> itr = systemPropSet.iterator();
		while(itr.hasNext()) {
			Map.Entry<Object, Object> entry = itr.next();
			System.out.println(entry.getKey() +" = " +entry.getValue());
		}
	}

}
