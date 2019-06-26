package com.tyss.javaapp.java8;

import java.util.function.Consumer;

public class ConsumerTestExample {

	public static void main(String[] args) {
	
		Student s1 = new Student("rohith", 10,10,10);
		
		Consumer<Student> st = stud-> { 
			double a= (stud.m1+stud.m2+stud.m3)/3;
			System.out.println(stud.name+ " scored " + a);
		};
		st.accept(s1);
		
	}
}
