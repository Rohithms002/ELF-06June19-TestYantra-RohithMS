package com.tyss.javaapp.array;

import java.util.Arrays;

public class Mainclass {

	public static void main(String[] args) {

		Employee[] employee = new Employee[4];

		Employee emp1 = new Employee();
		emp1.setName("Rohith");
		emp1.setAge(25);
		emp1.setSalary(1000);

		Employee emp2 = new Employee();
		emp2.setName("Pushpa");
		emp2.setAge(26);
		emp2.setSalary(3000);

		Employee emp3 = new Employee();
		emp3.setName("Nihar");
		emp3.setAge(20);
		emp3.setSalary(25000);

		Employee emp4 = new Employee();
		emp4.setName("Prasad");
		emp4.setAge(30);
		emp4.setSalary(10000);

		// store in an array
		employee[0] = emp1;
		employee[1] = emp2;
		employee[2] = emp3;
		employee[3] = emp4;

		Arrays.sort(employee);
		for (Employee emp : employee) {

			System.out.println("Name : " + emp.getName());
			System.out.println("Age : " + emp.getAge());
			System.out.println("salary : " + emp.getSalary());
		}
	}
}
