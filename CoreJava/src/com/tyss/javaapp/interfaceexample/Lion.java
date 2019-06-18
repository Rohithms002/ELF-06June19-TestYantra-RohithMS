package com.tyss.javaapp.interfaceexample;

public class Lion implements Animal{

	@Override
	public void sound() {
		
		System.out.println("Lion calling");
		
	}

	@Override
	public void div(int a, int b) {
		
		int c= a/b;
		System.out.println(c + "result");
		
	}

	
}
