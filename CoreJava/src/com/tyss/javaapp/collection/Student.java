package com.tyss.javaapp.collection;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {

	String name;
	Integer id;
	Double percentage;
	@Override
	public int compareTo(Student o) {
	return o.getName().compareTo(getName());
		
	}
	
}
