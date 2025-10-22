package com.aurionpro.test;
import java.util.LinkedList;

//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class TestInterview {
//	
//	
//	static void print(Integer i) {
//		System.out.println("In long");
//		System.out.println(i); 
//	 }
//	
//	static void print(int i) {
//		System.out.println("In int");
//		System.out.println(i); 
//	 }
//	
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		 int[] arr = {2,5,2,7,9,2};
//				 
//		Arrays.sort(arr);
//				 
//				 Map<Integer, Integer> map = new HashMap();
////				 for(int i=0; i<arr.length; i++){
//					 for(int a: arr){
////					map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//					map.put(a, map.getOrDefault(a, 0)+1);
//				 }
//				 
//				 System.out.println(map.entrySet());
//				 for(Map.Entry entry: map.entrySet()){
//					
//					int val = (int) entry.getValue();
//					if(val > 1)
//						System.out.println(entry.getKey());
//				 }
//				 
//				 
//	print(0);			 
//				 
//	}
//
//}



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class TestInterview {
	
	
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int firstNum = 0;
        int secondNum = 0;
        int sum = 0;
        String num1 = "", num2 = "";
        while(l1 != null){
            num1 = num1 + l1.val;
            l1 = l1.next;
        }
        
        while(l2 != null){
            num2 = num2 + l2.val;
            l2 = l2.next;
        }

        firstNum = Integer.parseInt(num1);
        secondNum = Integer.parseInt(num2);
        System.out.println(firstNum);
        System.out.println(secondNum);
        sum = firstNum + secondNum;
        System.out.println(sum);

        System.out.println(String.valueOf(sum).toCharArray());
        
        ListNode res = null;
        for(char s: String.valueOf(sum).toCharArray()){
            ListNode node = new ListNode((int) s);
            if(res == null)
                res = node;
            else
                res.next = node;
        }

        return res;

    }
    
    
    private static int nCr(int n, int r) {
        if (r > n) return 0;
        r = Math.min(r, n - r); // Symmetry property
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return (int) res;
    }
    
    public static void main(String[] args) {
		
    	ListNode ll1= new ListNode(2);
    	ll1.next = new ListNode(4);
    	ll1.next.next = new ListNode(3);
    	
    	ListNode ll2= new ListNode(5);
    	ll2.next = new ListNode(6);
    	ll2.next.next = new ListNode(4);
    	
    	int sum = 123;
    	StringBuilder str = new StringBuilder(String.valueOf(sum)); 
    	StringBuilder out = str.reverse();
//    	out.
    	System.out.println("hahs" + out.toString());
    	
    	System.out.println(addTwoNumbers(ll1, ll2));
    	
    	
    	
    	System.out.println(nCr(4, 3));
    	System.out.println(1 << 5);
    	
	}
}