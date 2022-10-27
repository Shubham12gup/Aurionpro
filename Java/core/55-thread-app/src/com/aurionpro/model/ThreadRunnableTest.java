package com.aurionpro.model;

public class ThreadRunnableTest implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Running Thread");
	}
	
	
	public static void main(String[] args) {
		ThreadRunnableTest obj = new ThreadRunnableTest();
		Thread thread = new Thread(obj);
		
		System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());
		
		
	}

}
