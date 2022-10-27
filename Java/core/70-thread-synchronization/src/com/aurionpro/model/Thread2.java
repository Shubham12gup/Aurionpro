package com.aurionpro.model;

public class Thread2 extends Thread{
	
	public void run() {
		Synchro sync = new Synchro();
		int loopValue = 5;
		sync.printThreadDetails(loopValue);
	}

}
