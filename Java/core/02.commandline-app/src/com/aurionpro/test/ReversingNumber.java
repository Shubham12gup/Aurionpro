package com.aurionpro.test;

public class ReversingNumber {

	public static void main(String[] args) {
		
		System.out.println("Reversing no");
//		int num=12321;
		int num=100;
		int ognum=num;
		System.out.println("Num: " +num);
		
//		String numS = Integer.toString(num);
		String numS = String.valueOf(num);
		
		int rev_num = 0; 
		while(num != 0) {
			rev_num = rev_num*10 + num%10;
			num = num / 10;
		}
		
		System.out.println(rev_num);
		System.out.println("------------------------------");
		System.out.println("Plaindrome Number Test");
		System.out.println(ognum);
		
		if (ognum == rev_num)
			System.out.println("Palindrome Number " + ognum);
		else
			System.out.println("Not a Palindrome Number " + ognum);
		
		System.out.println("----------- Reversing a String -----------");
		String str = "Mama";
		str = str.toLowerCase();
		String rev_str = new String();
		char[] rev_char = new char[str.length()];
		
		str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			rev_char[i] = str.charAt(str.length()-1-i);
		}
		
		rev_str = String.copyValueOf(rev_char);
		System.out.println(rev_str);
		
	}

}
