package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/JdbcTest")
public class JdbcTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public JdbcTest() {
        super();
    }
    
    @Resource(name="jdbc/student")
	private DataSource datasource;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			conn = datasource.getConnection();
			String sql = "select * from student;";
			stmt = conn.createStatement();
			result = stmt.executeQuery(sql);
			
			while(result.next()) {

				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				String email = result.getString("email");
				
				out.println("First Name: "+firstName);
				out.println("Last Name: "+lastName);
				out.println("Email: "+email);
				out.print("<br>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
