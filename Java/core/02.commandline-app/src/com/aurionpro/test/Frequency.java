package com.aurionpro.test;

import java.util.Arrays;

public class Frequency {

	public static void main(String[] args) {
		//int[] arr = new int[args.length];
		int[] arr = {5, 8, 5, 7, 8, 10};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++)
        {
            int count = 1;

            // Move the index ahead whenever
            // you encounter duplicates
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }

            System.out.println(arr[i] + ": " + count);
            
        }	

	}

}
