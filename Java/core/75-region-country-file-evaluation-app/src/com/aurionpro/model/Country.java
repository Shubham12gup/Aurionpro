package com.aurionpro.model;

public class Country {
	String code;
	String Name;
	int id;
	
	public Country(String code, String name, int id) {
		super();
		this.code = code;
		Name = name;
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return Name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", Name=" + Name + ", id=" + id + "]";
	}
	
	
}
