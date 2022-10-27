package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class InterfaceTest {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(man);
		atTheMovies(man);
		System.out.println("----------------------");
		atTheParty(boy);
//		atTheMovies(boy); Cannot take boy object as it doesn't implements IEmotionable.
	}

	private static void atTheMovies(IEmotionable person) {
		person.cry();
		person.laugh();
	}

	private static void atTheParty(IMannerable person) {
		person.greet();
		person.depart();
	}

	
	
}
