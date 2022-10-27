package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Singleton;

public class SingletonDeserializeTest {

	public static void main(String[] args) {
		
		Singleton obj = Singleton.getInstance();
		System.out.println("Object1 : " + obj.hashCode());

		try {
			FileInputStream file = new FileInputStream("./lib/test.bin");
			ObjectInputStream in = new ObjectInputStream(file);

			Singleton obj1 = (Singleton) in.readObject();
			
			if(obj == obj1)
			{
				System.out.println("Same object");
			}
			else
			{
				System.out.println("Object2 : " + obj1.hashCode());
			}

			in.close();
			file.close();
			System.out.println("Object is Deserialized");
			System.out.println(obj1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
