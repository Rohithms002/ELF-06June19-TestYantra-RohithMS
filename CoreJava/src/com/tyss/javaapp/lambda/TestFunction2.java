package com.tyss.javaapp.lambda;

import java.util.function.Function;

public class TestFunction2 {

	public static void main(String[] args) {
		
		Function<String, Integer> f = a-> a.length();
		int i= f.apply("rohith");
		System.out.println(i);
	}
}
