package com.tyss.javaapp.java8;

public class DemoTest {

	public static void main(String[] args) {
		
		//using Lambda
		 Demo d = x-> {
			System.out.println(x); 
			
		 };
		 d.print(10);
		
		 //using method reference
		 PenDemo p = new PenDemo();
		 Demo d1=p::write;
		 d1.print(15);
	}
}
