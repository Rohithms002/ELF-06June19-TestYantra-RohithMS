package com.tyss.javaapp.java8;

public class AddTwoNumber {

	
	static int add(int a , int b) {
		
	return a+b;
	}
	
	double factorial(int x) {
		double fact = x;
		for(int i=x-1; i>=1; i--) {
		fact= fact*i;
			
		}
		return fact;
	}
	
	public static void main(String[] args) {
		/*
		 * AddTwoNumberInterface a = AddTwoNumber :: add; int b=a.add(20, 30);
		 * System.out.println(b);
		 */
		
		AddTwoNumberInterface a = new AddTwoNumber():: factorial;
		System.out.println(a.factorial(5));
	}
	
}
