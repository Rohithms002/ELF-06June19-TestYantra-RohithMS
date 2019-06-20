package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCharGeneric {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<>();
		li.add("Rohith");
		li.add("Pushpa");
		li.add("Prasad");
		li.add("Darshan");
		
		System.out.println("*** for loop ***");

		for (int i = 0; i < li.size(); i++) {
			String obj = li.get(i);
			System.out.println(obj);
		}

		System.out.println("***for each loop***");

		for (String ob : li) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator<String> i = li.iterator();
		while (i.hasNext()) {
			String ob = i.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator forward ***");
		ListIterator<String> lit = li.listIterator();
		while (lit.hasNext()) {
			String ob = lit.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");
		ListIterator<String> litb = li.listIterator(li.size());
		while (litb.hasPrevious()) {
			String ob = litb.previous();
			System.out.println(ob);

		}

		System.out.println(li);
		
	}
}
