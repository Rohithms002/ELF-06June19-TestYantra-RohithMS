package com.tyss.javaapp.collection;

import java.util.TreeSet;

public class ProductMainclass {

	public static void main(String[] args) {
		
		TreeSet<Product> tree = new TreeSet<>();
		
		Product p1 = new Product();
		p1.setName("mobile");
		p1.setCost(10000);
		p1.setRating(4.5);
		
		Product p2 = new Product();
		p2.setName("charger");
		p2.setCost(1000);
		p2.setRating(4.2);
		
		Product p3 = new Product();
		p3.setName("book");
		p3.setCost(150);
		p3.setRating(4.8);
		
		
		tree.add(p1);
		tree.add(p2);
		tree.add(p3);
		
		for(Product p : tree) {
			
			System.out.println(p);
		}
	}
}
