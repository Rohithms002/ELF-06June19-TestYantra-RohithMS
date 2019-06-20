package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("Rohith");
		tree.add("Nihar");
		tree.add("Zullaaas");
		
		System.out.println("*****for Each******");
		System.out.println();
		for(String str : tree) {
			
			System.out.println(str);
		}
		
		System.out.println("*****Iterator******");
		System.out.println();
		Iterator<String> it = tree.iterator();
		while(it.hasNext()) {
			String str= it.next();
			System.out.println(str);
		}
	}
}
