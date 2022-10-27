package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker manager = new Manager();
		atTheWorkStation(manager);
		atTheCanteen(manager);

		IWorker robot = new Robot();
		atTheWorkStation(robot);
		atTheCanteen(robot);
	}

	private static void atTheCanteen(IWorker worker) {
		worker.startEat();
		worker.stopEat();
	}

	private static void atTheWorkStation(IWorker worker) {
		worker.startWork();
		worker.stopWork();
	}

}
