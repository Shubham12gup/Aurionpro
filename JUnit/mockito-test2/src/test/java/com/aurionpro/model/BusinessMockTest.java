package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.given;  


import org.junit.jupiter.api.Test;

public class BusinessMockTest {

	@Test
	public void deleteTodosusing_BDD() {

		// Given
		IServices todoService = mock(IServices.class);

		List<String> combinedlist = Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate",
				"Use Spring MVC");

//		given(todoService.getTodos()).willReturn(combinedlist);
		when(todoService.getTodos()).thenReturn(combinedlist);

		Business business = new Business(todoService);

		// When
		business.deleteTodosNotRelatedToHibernate();

		// Then
		verify(todoService).deleteTodos("Use Spring MVC");
	}
}
