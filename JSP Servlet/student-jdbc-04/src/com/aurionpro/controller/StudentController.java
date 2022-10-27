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

import com.aurionpro.model.Student;
import com.aurionpro.model.StudentDBUtil;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentController() {
        super();
    }

    @Resource(name="jdbc/student")
	private DataSource dataSource;
    
    private StudentDBUtil studentDBUtil;
	
	@Override
	public void init() throws ServletException {
		super.init();
		studentDBUtil = new StudentDBUtil(dataSource);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command = request.getParameter("command");
		System.out.println(command);
		
		if(command == null) {
			command = "list";
		}
		
		switch(command) {
			case "load":
				loadStudent(request, response);
				break;
			case "update":
				updateStudent(request, response);
				break;
			case "list":
				listStudents(request, response);
				break;
			case "delete":
				deleteStudent(request, response);
				break;
			case "search":
				searchStudents(request, response);
				break;
			default:
				listStudents(request, response);
				
		}
		listStudents(request, response);
		
	}


	private void searchStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("search");
		if(name=="") {
			listStudents(request, response);
		}
		List<Student> students = studentDBUtil.searchStudent(name);
		if(students.isEmpty()) {
			request.setAttribute("studentList", null);
		} else {
			request.setAttribute("studentList", students);
			System.out.println("Searched students:" +students);//Outputs on console
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("view-student.jsp");
		dispatcher.forward(request, response);
	}


	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("studentId"));
//		Student student = studentDBUtil.getStudent(id);
		studentDBUtil.deleteStudent(id);
		listStudents(request, response);

	}


	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("studentId"));
		Student student = studentDBUtil.getStudent(id);
		
		request.setAttribute("studentRecord", student);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-student-form.jsp");
		dispatcher.forward(request, response);
//		System.out.println("Id"+id);
//		System.out.println("Edit Stud"+student);
		
	}


	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		Student tempStudent = new Student(firstName, lastName, email, id);
		studentDBUtil.updateStudent(tempStudent);
		listStudents(request, response);
	}


	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		
		Student tempStudent = new Student(firstName, lastName, email);
		studentDBUtil.addStudent(tempStudent);
		
		response.sendRedirect(request.getContextPath()+"/StudentController?command=list");
//		listStudents(request, response);

		
		
	}


	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Student> students = studentDBUtil.getStudent();
		
		request.setAttribute("studentList", students);
		
		System.out.println(students);//Outputs on console
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("view-student.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");		
	
		switch(command) {
			case "add":
				addStudent(request, response);
				break;
			default:
				listStudents(request, response);
		}
	}

}
