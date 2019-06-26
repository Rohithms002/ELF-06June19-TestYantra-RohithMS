package com.tyss.javaapp.java8;

public class Boy {

	String name;
	double height;
	int age;
	
	public Boy(String name, double height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
	}
	
	void displayDetails() {
		System.out.println("name = "+ name + " height =" + height + "age" + age);
	}
	

}
