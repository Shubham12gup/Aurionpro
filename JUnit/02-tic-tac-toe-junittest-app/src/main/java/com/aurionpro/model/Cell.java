package com.aurionpro.model;

public class Cell {
	
	MarkType mark;

	public Cell() {
		this.mark = MarkType.EMPTY;
	}
	
	public boolean isCellEmpty() {
		if (mark == MarkType.EMPTY)
			return true;
		return false;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) throws CellAlreadyMarkedException {
		if (isCellEmpty())
			this.mark = mark;
		else
			throw new CellAlreadyMarkedException("Cell is already marked");
	}
	
}
