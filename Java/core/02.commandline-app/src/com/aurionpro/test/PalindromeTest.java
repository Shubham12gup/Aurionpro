package com.aurionpro.test;

public class PalindromeTest {

	public static void main(String[] args) {
		
		System.out.println("Palindrome Test");

		int num = 12212;
//		String name = String.valueOf(num);
		String name= "MADADAM";
		System.out.println(name);
		boolean pal = true;

		System.out.println(name.length() / 2);
		for (int i = 0; i < name.length() / 2; i++) {
			if (!(name.charAt(i) == name.charAt(name.length() - 1 - i))) {
				pal = false;
				break;
			}
		}

		if (pal)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

		System.out.println("===============================================================");
		String s= "NITINAM";
		StringBuilder str = new StringBuilder(s);
		
//		Integer index = str.reverse().lastIndexOf("MA");
//		System.out.println(index);
		String revStr = str.reverse().toString();
		System.out.println(revStr);
		
		if(s.equals(revStr))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}