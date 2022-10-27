package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)  // if removed all test cases passes, creates new instance every time.
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)

public class CellTest {

	Cell cell;
	@BeforeEach
	void test() {
		 cell= new Cell();
	}
	
	
	@Test
	@Order(1)
	@DisplayName("Created cell is Empty")
	void testCreatedCellisEmpty() {		
		boolean Expected = true;
		boolean Actual =cell.isCellEmpty();
		assertTrue(Expected==Actual);		
	}
		
	@Order(2)
	@Test
	@DisplayName("check if can mark O")
	void testSetMark_checkIfCanMarkO() throws Exception {		
		MarkType Expected = MarkType.O;
		cell.setMark(MarkType.O);
		MarkType Actual = cell.getMark();
		assertTrue(Expected==Actual);

	}

	@Order(3)
	@Test
	@DisplayName("check if can mark X")
	void testSetMark_checkIfCanMarkX() throws Exception {		
		MarkType Expected = MarkType.X;
		cell.setMark(MarkType.X);
		MarkType Actual = cell.getMark();
		assertTrue(Expected==Actual);

	}


	@Order(4)
	@Test()
	@DisplayName("already marked exception twice")
	void testSetMark_throwscellAlreadyMarkedExceptioWhenMarkedTwice() throws Exception {		


cell.setMark(MarkType.X);


	Exception exception = assertThrows(cellAlreadyMarkedException.class, ()->cell.setMark(MarkType.O));
	
	String ActualMessage = exception.getMessage();
	String ExpectedMessage = "cell is already marked";   // if changed expected msg test fails
	
    assertTrue(ActualMessage.contains(ExpectedMessage));
		
	}

	
	
	
	
	
}
