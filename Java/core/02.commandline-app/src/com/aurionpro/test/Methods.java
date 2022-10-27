package com.aurionpro.test;
import java.util.*;

public class Methods {
	public static int Sum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void average(int arr[]) {
		int sum = Sum(arr);
		double n = arr.length;
		double Average = sum/n;
		System.out.format("Average: %.2f\n", Average);
	}
	
	public static void minimum(int arr[]) {
		Arrays.sort(arr);
		System.out.println("Minimum: " + arr[0]);
	}
	
	public static void maximum(int arr[]) {
		Arrays.sort(arr);
		System.out.println("Maximum: " + arr[arr.length - 1]);
	}
	
	public static void median(int arr[]) {
		double median;
		Arrays.sort(arr);
		if (arr.length % 2 == 0) {
			median = (arr[(arr.length / 2) - 1] + arr[(arr.length / 2)]) / 2.0;
		} 
		else {
			median = arr[(arr.length / 2)];
		}
		System.out.format("Median: %.2f \n\n", median);

	}
	
	public static void frequency(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
			}
			System.out.println(arr[i] + " occurs " + count + " times.");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Sum = " + Sum(arr));
		average(arr);
		minimum(arr);
		maximum(arr);
		median(arr);
		frequency(arr);
	}
}

