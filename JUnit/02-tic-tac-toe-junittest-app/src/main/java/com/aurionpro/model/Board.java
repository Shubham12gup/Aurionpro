package com.aurionpro.model;

import java.util.ArrayList;

public class Board {

	private ArrayList<Cell> cells;

	public Board() throws CellAlreadyMarkedException {
		cells = new ArrayList<Cell>(9);
		for (int i=0; i<9; i++) {
			cells.add(new Cell());
		}
	}

	public boolean isBoardFull() {
		for (Cell cell : cells) {
			if (cell.isCellEmpty()) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<Cell> getCells() {
		return cells;
	}
	
	public MarkType getCellMark(int loc) {
		return cells.get(loc).getMark();
	}

	public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException, InvalidLocationException {
		cells.get(loc).setMark(mark);
	}

}
