package com.aurionpro.model;

public class ThreadExtendTest extends Thread {

	public synchronized void run() {
		System.out.println("Thread is running");
		System.out.println("Thread State: " + Thread.currentThread().getState());
		System.out.println("Thread priority: " + Thread.currentThread().getPriority());
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println("------------------------------------------");
	}

	public static void main(String[] args) {
		ThreadExtendTest thread1 = new ThreadExtendTest();

		System.out.println("Thread State: " + thread1.getState());
		thread1.setPriority(MIN_PRIORITY);
		thread1.setName("Shubh");

		ThreadExtendTest thread2 = new ThreadExtendTest();
		thread2.setPriority(MAX_PRIORITY);
		thread2.setName("Ashish");

		thread1.start();
		thread2.start();
	}

}
