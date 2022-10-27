package com.aurionpro.test;

public class UpdateMarks {
	
	public static void UpdateMarksToZero(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
			System.out.print(marks[i]+ " ");
		}
	}
	public static void main(StringCheck[] args) {
		int marks[] = {50, 60, 70, 50, 80};
		System.out.println("Marks before Change");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]+ " ");
		}
		System.out.println("\n");
		System.out.println("Marks After Change");

		UpdateMarksToZero(marks);
		
	}
	
	

}
