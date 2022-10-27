package com.aurionpro.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructordetails")
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "linkedin")
	String linkedin;

	@Column(name = "github")
	String github;

	@OneToOne(mappedBy = "instructorDetails", cascade = CascadeType.ALL)
	private Instructor instructor;

	public InstructorDetails() {
		super();
	}
	
	

	public Instructor getInstructor() {
		return instructor;
	}



	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}



	public InstructorDetails(String linkedin, String github) {
		super();
		this.linkedin = linkedin;
		this.github = github;
	}



	public int getId() {
		return id;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public String getGithub() {
		return github;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public void setGithub(String github) {
		this.github = github;
	}
	
}
