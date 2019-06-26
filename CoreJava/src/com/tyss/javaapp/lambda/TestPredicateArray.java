package com.tyss.javaapp.lambda;

import java.util.function.Predicate;

public class TestPredicateArray {

	public static void main(String[] args) {
		boolean c = false;
		int [] b = {2,5,9,6,4,3};
		Predicate<Integer> p = a-> a>4;
		for(int i=0;i<6;i++) {
		c= p.test(b[i]);
		if(c) {
			System.out.println(b[i]);
		}
		
		}
		
	}
}

