package com.tyss.javaapp.array;

public class ArrayCopy {

	static int[] copy(int[] a) {
		int i;
		int length = a.length;
		int b[] = new int[length];
		for (i = 0; i < length; i++) {
			b[i] = a[i];

		}
		return b;
	}

	public static void main(String[] args) {
		int a[] = { 9, 6, 2, 4 };
		int b[] = copy(a);
		for (int c : b) {
			System.out.println(c);
		}
	}
}
