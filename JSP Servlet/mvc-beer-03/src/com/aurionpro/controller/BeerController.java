package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.model.BeerExpert;

@WebServlet("/BeerController")
public class BeerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public BeerController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String color = request.getParameter("color");
		out.print("Got beer color: " +color);
		
		List<String> beerBrands = new BeerExpert().getBrands(color);
		request.setAttribute("brands", beerBrands);
		request.setAttribute("col", color);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
