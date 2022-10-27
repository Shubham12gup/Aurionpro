package com.aurionpro.test;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Running Thread inside annonymous class");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> {
			System.out.println("Running Thread inside Lambda ");
		};
		Thread t2 = new Thread(r2);
		t2.start();

		Runnable r3 = ThreadTest::execute;
		Thread t3 = new Thread(r3);
		t3.start();

	}

	public static void execute() {
		System.out.println("Executing thread");
	}

}
