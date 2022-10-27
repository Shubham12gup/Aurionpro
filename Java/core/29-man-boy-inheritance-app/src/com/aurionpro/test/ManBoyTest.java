package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		case1(); // reference and object of same type(parent).
		case2(); // reference and object of same type(child).
		case3(); // reference of parent and object of Child.
//		case4(); // reference of child and object of Parent. (Not allowed)
		case5(); //Polymorphism
		case6();

	}

	private static void case6() {
		Object obj;
		obj = 10;
		System.out.println(obj.getClass());
		obj = 10>2;
		System.out.println(obj.getClass());
		obj = "Shubh";
		System.out.println(obj.getClass());
	}

	private static void case1() {
		Man man = new Man();
		man.read();
		man.play();
	}

	private static void case2() {
		Boy boy = new Boy();
		boy.read();
		boy.play();
	}

	private static void case3() {
		Man kid = new Kid();
		kid.read();
		kid.play();
	}

//	private static void case4() {
//		Infant infant = new Man(); //Error
//		infant.read();
//		infant.play();
//	}

	private static void case5() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
		
	}

	private static void atThePark(Man man) {
		man.play();
	}

}
