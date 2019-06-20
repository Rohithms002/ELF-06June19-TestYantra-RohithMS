package com.tyss.javaapp.array;

import java.util.Arrays;

public class ArraySearch {

	static int[] m = { 15, 6, 19, 4, 13, 16 };

	static void search(int a) {

		for (int i = 0; i < m.length; i++) {
			if (m[i] == a) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

	}

	public static void main(String[] args) {
		int[] m = { 15, 6, 19, 4, 13, 16 };
		Arrays.sort(m);
		ArraySearch.search(6);
		int p = Arrays.binarySearch(m, 16);
		System.out.println("element present at index :" + p);
	}
}
