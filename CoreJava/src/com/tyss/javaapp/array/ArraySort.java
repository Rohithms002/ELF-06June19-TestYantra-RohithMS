package com.tyss.javaapp.array;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		
	Integer [] a = {5,2,1,4,3};
  Arrays.sort(a);
  for(int i=0;i<5;i++) {
	  
	  System.out.println(a[i]); 
	 
  }
  
  System.out.println("Reverese Order");
  Arrays.sort(a,Collections.reverseOrder());
  for(int c : a) {
	  
	  System.out.println(c); 
	 
  }
 
	}
}
