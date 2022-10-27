package com.aurionpro.test;

import com.aurionpro.model.ExecuteTask;
import com.aurionpro.model.IExecutable;


public class ExecuteTest {

	public static void main(String[] args) {
		ExecuteTask exe = new ExecuteTask();
		exe.execute("One");
		
		
		IExecutable ex = new IExecutable() {
			public void execute(String msg) {
				System.out.println("Executing Task " +msg+ " in annonymous class");
			}
		};
		ex.execute("Two");
		
		
		IExecutable ex1 = (msg) -> {
			System.out.println("Executing Lambda " + msg);
		};
		ex1.execute("Three");
		
		
		IExecutable ex2 = ExecuteTest::showMessage;
		ex2.execute("hello");
	}
	
	public static void showMessage(String msg) {
		System.out.println("Showing Message " + msg);

	}

}
