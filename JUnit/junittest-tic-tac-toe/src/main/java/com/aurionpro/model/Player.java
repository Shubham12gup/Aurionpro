package com.aurionpro.model;

public class Player {
	private String name;

	private MarkType mark;

	public Player(String name) {
		super();
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		this.mark = mark;
	}

}
