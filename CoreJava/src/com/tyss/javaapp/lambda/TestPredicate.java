package com.tyss.javaapp.lambda;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a-> a%2==0;
		boolean b= p.test(21);
		System.out.println(b);
	}
}
