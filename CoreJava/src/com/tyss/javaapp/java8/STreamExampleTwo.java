package com.tyss.javaapp.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class STreamExampleTwo {

public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(9);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		
		List<Integer> b1= a1.stream().sorted().collect(Collectors.toList());
		System.out.println(b1);
		
		Comparator<Integer> c =(a,b)->{
			return b.compareTo(a);
		};
		
		//ascending order
		List<Integer> b2= a1.stream().sorted(c).collect(Collectors.toList());
		System.out.println(b2);
		
	    //forEach method
		a1.stream().forEach(i-> System.out.println(i));
	}
}
