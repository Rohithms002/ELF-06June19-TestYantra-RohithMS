package com.tyss.javaapp.map;


import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("one", 10);
		hm.put("two", 40);
		hm.put("three", 30);
		hm.put("four", 20);
		
		for(Map.Entry<String, Integer> entry : hm.entrySet())
			System.out.println(entry.getKey());
		
	}
}
