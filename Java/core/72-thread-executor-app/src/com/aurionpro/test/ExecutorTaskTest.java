package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.ExecutorTask;

public class ExecutorTaskTest {

	public static void main(String[] args) {
		
		Runnable r1 = new ExecutorTask("Thread 1");
		Runnable r2 = new ExecutorTask("Thread 2");
		Runnable r3 = new ExecutorTask("Thread 3");
		Runnable r4 = new ExecutorTask("Thread 4");
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
//		ExecutorService executor = Executors.newSingleThreadExecutor();

		executor.execute(r1);
		executor.execute(r2);
		executor.execute(r3);
		executor.execute(r4);
		
		executor.shutdown();

	}

}
