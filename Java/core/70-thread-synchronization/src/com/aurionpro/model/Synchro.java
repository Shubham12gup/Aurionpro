package com.aurionpro.model;

public class Synchro {

	synchronized public static void printThreadDetails(int x) {
//		synchronized (this) {
			System.out.println("Thread is running");
			System.out.println("Thread State: " + Thread.currentThread().getState());
			System.out.println("Thread priority: " + Thread.currentThread().getPriority());
			System.out.println("Thread Name: " + Thread.currentThread().getName());
			
			for (int i = 1; i <= x; i++)
				System.out.println(i);
			System.out.println("------------------------------------------");
//		}
	}
}
