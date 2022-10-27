package com.aurionpro.test;

import com.aurionpro.model.EmployeeStore;

public class EmployeeStoreTest {

	public static void main(String[] args) {
		EmployeeStore.getEmployee("Accountant").performTask();
		EmployeeStore.getEmployee("Developer").performTask();
		EmployeeStore.getEmployee("Manager").performTask();
	}

}
