package com.tyss.javaapp.array;

import java.util.Arrays;
import java.util.Date;

public class ArrayCopyExample {

	public static void main(String[] args) {

		int a[] = { 5, 6, 1, 2, 4, 7, 8, 10, 12 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		Date date = new Date();
		System.out.println(date);
		for (int i = 2; i < 4; i++) {

			b[i + 1] = a[i];
		}

		Date date1 = new Date();
		System.out.println(date1);
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

		System.out.println("****************************");
		System.arraycopy(a, 2, b, 3, 2);
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}
}
