package com.aurionpro.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aurionpro.springdemo.entity.Student;
import com.aurionpro.springdemo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String getStudentList(Model model) {
		List<Student> students = studentService.getStudents();
		model.addAttribute("theStudent", students);
		return "list-student";
	}
	
	@RequestMapping("/showForm")
	public String addStudentForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("theStudent", student);
		return "show-add-form";
	}
	
	@RequestMapping("/add")
	public String addStudentDetails(@ModelAttribute("theStudent") Student student) {
		studentService.addStudent(student);
		System.out.println(student);
		return "redirect:/student/list";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdateForm(@RequestParam("studentId") int id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("theStudent", student);
		return "show-add-form";
	}
	
//	@RequestMapping("/delete")
//	public String deleteStudent(@ModelAttribute("theStudent") Student student) {
//		System.out.println(student);
//		studentService.deleteStudent(student);
//		return "redirect:/student/list";
//	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int id, Model model) {
		Student student = studentService.getStudentById(id);
		System.out.println(student);
		studentService.deleteStudent(student);
		return "redirect:/student/list";
	}
	
	
}
