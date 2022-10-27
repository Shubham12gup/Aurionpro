package com.aurionpro.model;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		
		StringTokenizer tokenizer1 = new StringTokenizer("The, sun is x10 times larger than earth");
		System.out.println("Number of tokens: " + tokenizer1.countTokens());
		while (tokenizer1.hasMoreElements()) {
			System.out.println(tokenizer1.nextToken());
		}
		System.out.println("---------------------------------------------------------");

		StringTokenizer tokenizer2 = new StringTokenizer("The, sun is x10 times larger than earth", ",");
		System.out.println("Number of tokens: " + tokenizer2.countTokens());

		while (tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextElement());
		}
		System.out.println("---------------------------------------------------------");

		StringTokenizer tokenizer3 = new StringTokenizer("The, sun is x10 times, larger than earth", ",", true);
		// , acts as a separator and considers it as a token also.
		System.out.println("Number of tokens: " + tokenizer3.countTokens());

		while (tokenizer3.hasMoreTokens()) {
			System.out.println(tokenizer3.nextElement());
		}
		System.out.println("---------------------------------------------------------");
		
		StringTokenizer tokenizer4 = new StringTokenizer("The, sun is x10 times, larger than earth", ",", false);
		// , acts as a separator and not considers as a token
		System.out.println("Number of tokens: " + tokenizer4.countTokens());

		while (tokenizer4.hasMoreTokens()) {
			System.out.println(tokenizer4.nextElement());
		}
		System.out.println("---------------------------------------------------------");

	}

}
