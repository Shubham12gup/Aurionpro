package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BoardTest {

	Board board;

	@BeforeEach
	void test() {
		board = new Board();

	}

	@Test
	@DisplayName("empty board created all cell empty ")
	void testCreateBoard_allNineCellAreEmplty() {
		boolean expected = true;

		Cell[] cells = board.getCells();

		boolean actual = true;

		for (Cell c : cells) {
			if (c.getMark() != MarkType.EMPTY)
				actual = false;

		}
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("mark at specific location")
	void testsetCellMark_ableToMarkAtSpecificLocation() throws InvalidCellLocation {

		MarkType expected = MarkType.X;
		board.setCellMark(0, MarkType.X);
		Cell[] actual = board.getCells();

		assertEquals(expected, actual[0].getMark());

	}

	@Test
	@DisplayName("All cells are full ")
	void testCreateBoard_allNineCellAreFull() throws InvalidCellLocation {

		for (int i = 0; i < 9; i++) {
			board.setCellMark(i, MarkType.O);
		}

		boolean expected = true;
		boolean actual = board.isBoardFull();
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("mark at invalid location exception")
	void testSetCellMark_throwsInvalidLocationExceptionForInvalidCellLocation() {

		assertThrows(InvalidCellLocation.class, () -> {
			board.setCellMark(20, MarkType.X);
		});
	}

	@Test
	@DisplayName("mark twice at same location exception")
	void testSetCellMark_throwsCellAlreadyMarkedExceptionIfCellMarkedTwice() throws InvalidCellLocation {
		board.setCellMark(0, MarkType.O);
		assertThrows(cellAlreadyMarkedException.class, () -> {
			board.setCellMark(0, MarkType.X);
		});
	}

}