package com.tyss.javaapp.lambda;

import java.util.function.Function;

public class TestFunction3 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = a-> a*a;
		Integer i=f.apply(10);
		System.out.println(i);
	}
}
