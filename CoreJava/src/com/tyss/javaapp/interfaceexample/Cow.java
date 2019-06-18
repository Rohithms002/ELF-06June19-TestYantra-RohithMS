package com.tyss.javaapp.interfaceexample;

public class Cow implements Animal {

	@Override
	public void sound() {
		System.out.println("Cow calling ");
		
		
	}

	@Override
	public void div(int a, int b) {
		
		int c = a/b;
		System.out.println(c+"resultcow");
	}

	
}
