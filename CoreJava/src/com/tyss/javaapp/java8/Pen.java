package com.tyss.javaapp.java8;

public class Pen {
	
	Pen(){
		System.out.println("hello");
	}
	
	Pen(int z){
		
		System.out.println("hello" + z + "constructor");
	}

	void write() {
		
		System.out.println("writing");
	}
	
	public static void main(String[] args) {
		
		
		  PenFactory p = Pen :: new; Pen x=p.getPen();
		 
		
	
		x.write();
		
		
	}
}
