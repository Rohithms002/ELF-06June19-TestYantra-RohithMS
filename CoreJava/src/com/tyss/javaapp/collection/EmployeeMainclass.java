package com.tyss.javaapp.collection;

import java.util.TreeSet;

public class EmployeeMainclass {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("Rohith");
		e1.setId(10);
		e1.setSalary(20000.0);

		Employee e2 = new Employee();
		e2.setName("Nihar");
		e2.setId(12);
		e2.setSalary(30000.0);

		EmployeeByID eid = new EmployeeByID();
		EmployeeByName ename = new EmployeeByName();
		TreeSet<Employee> tree = new TreeSet<>(ename);

		tree.add(e1);
		tree.add(e2);

		for (Employee e : tree) {

			System.out.println(e);
		}
	}
}
