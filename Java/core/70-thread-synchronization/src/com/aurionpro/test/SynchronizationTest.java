package com.aurionpro.test;

import com.aurionpro.model.Thread1;
import com.aurionpro.model.Thread2;

public class SynchronizationTest {
	
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.setName("Shubh");
		thread1.setPriority(7);
		thread1.start();


		Thread1 thread2 = new Thread1();
		thread2.setName("Immanuel");
		
//		try {
//			thread1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		thread2.start();
//		try {
//			thread2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(thread1.getState());
//		System.out.println(thread2.getState());
	}

}
