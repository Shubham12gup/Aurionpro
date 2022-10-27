package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalcServiceTest {
	
	CalcService calcService;

	@Mock
	AddService addService;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCalc() {
		System.out.println("**--- Test testCalc executed ---**");
		
//		addService = Mockito.mock(AddService.class);
		calcService = new CalcService(addService);

		Mockito.when(addService.add(10, 20)).thenReturn(30);

		int actual = calcService.calc(10, 20);

		assertEquals(30, actual);

	}
}
