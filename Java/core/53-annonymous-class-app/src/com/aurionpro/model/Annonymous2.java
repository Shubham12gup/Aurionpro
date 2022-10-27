package com.aurionpro.model;

//Using Interface
interface ParentAnnonymous{
	void show();
}
public class Annonymous2 {
	
	static ParentAnnonymous annonym = new ParentAnnonymous() {
		public void show(){
			System.out.println("I am in annonymous class");
		}
	};
	
	public static void main(String[] args) {
		annonym.show();
	}
}
