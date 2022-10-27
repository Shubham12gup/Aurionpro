package com.aurionpro.model;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/";
	static final String USER = "root";
	static final String PASS = "MySQL@13";

	static Connection conn;

	public static void main(String[] args) {

		try {

//			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			Statement statement = conn.createStatement();

			String query;

//			query = "CREATE DATABASE MyDatabase;";
//			statement.execute(query);
//			System.out.println("Database Created.........");

			query = " USE MyDatabase;";
			statement.execute(query);
			System.out.println("Using Database MyDatabase");

			doCreateTable();
			doSelect();

			doInsert();
			doSelect();

			doUpdate();
			doSelect();

			doDelete();
			doSelect();

			doDrop();

//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void doCreateTable() {
		System.out.println("Creating Table........");
		String query;
		Statement statement;
		try {
			statement = conn.createStatement();
			query = "CREATE TABLE STUDENT " + "(id INTEGER not NULL, " + "first_Name VARCHAR(255), "
					+ "last_Name VARCHAR(255), " + "age INTEGER, PRIMARY KEY ( id ));";
			statement.execute(query);
			System.out.println("Table Created.........\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void doSelect() {
		System.out.println("Displaying Table..........");
		String query;
		Statement statement;

		try {
			statement = conn.createStatement();
			query = "SELECT * FROM STUDENT;";
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first_Name = rs.getString("first_Name");
				String last_Name = rs.getString("last_Name");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", First: " + first_Name);
				System.out.print(", Last: " + last_Name);
				System.out.println(", Age: " + age);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void doInsert() {
		System.out.println("Inserting values.........");
		String query;
		Statement statement;
		
		query = "INSERT INTO STUDENT VALUES (?, ?, ?, ?);";
		try {
			statement = conn.createStatement();
			query = " INSERT INTO STUDENT (id, first_Name, last_Name, age) " + "VALUES "
					+ "('101', 'Shubh', 'Gupta', 21), " + "('102', 'Rahul', 'Tambe', 20), "
					+ "('103', 'Sohan', 'Kamble', 21), " + "('104', 'Ashish', 'Kokane', 22);";
			statement.executeUpdate(query);
			
			PreparedStatement preparedStmt = conn.prepareStatement("INSERT INTO STUDENT VALUES (?, ?, ?, ?);");
			preparedStmt.setString(1, "105");
			preparedStmt.setString(2, "Harshal");
			preparedStmt.setString(3, "Ghule");
			preparedStmt.setInt(4, 23);
			preparedStmt.execute();
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Values Inserted...........\n");

	}

	public static void doDelete() {
		String query;
		Statement statement;

		try {
			statement = conn.createStatement();
			query = "DELETE FROM STUDENT WHERE id = 101;";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nDeleted record.........");

	}

	public static void doUpdate() {
		String query;
		Statement statement;

		try {
			statement = conn.createStatement();
			query = "UPDATE STUDENT " + "SET first_Name = 'Ritesh' " + "WHERE id = 104;";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nUpdated record.......");
	}

	public static void doDrop() {
		String query;
		Statement statement;

		try {
			statement = conn.createStatement();
			query = "DROP TABLE student;";
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nTable Deleted.......");
	}

}
