package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcTest {
	
	
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/webstudent?useSSL=false";
		String user = "webstudent";
		String password = "webstudent";
		
		
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
