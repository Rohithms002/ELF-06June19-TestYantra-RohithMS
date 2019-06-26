package com.tyss.javaapp.collection;

import lombok.Data;

@Data
public class Car implements Comparable<Car> {

	String name;
	String branch;
	Integer cost;
	Double rating;
	@Override
	public int compareTo(Car c) {
		return c.getName().compareTo(getName());
	}
}
