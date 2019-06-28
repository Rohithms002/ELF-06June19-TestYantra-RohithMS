package com.tyss.javaapp.java8;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class ArrayStream {

	public static void main(String[] args) {

		Integer a[] = { 5, 6, 7, 8, 9 };
		Stream<Integer> s = Stream.of(a);
		s.forEach(i -> log.info("" + i));

		log.info("******************" + " group of values");
		Stream<Integer> s1 = Stream.of(8, 5, 2, 3);
		s1.forEach(j -> log.info("" + j));
		s1.forEach(System.out::println);
	}
}
