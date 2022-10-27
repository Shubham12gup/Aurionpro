package com.aurionpro.model;

import java.util.ArrayList;

public class Region {
	int id;
	String regionName;
	
	//	ArrayList<String> region = new ArrayList<String>();
	public int getId() {
		return id;
	}
	public String getRegionName() {
		return regionName;
	}
	public Region(int id, String regionName) {
		super();
		this.id = id;
		this.regionName = regionName;
	}
	public Region() {
	}
	
	
	@Override
	public String toString() {
		return "Region [id=" + id + ", regionName=" + regionName + "]";
	}
	
}
