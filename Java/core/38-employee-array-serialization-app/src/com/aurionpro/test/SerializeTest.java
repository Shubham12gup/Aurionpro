package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class SerializeTest {

	public static void main(String[] args) {
		try {
			Employee[] employee = {
					new Employee(101, "Shubh", 50000),
					new Employee(102, "Rahul", 40000),
					new Employee(103, "XYZ", 30000),
					new Employee(104, "LMN", 20000),
					new Employee(105, "PQR", 10000)
					};
			FileOutputStream file = new FileOutputStream("./lib/test.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(employee);
			out.close();
			file.close();
			System.out.println("Employee is Serialized.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
