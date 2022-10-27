package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.aurionpro.model.Singleton;

public class SingletonTest implements Serializable{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
//		Singleton obj = Singleton.getInstance();
//		System.out.println(obj.hashCode());

		try {
			Singleton obj = Singleton.getInstance();

			FileOutputStream file = new FileOutputStream("./lib/test.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(obj);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Object is serialized");

		
//		Singleton obj1 = Singleton.getInstance();
//		System.out.println(obj1.hashCode());

//		Runnable t1 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println(Singleton.getInstance().hashCode());
//			}
//		};
//		
//		t1.run();
		
	}

}
