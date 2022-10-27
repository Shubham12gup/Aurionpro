package com.aurionpro.test;

import com.aurionpro.model.AddOperation;
import com.aurionpro.model.MultiplyOperation;
import com.aurionpro.model.StrategyOperation;
import com.aurionpro.model.SubtractOperation;

public class StrategyTest {

	public static void main(String[] args) {
		StrategyOperation op = new StrategyOperation(new AddOperation());
		int add = op.doOperation(10, 20);
		System.out.println("Addition: " + add);

		op.setOperation(new SubtractOperation());
		int sub = op.doOperation(30, 10);
		System.out.println("Subtraction: " + sub);
		
		op.setOperation(new MultiplyOperation());
		int mul = op.doOperation(30, 10);
		System.out.println("Subtraction: " + mul);

	}

}
