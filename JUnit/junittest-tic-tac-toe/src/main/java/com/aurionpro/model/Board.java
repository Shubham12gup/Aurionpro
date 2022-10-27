package com.aurionpro.model;

import java.util.Arrays;

public class Board {

	private Cell[] cells = new Cell[9];

	public Board() {
		Cell c = new Cell();

		for (int i = 0; i < 9; i++) {

			cells[i] = new Cell();

		}
	}

	public Cell[] getCells() {
		return cells;
	}

	public void setCellMark(int loc, MarkType mark)  {

		if (loc > 8 || loc <0) {
			throw new InvalidCellLocation("No such location is present in board");
		}

		cells[loc].setMark(mark);

	}

	boolean isBoardFull() {

		int count = 0;
		for (int i = 0; i < 9; i++) {
			if (cells[i].getMark() == MarkType.EMPTY ) {
				return false;

			}
		}

		return true;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cells);
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
		Board other = (Board) obj;
		if (!Arrays.equals(cells, other.cells))
			return false;
		return true;
	}

}
