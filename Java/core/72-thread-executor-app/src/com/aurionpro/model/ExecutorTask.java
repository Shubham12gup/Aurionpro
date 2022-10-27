package com.aurionpro.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExecutorTask implements Runnable {

	String name;

	public ExecutorTask(String name) {
		this.name = name;
	}

	public void run() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalTime time = LocalTime.now();
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				System.out.println("Thread with name " + name + " is created at " + time.format(formatter));
			} else {
				System.out.println("Executing " + name + " - " + time.format(formatter));
				
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
