package com.tyss.javaapp.bean;

import java.util.logging.Logger;

public class EmployeeMaincClass {

	
	private static final Logger logger = Logger.getLogger("Test");
	public static void main(String[] args) {
		
		EmployeeBean ebean = new EmployeeBean();
		logger.info(ebean.toString());
	}
}
