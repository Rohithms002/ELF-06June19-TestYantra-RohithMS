package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetStringGeneric {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lh = new LinkedHashSet();
		lh.add("Pushpa");
		lh.add("Prasad");
		
		System.out.println("*****for Each******");
		System.out.println();
		
		for(String str : lh) {
			
			System.out.println(str);
		}
		System.out.println("*****Iterator******");
		System.out.println();
		Iterator<String> it = lh.iterator();
		while(it.hasNext()) {
			String obj = it.next();
			System.out.println(obj);
		}
	}
	
}
