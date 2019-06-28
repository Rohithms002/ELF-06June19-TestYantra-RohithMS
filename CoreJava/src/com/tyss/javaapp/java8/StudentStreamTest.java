package com.tyss.javaapp.java8;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class StudentStreamTest {
	
	static Comparator<StudentStream> c = (a,b)->{
		
		if(a.getPercentage()>b.getPercentage()) {
			return 1;
		} else if(a.getPercentage()<b.getPercentage()) {
			return -1;
		}else return 0;
	};
	static StudentStream getTopper(ArrayList<StudentStream> a1) {
		
		return a1.stream().max(c).get();
		
	}
	
	static StudentStream getLeast(ArrayList<StudentStream> a1) {
	
		return a1.stream().min(c).get();
	}

	public static void main(String[] args) {
		
		StudentStream s1 = new StudentStream();
		s1.setId(1);
		s1.setName("Rohith");
		s1.setPercentage(99.0);
		
		StudentStream s2 = new StudentStream();
		s2.setId(2);
		s2.setName("Ranjith");
		s2.setPercentage(35.3);
		
		StudentStream s3 = new StudentStream();
		s3.setId(3);
		s3.setName("Shubham");
		s3.setPercentage(95.5);
		
		StudentStream s4 = new StudentStream();
		s4.setId(4);
		s4.setName("Diba");
		s4.setPercentage(75.2);
		
		StudentStream s5 = new StudentStream();
		s5.setId(5);
		s5.setName("none");
		s5.setPercentage(30.3);
		
		ArrayList<StudentStream> a1 = new ArrayList<StudentStream>();
		a1.add(s1);
		a1.add(s3);
		a1.add(s2);
		a1.add(s4);
		a1.add(s5);
		
		/*
		 * Comparator<StudentStream> c =(a,b)->{ return
		 * b.getPercentage().compareTo(a.getPercentage()); };
		 */
		//ascending order
		/*
		 * List<StudentStream> b1= a1.stream().sorted(c).collect(Collectors.toList());
		 * System.out.println(b1);
		 */
		StudentStream s = getTopper(a1);
		log.info("topper " + s.getName() + " with percentage " + s.getPercentage());
		
		StudentStream ss = getLeast(a1);
		log.info("least scorer " + ss.getName() + " with percentage " + ss.getPercentage());
		
		
		 
	}
}
