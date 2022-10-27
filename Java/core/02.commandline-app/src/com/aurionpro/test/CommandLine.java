package com.aurionpro.test;

public class CommandLine 
{
	public static void main(String[] args)
	{
		System.out.println("Total number of argument passed is " +args.length);
		int sum = 0;
		for(int i = 0; i<args.length; i++) 
		{	
			sum = sum + Integer.parseInt(args[i]);
		}
	System.out.println("Sum is : " +sum);

	}
}
