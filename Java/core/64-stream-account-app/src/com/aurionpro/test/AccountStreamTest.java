package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Account;

public class AccountStreamTest {

	public static void main(String[] args) {
		Account[] account = {
			new Account(101, "Shubh", 50000),
			new Account(102, "Ashish", 40000),
			new Account(103, "Sagar", 30000),
			new Account(104, "Rahul", 20000),
			new Account(105, "Reena", 10000),
			new Account(106, "Ritesh", 5000)
		};
		
		List<Account> list = Arrays.asList(account);
		
		Optional<Account> minList = list.stream().min(Comparator.comparingDouble(a->a.getBalance()));
		minList.ifPresent(System.out::println);
		System.out.println("---------------------------------");
		
		list.stream().max(Comparator.comparingDouble(a->a.getBalance())).ifPresent(System.out::println);
		System.out.println("---------------------------------");

		list.stream().filter(n -> n.getName().length()>=6).forEach(x->System.out.println(x));
		System.out.println("---------------------------------");
		
		double sum = list.stream().mapToDouble(a->a.getBalance()).sum();
		System.out.println("Total sum = " +sum);
	}

}
