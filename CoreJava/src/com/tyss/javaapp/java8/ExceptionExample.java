package com.tyss.javaapp.java8;

public class ExceptionExample {

	
	public static void main(String[] args) {
		
		try {
			
			
		}catch(ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
