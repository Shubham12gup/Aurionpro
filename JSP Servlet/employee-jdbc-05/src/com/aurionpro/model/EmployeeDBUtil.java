package com.aurionpro.model;

//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



public class EmployeeDBUtil {
	
	private DataSource dataSource;

	public EmployeeDBUtil(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	
	public List<Employee> getEmployee() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;
		
		List<Employee> employees = new ArrayList<>();
		
		try {
			conn = dataSource.getConnection();
			String sql = "select * from emp;";
			stmt = conn.createStatement();
			result = stmt.executeQuery(sql);
			
			while(result.next()) {
				int empNo = result.getInt("EMPNO");
				String eName = result.getString("ENAME");
				String job = result.getString("JOB");
				int manager = result.getInt("MGR");
				String hireDate = result.getString("HIREDATE");
				double salary = result.getDouble("SAL");
				double commission = result.getDouble("COMM");
				int deptNo = result.getInt("DEPTNO");
				
				employees.add(new Employee(empNo, eName, job, manager, hireDate, salary, commission, deptNo));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return employees;
	}

	public void addEmployee(Employee tempEmployee) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (?,?,?,?,?,?,?,?);";
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, tempEmployee.getEmpNo());
			stmt.setString(2, tempEmployee.geteName());
			stmt.setString(3, tempEmployee.getJob());
			stmt.setInt(4, tempEmployee.getManager());
			stmt.setString(5, tempEmployee.getHireDate());
			stmt.setDouble(6, tempEmployee.getSalary());
			stmt.setDouble(7, tempEmployee.getcommission());
			stmt.setInt(8, tempEmployee.getDeptNo());
			
			stmt.execute();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}
		
	
	}

	private void close(Connection conn, PreparedStatement stmt, ResultSet result) {
		
		try {
			
			if(conn!=null) {
				conn.close();
			} 
			
			if(stmt!=null) {
				stmt.close();
			} 
			
			if(result!=null) {
				result.close();
			} 
			
		}
		catch (SQLException e) {
				e.printStackTrace();
		}
	}

	public Employee getEmployee(int empNo) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		Employee employee = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "select * from emp where EMPNO=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, empNo);
			result = stmt.executeQuery();
			
			if(result.next()) {
				String eName = result.getString("ENAME");
				String job = result.getString("JOB");
				int manager = result.getInt("MGR");
				String hireDate = result.getString("HIREDATE");
				double salary = result.getDouble("SAL");
				double commission = result.getDouble("COMM");
				int deptNo = result.getInt("DEPTNO");
				
				employee  = new Employee(empNo, eName, job, manager, hireDate, salary, commission, deptNo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, stmt, result);
		}
		
		return employee;
	}

	public void updateEmployee(Employee tempEmployee) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "UPDATE EMP SET ENAME=?, JOB=?, MGR=?, HIREDATE=?, SAL=?, COMM=?, DEPTNO=? WHERE EMPNO=?;";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, tempEmployee.geteName());
			stmt.setString(2, tempEmployee.getJob());
			stmt.setInt(3, tempEmployee.getManager());
			stmt.setString(4, tempEmployee.getHireDate());
			stmt.setDouble(5, tempEmployee.getSalary());
			stmt.setDouble(6, tempEmployee.getcommission());
			stmt.setInt(7, tempEmployee.getDeptNo());
			stmt.setInt(8, tempEmployee.getEmpNo());
			
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			close(conn, stmt, null);
		}
		
	}

	public void deleteEmployee(int empNo) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "DELETE FROM EMP WHERE EMPNO=?;";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, empNo);
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}
		
	}
	
	
}
