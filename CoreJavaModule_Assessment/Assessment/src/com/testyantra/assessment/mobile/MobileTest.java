package com.testyantra.assessment.mobile;
/*WAP to store the mobile objects into array list and pass the list to other method, which is designed to display the details of the mobile. (Mobile should be a bean class)*/

import java.util.ArrayList;

import com.testyantra.assessment.mobile.DisplayMobileDetails;

public class MobileTest {

	public static void main(String[] args) {

		Mobile mobileOne = new Mobile();
		mobileOne.setModel("A50");
		mobileOne.setName("Galaxy");
		mobileOne.setCompany("Samsung");

		Mobile mobileTwo = new Mobile();
		mobileTwo.setModel("8plus");
		mobileTwo.setName("iphone");
		mobileTwo.setCompany("Apple");

		ArrayList<Mobile> al = new ArrayList<Mobile>();
		al.add(mobileOne);
		al.add(mobileTwo);

		DisplayMobileDetails.displayDetails(al);
	}
}
