package com.tyss.javaapp.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeBean {

	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joiningDate;
	private String gender;

	public EmployeeBean(int id, String name, String department, double salary, int age, Date joiningDate,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.joiningDate = joiningDate;
		this.gender = gender;
	}

	public EmployeeBean() {
		super();
	}

}
