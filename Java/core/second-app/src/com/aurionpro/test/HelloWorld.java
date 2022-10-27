package com.aurionpro.test;

//public class HelloWorld {
//
//	public static void main(String[] args) {
//		System.out.println("Hello World");
//
//	}
//}
import java.util.*;
import java.io.*;
import java.lang.Math;

public class HelloWorld {
	public static int cubeSquare(int T, int N) {
		//this is default OUTPUT. You can change it.
		int result = 0;
		for (int i = 1; i <= N; i++) {
			int num = (int) Math.sqrt(i);
			if ((num * num) == i) {
				result++;
			} else {
				int cub = (int) Math.cbrt(i);
				if ((cub * cub * cub) == i) {
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// INPUT [uncomment & modify if required]

		int T = sc.nextInt();
		int[] N = new int[T];

		for (int i = 0; i < T; i++) {
			N[i] = sc.nextInt();
		}

		sc.close();
		for (int i = 0; i < T; i++) {
			System.out.println(cubeSquare(T, N[i]));
		}
	}
}