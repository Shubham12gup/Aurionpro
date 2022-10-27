package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CellTest {

	Cell cell;

	@BeforeEach
	public void beforeEach() {
		cell = new Cell();
	}
	
	@Test
	public void testCreatedCellIsEmpty() {
		boolean expected = true;
		boolean actual = cell.isCellEmpty();
		assertTrue(actual == expected);
	}
	
	
	@Test
	public void testSetMark_checkIfCanMarkX() throws CellAlreadyMarkedException {
		MarkType expected = MarkType.X;
		cell.setMark(MarkType.X);
		MarkType actual = cell.getMark();
		assertTrue(actual == expected);
	}
	
	@Test
	public void testSetMark_checkIfCanMarkO() throws CellAlreadyMarkedException {
		MarkType expected = MarkType.O;
		cell.setMark(MarkType.O);
		MarkType actual = cell.getMark();
		assertTrue(actual == expected);
	}
	
	@Test
	@DisplayName("Check Cell Already Marked")
	public void testSetMark_throwsCellAlreadyMarkedExceptionWhenMarkedTwice() throws CellAlreadyMarkedException  {
		cell.setMark(MarkType.X);
//		String expected = "Cell is already marked";
//		CellAlreadyMarkedException exc = assertThrows(CellAlreadyMarkedException.class, () -> cell.setMark(MarkType.X));
//		String actual = exc.getMessage();
//		assertTrue(actual == expected);
		assertThrows(CellAlreadyMarkedException.class, () -> cell.setMark(MarkType.X));
	}
	
}
