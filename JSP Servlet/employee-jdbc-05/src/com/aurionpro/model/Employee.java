package com.aurionpro.model;

public class Employee {
	
	private int empNo;
	private String eName;
	private String job;
	private int manager;
	private String hireDate;
	private double salary;
	private double commission;
	private int deptNo;
	
	public Employee(int empNo, String eName, String job, int manager, String hireDate, double salary, double commission,
			int deptNo) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.manager = manager;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String geteName() {
		return eName;
	}

	public String getJob() {
		return job;
	}

	public int getManager() {
		return manager;
	}

	public String getHireDate() {
		return hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public double getcommission() {
		return commission;
	}

	public int getDeptNo() {
		return deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", manager=" + manager + ", hireDate="
				+ hireDate + ", salary=" + salary + ", commission=" + commission + ", deptNo=" + deptNo + "]";
	}
	
}