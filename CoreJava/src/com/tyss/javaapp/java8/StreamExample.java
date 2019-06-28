package com.tyss.javaapp.java8;

import java.util.ArrayList;

public class StreamExample {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		
		long t= a1.stream().filter(i->i % 2!=0).count();
		System.out.println(t);
	}
}
