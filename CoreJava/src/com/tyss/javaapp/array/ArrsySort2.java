package com.tyss.javaapp.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrsySort2 {

	public static void main(String[] args) {
		
		Double [] c = { 2.4,6.9,3.2,4.6};
		Arrays.sort(c);
		for(int i=0;i<4;i++) {
			
			System.out.println(c[i]);
		}
		//reverse
		System.out.println("reverse order");
		Arrays.sort(c,Collections.reverseOrder());
		for(int i=0;i<4;i++) {
			
			System.out.println(c[i]);
		}
	}
}
