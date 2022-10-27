package com.aurionpro.model;

//Using abstract class and methods.
abstract class SuperAnnonymous {
	abstract void show();
}

public class Annonymous {

	public static void main(String[] args) {
		SuperAnnonymous annonym = new SuperAnnonymous() {

			@Override
			void show() {
				System.out.println("You are in annonymous class");
			}
		};

		annonym.show();
	}

}
