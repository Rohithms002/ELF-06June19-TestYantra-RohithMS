package com.tyss.javaapp.java8;

public interface ProductTest {

	public static void main(String[] args) {
		
		MyProduct p = Product :: new;
		Product p1=p.getProduct("mobile", 1850.5);
		System.out.println(p1);
	}
}
