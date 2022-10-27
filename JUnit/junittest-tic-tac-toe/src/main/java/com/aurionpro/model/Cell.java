package com.aurionpro.model;

public class Cell {

	private MarkType mark;

	public Cell() {
		super();
		this.mark = MarkType.EMPTY;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		if (isCellEmpty()) {
			this.mark = mark;

		}

		else {

			throw new cellAlreadyMarkedException("cell is already marked");
		}

	}

	public boolean isCellEmpty() {

		if (mark == MarkType.EMPTY) {
		
			return true;
		}
		
		return false;

		
	

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (mark != other.mark)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
