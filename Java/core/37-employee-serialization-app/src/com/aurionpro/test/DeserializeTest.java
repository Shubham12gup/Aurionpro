package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;

public class DeserializeTest {

	public static void main(String[] args) {

		Employee employee = null;
		try {
			SerializeTest.main(args);
			FileInputStream file = new FileInputStream("./lib/test.bin");
			ObjectInputStream in = new ObjectInputStream(file);

//			while(in == null) {
//				SerializeTest.main(new String[0]);
//				file = new FileInputStream("./lib/test.bin");
//				in = new ObjectInputStream(file);
//			}
			employee = (Employee) in.readObject();
			in.close();
			file.close();
			System.out.println("Employee is Deserialized");
			System.out.println(employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
