package com.aurionpro.model;

import java.util.List;

public class Business {

	public IServices doService;

	public Business(IServices doService) {  
        this.doService = doService;  
    }

	public void deleteTodosNotRelatedToHibernate() {

		List<String> Combinedlist = doService.getTodos();

		for (String todos : Combinedlist) {
			if (!todos.contains("Hibernate")) {
				doService.deleteTodos(todos);
			}
		}
	}
}
