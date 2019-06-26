package com.tyss.javaapp.collection;

import java.util.TreeSet;

public class CarMainclass {

	public static void main(String[] args) {
		
		TreeSet<Car> tree = new TreeSet<Car>();
		Car c1 = new Car();
		c1.setName("Audi");
		c1.setBranch("Bangalore");
		c1.setCost(200000);
		c1.setRating(5.0);
		
		Car c2 = new Car();
		c2.setName("BMW");
		c2.setBranch("Mandya");
		c2.setCost(20000);
		c2.setRating(5.0);
		
		tree.add(c1);
		tree.add(c2);
		
		for(Car c : tree) {
			System.out.println(c);
		}
	}
}
