package com.tyss.javaapp.java8;

import lombok.Data;

@Data
public class Product {

	String pName;
	double cost;
	
	void display() {
		System.out.println( "pName" +pName + "cost" + cost);
	}

	public Product(String pName, double cost) {
		super();
		this.pName = pName;
		this.cost = cost;
	}
}
