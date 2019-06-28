package com.testyantra.assessment.objectequality;

public class EmployeeEqual {
	
/*
 * equality method to check equality of two objects
 */
	public static boolean equality(Employee employeeOne, Employee employeeTwo) {

		if (employeeOne.equals(employeeTwo)) {
			return true;
		} else
			return false;
	}
}
