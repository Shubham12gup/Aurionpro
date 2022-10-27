package com.aurionpro.test;

import com.aurionpro.model.Fireman;
import com.aurionpro.model.SoftwareDeveloper;
import com.aurionpro.model.Worker;

public class WorkerTest {

	public static void main(String[] args) {
		Worker fireman = new Fireman();
		fireman.dailyRoutine();
		System.out.println("-------------------------------");
		Worker developer = new SoftwareDeveloper();
		developer.dailyRoutine();
	}

}
