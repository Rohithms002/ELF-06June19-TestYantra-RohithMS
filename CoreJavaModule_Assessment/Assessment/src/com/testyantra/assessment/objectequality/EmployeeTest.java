package com.testyantra.assessment.objectequality;

/*WAP to compare the equality of two objects*/

import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeOne = new Employee();
		employeeOne.setId(10);
		employeeOne.setName("Rohith");
		employeeOne.setEmail("rohit.ms@testyantra.com");
		
		Employee employeeTwo = new Employee();
		employeeOne.setId(11);
		employeeOne.setName("Ranjith");
		employeeOne.setEmail("ranjit.ms@testyantra.com");
		
	
		Boolean result =EmployeeEqual.equality(employeeOne, employeeTwo);
		log.info(""+ result );
	}
}
