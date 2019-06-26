package com.tyss.javaapp.lambda;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		
		Function<Double, Double> f = a-> 3.14*a*a;
		Double result =f.apply(5.0);
		System.out.println(result);
	}
}
