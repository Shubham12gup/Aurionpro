package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SessionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
//		System.out.println("Shubham");//SYSO Outputs on console
		PrintWriter out = response.getWriter();
		out.print("<h1>Hello World</h1>");
		
		HttpSession session = request.getSession();
		if(session.getAttribute("counter")==null){
			session.setAttribute("counter", 0);
		}
		int count = (Integer) session.getAttribute("counter");
	
		int oldValue = (Integer) session.getAttribute("counter");
		
		session.setAttribute("counter", ++count);
		int newValue = (Integer) session.getAttribute("counter");
		
		out.print("Old Value: " +oldValue);
		out.print("<br>");
		out.print("New Value: " +newValue);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
