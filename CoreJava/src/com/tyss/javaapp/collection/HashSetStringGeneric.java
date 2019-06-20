package com.tyss.javaapp.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStringGeneric {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		h.add("Rohith");
		h.add("Sanjana");
		h.add("Pushpa");
		h.add("Spoorthy");
		
		System.out.println("*****for Each******");
		System.out.println();
		for(String str : h) {
			System.out.println(str);
		}
		System.out.println("*****Iterator******");
		System.out.println();
		Iterator<String> it = h.iterator();
		while(it.hasNext()) {
			String str= it.next();
			System.out.println(str);
		}
	}
}
