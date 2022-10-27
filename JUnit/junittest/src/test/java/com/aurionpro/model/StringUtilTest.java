package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
	
	StringUtil util;
	
	@BeforeEach
	void beforeEach() {
		util = new StringUtil();
		System.out.println("Printing before each.");
	}

	@Test
	void testTruncateAInFirst2Place_CharAAtFirstPosition() {
		String expected = "BC";
		String actual = util.truncateAInFirst2Place("ABC");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTruncateAInFirst2Place_CharAAtSecondPosition() {
		String expected = "BCD";
		String actual = util.truncateAInFirst2Place("BACD");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTruncateAInFirst2Place_CharAAAtFirst2Position() {
		String expected = "BC";
		String actual = util.truncateAInFirst2Place("AABC");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFisrtAndLast2CharAreEqual_checkBothEqual() {
		boolean expected = true;
		boolean actual = util.fisrtAndLast2CharAreEqual("ABCDAB");
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testFisrtAndLast2CharAreEqual_checkBothNotEqual() {
		boolean expected = false;
		boolean actual = util.fisrtAndLast2CharAreEqual("ABCDAD");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFisrtAndLast2CharAreEqual_checkBothEqual2() {
		boolean expected = true;
		boolean actual = util.fisrtAndLast2CharAreEqual("ABAB");
		assertEquals(expected, actual);
	}
	
}
