package com.tyss.javaapp.java8;

public class BoyTest {

	public static void main(String[] args) {
		
		MyBoy b = Boy :: new;
		Boy b1=b.getBoy("rohith", 5.7, 25);
		b1.displayDetails();
		
	}
}
