package com.aurionpro.test;

import com.aurionpro.model.IEatable;
import com.aurionpro.model.IWorker;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		Manager manager = new Manager();
		atTheWorkStation(manager);
		atTheCanteen(manager);

		IWorker robot = new Robot();
		atTheWorkStation(robot);
	}

	private static void atTheCanteen(IEatable worker) {
		worker.startEat();
		worker.stopEat();
	}

	private static void atTheWorkStation(IWorker worker) {
		worker.startWork();
		worker.stopWork();
	}

}
