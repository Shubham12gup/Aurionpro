package com.aurionpro.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	
	
	
//	static class TestStatic {
//		
//		static void display() {
//			System.out.println("Inner class");
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		
//		TestStatic st = new TestStatic();
//		st.display();
//		
//		TestStatic.display();
//	}
	
	public static void main(String[] args) {
		
		
		String s="ABC";
		s= "123";
		
		s = new String(s);
		System.out.println(s);
		
		int arr[] = {1, 2, 3, 4};
		List<Integer> list = Arrays.asList(1, 2, 3);
		list.add(4);
		
		List<String> list1 = new ArrayList(0);
		
		System.out.println(list1.size());
		
		
		
        try {
            divide(1,0);
        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("Finally main");
        }
        
        
    }

    private static void divide(int a, int b){
        try{
            int c = a/b;
            System.out.println(c);
        }finally {
            System.out.println("Finally");
        }
    }
    
    
	
}
