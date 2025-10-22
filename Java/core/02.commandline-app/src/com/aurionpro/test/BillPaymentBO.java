package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class BillPaymentBO implements Comparable<BillPaymentBO> {
    private Date paymentDate;
    private double amount;

    public BillPaymentBO(Date paymentDate, double amount) {
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    //Using Comparable
    @Override
    public int compareTo(BillPaymentBO other) {
        
    	// First compare by date (ascending)
        int dateCompare = this.paymentDate.compareTo(other.paymentDate);

        if (dateCompare != 0) {
            return dateCompare;
        }

        // If same date, compare amount (descending)
        return Double.compare( this.amount, other.amount);
    }

    @Override
    public String toString() {
        return "BillPaymentBO{" +
                "paymentDate=" + paymentDate +
                ", amount=" + amount +
                '}';
    }
    
    public static void sortUsingComparator(List<BillPaymentBO> list) {

        // Sort using Comparator — date ASC, amount DESC
        Comparator<BillPaymentBO> comparator = new Comparator<BillPaymentBO>() {
            @Override
            public int compare(BillPaymentBO o1, BillPaymentBO o2) {
                int dateCompare = o1.getPaymentDate().compareTo(o2.getPaymentDate());
                if (dateCompare != 0) {
                    return dateCompare; // ascending by date
                }
                return Double.compare(o2.getAmount(), o1.getAmount()); // descending by amount
            }
        };

        Collections.sort(list, comparator);
        list.forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        List<BillPaymentBO> list = new ArrayList<>();
        list.add(new BillPaymentBO(new Date(2025 - 1900, 10 - 1, 5), 200.0));
        list.add(new BillPaymentBO(new Date(2025 - 1900, 10 - 1, 5), 500.0));
        list.add(new BillPaymentBO(new Date(2025 - 1900, 9 - 1, 25), 100.0));
        list.add(new BillPaymentBO(new Date(2025 - 1900, 9 - 1, 25), 500.0));

        // Sort using Comparable
        Collections.sort(list);
        list.forEach(System.out::println);
        
        System.out.println("----------------------------------------------------------");
        //Using Comparator
        list.sort(new Comparator<BillPaymentBO>() {

			@Override
			public int compare(BillPaymentBO o1, BillPaymentBO o2) {
				
//				int n = o1.getPaymentDate().compareTo(o2.getPaymentDate());
				
				int n;
//				if(o1.getPaymentDate().after(o2.getPaymentDate())) {
				if(o1.getPaymentDate().getTime() > o2.getPaymentDate().getTime()) {
					n= 1;
//				} else if(o1.getPaymentDate().before(o2.getPaymentDate())) {
				} else if(o1.getPaymentDate().getTime() < o2.getPaymentDate().getTime()) {
					n = -1;
				} else {
					n=0;
				}
				
				if(n!=0)
					return n;
				
				return Double.compare(o2.getAmount(), o1.getAmount());
			}
		});
        
        list.forEach(System.out::println);
//        sortUsingComparator(list);
        
        
    }
}

//public class TestComparable {
//    public static void main(String[] args) {
//        List<BillPaymentBO> list = new ArrayList<>();
//        list.add(new BillPaymentBO(new Date(2025 - 1900, 10 - 1, 5), 200.0));
//        list.add(new BillPaymentBO(new Date(2025 - 1900, 10 - 1, 5), 500.0));
//        list.add(new BillPaymentBO(new Date(2025 - 1900, 9 - 1, 25), 100.0));
//
//        // Sort using Comparable
//        Collections.sort(list);
//
//        list.forEach(System.out::println);
//    }
//}
//
    
