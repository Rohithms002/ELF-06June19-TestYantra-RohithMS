package com.tyss.javaapp.java8;

public enum Loan {

	HOME(100), PERSONAL(200), CAR(300);
	
	private int values;
	private Loan(int values) {
		this.values = values;
	}
	
	public int getValues() {
		return values;
	}
}
