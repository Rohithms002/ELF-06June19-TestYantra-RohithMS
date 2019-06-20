package com.tyss.javaapp.array;

import java.util.Arrays;

public class ArrayEquals {

	static void equals(int a[]) {
		int i;
		int b[]= {1,2,3,4};
		for(i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				System.out.println("true");
			}else {
				
				System.out.println("false");
			}
		}
	}
	
	public static void main(String[] args) {
		int b[]= {1,2,3,4};
		
		int a[]= {1,2,3,4};
		ArrayEquals.equals(a);
		System.out.println("---"+Arrays.equals(a, b));
	}
}
