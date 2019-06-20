package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Pushpa");
		lh.add(47);
		lh.add('F');
		lh.add(5000.5);
		
		System.out.println("*****for Each******");
		System.out.println();
		
		for(Object obj : lh) {
			
			System.out.println(obj);
		}
		System.out.println("*****Iterator******");
		System.out.println();
		Iterator it = lh.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
	
}
