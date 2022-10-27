package com.aurionpro.springmvc.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	private String firstName;
	
	@NotNull(message = "Please enter last name")
	@Size(min = 2, message = "Minimum characters should be 2")
	private String lastName;
	
	private int year;
	private String selectedSubject[];
	private String selectedGender;
	
	@NotNull(message = "Enter valid number")
	@Min(value = 0, message = "Enter 0 or more")
	@Max(value = 8, message = "Maximum 8 KTs are allowed")
	private Integer atkt;
	
	@Pattern(regexp = "^([a-zA-Z0-9._]{3,50})([@]{1})([a-z]{5,15})([.]{1})([a-z]{2,6})$", message = "Enter valid email")
	private String email;
	
//	@Pattern(regexp = "^\\d{6}$", message = "Enter valid zipcode") 400 053 is allowed in this regexp
	@Pattern(regexp ="^[1-9][0-9]{5}$", message = "Please enter valid zipcode")
	private String zipcode;

	public Integer getAtkt() {
		return atkt;
	}


	public void setAtkt(Integer atkt) {
		this.atkt = atkt;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	
	private LinkedHashMap<String, String> yearOption;
	private ArrayList<String> subjects;
	private String[] genders = {"Male", "Female"};
	
	public String getSelectedGender() {
		return selectedGender;
	}


	public void setSelectedGender(String selectedGender) {
		this.selectedGender = selectedGender;
	}


	public String[] getGenders() {
		return genders;
	}


	public void setGenders(String[] genders) {
		this.genders = genders;
	}


	public Student() {
		super();
		yearOption = YearOption();
		addSubjects();
	}
	
	
	public void addSubjects() {
		subjects = new ArrayList<String>();
		
		subjects.add("Science");
		subjects.add("History");
		subjects.add("Maths");
		
	}





	public ArrayList<String> getSubjects() {
		return subjects;
	}


	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}


	


	public String[] getSelectedSubject() {
		return selectedSubject;
	}


	public void setSelectedSubject(String[] selectedSubject) {
		this.selectedSubject = selectedSubject;
	}


	private LinkedHashMap<String, String> YearOption() {
		
		yearOption = new LinkedHashMap<String, String>();
		yearOption.put("2020", "2020");
		yearOption.put("2021", "2021");
		yearOption.put("2022", "2022");
		return yearOption;
}


	public LinkedHashMap<String, String> getYearOption() {
		return yearOption;
	}


	public void setYearOption(LinkedHashMap<String, String> yearOption) {
		this.yearOption = yearOption;
	}


	public String getFirstName() {
		return firstName;
	}

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
}
