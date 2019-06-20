package com.tyss.javaapp.array;

import lombok.Data;

@Data
public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private double salary;

	@Override
	public int compareTo(Employee o) {
		return o.getName().compareTo((getName()));
	}

}
