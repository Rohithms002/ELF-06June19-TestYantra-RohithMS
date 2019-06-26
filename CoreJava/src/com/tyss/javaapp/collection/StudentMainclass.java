package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentMainclass {

	
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setName("Rohith");
		s1.setId(10);
		s1.setPercentage(90.56);
		
		Student s2 = new Student();
		s2.setName("Nihar");
		s2.setId(11);
		s2.setPercentage(95.0);
		
		Student s3 = new Student();
		s3.setName("Spoorthy");
		s3.setId(12);
		s3.setPercentage(91.1);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		
		for(Student s : al ) {
			
			System.out.println(s);
		}
		
		System.out.println("*** for loop ***");

		for (int i = 0; i < al.size(); i++) {
			Student student = al.get(i);
			System.out.println(student);
		}

		System.out.println("***for each loop***");

		for (Student ob : al) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator<Student> i = al.iterator();
		while (i.hasNext()) {
			Student ob = i.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator forward ***");
		ListIterator<Student> lit = al.listIterator();
		while (lit.hasNext()) {
			Student ob = lit.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");
		ListIterator<Student> litb = al.listIterator(al.size());
		while (litb.hasPrevious()) {
			Student ob = litb.previous();
			System.out.println(ob);

		}

		System.out.println(al);
		
	}
}
