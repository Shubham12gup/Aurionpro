package com.aurionpro.model;

public class ExecuteTask implements IExecutable{

	@Override
	public void execute(String msg) {
		System.out.println("Executing Task " + msg);
	}
	

}
