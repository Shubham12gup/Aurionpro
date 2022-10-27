package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AuthenticateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
//		out.print("heloo");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String country = request.getParameter("country");
		String gender = request.getParameter("gender");
		String[] languages = request.getParameterValues("lang");
		
		out.print("First name: " +fname+ "<br>");
		out.print("Last name: " +lname+ "<br>");
		out.print("Gender : " +gender+ "<br>");
		out.print("Country: " +country+ "<br>");
		out.print("Lang: <br>");
		
		for(String lang:languages) {
			out.print(lang+"<br>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
