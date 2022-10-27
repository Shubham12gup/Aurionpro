package com.aurionpro.test;

//import com.aurionpro.model.ThreadJoin;

public class ThreadJoinTest extends Thread{
	
	public void run() {
		System.out.println("Thread : " +Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadJoinTest thread1 = new ThreadJoinTest();
		ThreadJoinTest thread2 = new ThreadJoinTest();
		ThreadJoinTest thread3 = new ThreadJoinTest();
		
		thread3.start();
		
		thread1.start();
		thread1.join(10);
		
		thread2.start();
		thread2.join(1000, 100);
		
		
		
		
	}

}
