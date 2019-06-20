package com.tyss.javaapp.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("Rohith");
		h.add(25);
		h.add(10500.00);
		h.add('M');
		
		System.out.println("*****for Each******");
		System.out.println();
		for(Object obj : h) {
			System.out.println(obj);
		}
		System.out.println("*****Iterator******");
		System.out.println();
		Iterator it = h.iterator();
		while(it.hasNext()) {
			Object obj= it.next();
			System.out.println(obj);
		}
	}
}
