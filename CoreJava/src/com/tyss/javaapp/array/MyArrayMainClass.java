package com.tyss.javaapp.array;

import java.util.logging.Logger;

public class MyArrayMainClass {

	private static final Logger log = Logger.getLogger("Test");

	public static void main(String[] args) {
		int size = 10;
		int position = 30;
		long time1 = System.currentTimeMillis();
		MyArrayClass array = new MyArrayClass();

		for (int i = 0; i <10; i++) {
			array.add(i);
			int sizeof=array.size();
			System.out.println(sizeof);
		}
		if (position < size) {
			array.remove(position);
		} else
			log.info("you are trying to remove the element from the index greater than the size of an array");
		System.out.println();
		System.out.println();

		long time2 = System.currentTimeMillis();

		for (int j = 0; j <10; j++) {
			Object val = array.get(j);
			log.info("element retrieved from an array is " + val);
		}

		log.info("execution time is " + (time2 - time1) + "ms");

	}
}
