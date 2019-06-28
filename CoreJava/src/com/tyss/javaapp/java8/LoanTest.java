package com.tyss.javaapp.java8;

public class LoanTest {

	public static void main(String[] args) {
		
		Loan l = Loan.HOME;
		int constantValue =l.getValues();
		System.out.println("" + constantValue);
		
		String s= "apple";
		
		switch(s) {
		case "apple": System.out.println("hi apple");
		break;
		
		case "cat" : System.out.println("hi cat");
		break;
		
		default:
			System.out.println("no values");
		}
	}
}
