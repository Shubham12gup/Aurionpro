package com.aurionpro.test;

public class Fibonnaci {
	
	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		
		int val = 0;
		for (int i=0; i<n; i++) {
			val = fib(n-1) + fib(n-2);
		}
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a = 0, b=1;
		for (int i=0; i<n; i++) {
			if(i==0 || i==1)
				System.out.println((i+1) + " : \t" + i);
			else {
				System.out.println((i+1) + " : \t"  + (a+b));
				b=a+b;
				a=b-a;
//				if((a+b) > n)
//					break;
			}
		}

		System.out.println(" =========================================== ");
		for (int i=0; i<n; i++) {
			System.out.print(fib(i) + " ");
		}
	}
}
