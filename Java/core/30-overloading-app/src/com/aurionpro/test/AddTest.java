package com.aurionpro.test;

import com.aurionpro.model.Add;

public class AddTest {

	public static void main(String[] args) {
		Add obj = new Add();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.add(1.5, 2.5));
		System.out.println(obj.add(1.5, 2.5, 3.5));
	}
}
