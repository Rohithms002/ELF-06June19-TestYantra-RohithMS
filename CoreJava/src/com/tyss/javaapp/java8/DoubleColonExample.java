package com.tyss.javaapp.java8;

public class DoubleColonExample {

	static void open() {
		System.out.println("open the door please");
	}
	
	
	public static void main(String[] args) {
		
		DoubleColonTest/*Funtional Interface*/ dc = DoubleColonExample :: open;
		dc.remove();
	}
}
