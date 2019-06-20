package com.tyss.javaapp.lambda;

interface Sum {

	int add(int a, int b);
}

public class LambdaExample {
	public static void main(String[] args) {

		Sum s = (a, b) -> a + b;
		int i = s.add(10, 2);
		System.out.println(i);

	}
}
