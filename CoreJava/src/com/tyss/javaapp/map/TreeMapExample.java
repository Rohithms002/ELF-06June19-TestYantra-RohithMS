package com.tyss.javaapp.map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 10);
		hm.put(4, 40);
		hm.put(3, 30);
		hm.put(2, 20);
		hm.put(7, 20);
		hm.put(10, null);
		hm.put(11, null);
		
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			System.out.println("Key = " + entry.getKey());
			System.out.println("value = " + entry.getValue());
		}
		
		System.out.println("****Keys*****");
		Set<Integer> st = hm.keySet();
		for(Integer s : st) {
			System.out.println(s);
		}
		
		System.out.println("****values*****");
		Collection<Integer> ci = hm.values();
		
		for (Integer i : ci) {
			System.out.println(i);
		}
		
	}
}
