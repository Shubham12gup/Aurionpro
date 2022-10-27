package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {

	Board board;
	ArrayList<Cell> cells;

	@BeforeEach
	public void beforeEach() throws CellAlreadyMarkedException {
		board = new Board();
		cells = board.getCells();
	}

	@Test
	public void testCreateBoard_allNineCellsAreEmpty() throws CellAlreadyMarkedException {
//		ArrayList<Cell> cells = board.getCells();
		boolean flag = true;
		for (Cell cell : cells) {
			if (cell.isCellEmpty()) {
				flag = true;
			} 
			else {
				flag = false;
				break;
			}
		}
		assertTrue(flag);
	}
	
	@Test
	public void testSetCellMark_ableToMarkAtSpecificLocation() throws CellAlreadyMarkedException, InvalidLocationException {
		int loc = 8;
//		ArrayList<Cell> cells = board.getCells();
		if (cells.get(loc).isCellEmpty()) {
			board.setCellMark(loc, MarkType.O);
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
	
	@Test
	public void testSetCellMark_throwsInvalidLocationExceptionForInvalidCellLocation() throws InvalidLocationException {
		int loc = -1;
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> board.setCellMark(loc, MarkType.X));
	}
	
	@Test
	public void testIsBoardFull_checkTrueIsBoardFull() throws CellAlreadyMarkedException {
		for (Cell cell: cells) {
			cell.setMark(MarkType.O);
		}
		boolean full = board.isBoardFull();
		assertTrue(full);
	}
	
	@Test
	public void testSetCellMark_throwsCellAlreadyMarkedExceptionIfCellMarkedTwice() throws CellAlreadyMarkedException, InvalidLocationException {
		board.setCellMark(1, MarkType.O);
		assertThrows(CellAlreadyMarkedException.class, () -> board.setCellMark(1, MarkType.O));
	}
	

}
