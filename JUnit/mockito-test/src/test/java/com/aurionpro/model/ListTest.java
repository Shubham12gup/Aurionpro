package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {

	@Test
	public void testList_ReturnsSingle_value() {
		
//		mocking a List class
		List mocklist = mock(List.class);
		when(mocklist.size()).thenReturn(1);

		assertEquals(1, mocklist.size());
		assertEquals(1, mocklist.size());

		System.out.println(mocklist.size());
		System.out.println(mocklist);
		
//		multiple return values of a List
		when(mocklist.size()).thenReturn(2).thenReturn(3);

		assertEquals(2, mocklist.size());
		assertEquals(3, mocklist.size());


		
	}
}
