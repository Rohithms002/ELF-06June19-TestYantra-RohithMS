package com.tyss.javaapp.calculator;

public class BasicCalculator {

	public void add(int a, int b) {

		int sum = a + b;
		System.out.println("sum=" + sum);
	}

	public void sub(int a, int b) {

		int sub = a - b;
		System.out.println("sub=" + sub);
	}

	public void multiply(int a, int b) {

		int product = a * b;
		System.out.println("product=" + product);
	}

	public void divide(int a, int b) {

		int quotient = a / b;
		System.out.println("quot=" + quotient);
	}

	public static void main(String[] args) {

		BasicCalculator calc = new BasicCalculator();
		calc.add(10, 20);
		calc.sub(20, 10);
		calc.multiply(10, 20);
		calc.divide(20, 2);
	}

}
