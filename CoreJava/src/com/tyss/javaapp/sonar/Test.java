package com.tyss.javaapp.sonar;

interface Test {
	
	final String STR="abc";

	static void xyz() {
		System.out.println("done");
	}
	
	public static void main(String[] args) {
		
		String converted= STR.toLowerCase();
		System.out.println(converted);
	}
}
