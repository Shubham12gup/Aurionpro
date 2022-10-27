package com.aurionpro.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.aurionpro.model.Employee;
import com.aurionpro.model.EmployeeDBUtil;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmployeeController() {
        super();
    }

    @Resource(name="jdbc/emp")
	private DataSource dataSource;
    
    private EmployeeDBUtil employeeDBUtil;
    
    
	
	@Override
	public void init() throws ServletException {
		super.init();
		employeeDBUtil = new EmployeeDBUtil(dataSource);

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command = request.getParameter("command");
		System.out.println(command);
		
		if(command == null) {
			command = "list";
		}
		
		switch(command) {
			case "add":
				addEmployee(request, response);
				break;
			case "load":
				loadEmployee(request, response);
				break;
			case "update":
				updateEmployee(request, response);
				break;
			case "list":
				listEmployee(request, response);
				break;
			case "delete":
				deleteEmployee(request, response);
				break;
			default:
				listEmployee(request, response);
		}
		listEmployee(request, response);
		
	}


	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
		int empNo = Integer.parseInt(request.getParameter("employeeId"));
//		Employee employee = employeeDBUtil.getEmployee(empNo);
		employeeDBUtil.deleteEmployee(empNo);

	}


	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empNo = Integer.parseInt(request.getParameter("id"));
		String eName = request.getParameter("ename");
		String job = request.getParameter("job");
		int manager = Integer.parseInt(request.getParameter("manager"));
		String hireDate = request.getParameter("hiredate");
		double salary  = Double.parseDouble(request.getParameter("salary"));
		double commission  = Double.parseDouble(request.getParameter("commission"));
		int deptNo = Integer.parseInt(request.getParameter("deptno"));
		
		Employee tempEmployee = new Employee(empNo, eName, job, manager, hireDate, salary, commission, deptNo);
		employeeDBUtil.updateEmployee(tempEmployee);
		listEmployee(request, response);
	}


	private void loadEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empNo = Integer.parseInt(request.getParameter("employeeId"));
		System.out.println("emp no:" + empNo);
		
		Employee employee = employeeDBUtil.getEmployee(empNo);
		System.out.println(employee);
		
		request.setAttribute("employeeRecord", employee);
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-employee-form.jsp");
		dispatcher.forward(request, response);

	}


	private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empNo = Integer.parseInt(request.getParameter("eno"));
		String eName = request.getParameter("ename");
		String job = request.getParameter("job");
		int manager = Integer.parseInt(request.getParameter("manager"));
		String hireDate = request.getParameter("hiredate");
		double salary  = Double.parseDouble(request.getParameter("salary"));
		double commission  = Double.parseDouble(request.getParameter("commission"));
		int deptNo = Integer.parseInt(request.getParameter("deptno"));
		
		Employee tempEmployee = new Employee(empNo, eName, job, manager, hireDate, salary, commission, deptNo);
		employeeDBUtil.addEmployee(tempEmployee);
		listEmployee(request, response);
		

		
}


	private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> employees = employeeDBUtil.getEmployee();
		
		request.setAttribute("employeeList", employees);
		
//		System.out.println(employees);//Outputs on console
//		System.out.println(employees.isEmpty());//Outputs on console

		RequestDispatcher dispatcher = request.getRequestDispatcher("view-employee.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
