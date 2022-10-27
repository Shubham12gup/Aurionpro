package com.aurionpro.model;

public class Thread1 extends Thread{
	
	public void run() {
		Synchro sync = new Synchro();
		int loopValue = 3;
		sync.printThreadDetails(loopValue);
	}

}
