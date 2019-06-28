package com.tyss.javaapp.lambda;

import java.util.Comparator;
import java.util.TreeSet;

import com.tyss.javaapp.collection.Employee;
import com.tyss.javaapp.collection.EmployeeByID;
import com.tyss.javaapp.collection.EmployeeByName;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("Rohith");
		e1.setId(10);
		e1.setSalary(20000.0);

		Employee e2 = new Employee();
		e2.setName("Nihar");
		e2.setId(12);
		e2.setSalary(30000.0);
		
		Comparator<Employee> c =(e,f)->
		{
			return e.getId().compareTo(f.getId());
		};
		
		Comparator<Employee> c1 =(e,f)->
		{
			return e.getName().compareTo(f.getName());
		};


		TreeSet<Employee> tree = new TreeSet<>(c1);

		tree.add(e1);
		tree.add(e2);

		for (Employee e : tree) {

			System.out.println(e);
		}
	}
}
