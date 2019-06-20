package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.add(10);
		li.add(15.5);
		li.add('M');
		li.add("Rohith");
		
		System.out.println("*** for loop ***");

		for (int i = 0; i < li.size(); i++) {
			Object obj = li.get(i);
			System.out.println(obj);
		}

		System.out.println("***for each loop***");

		for (Object ob : li) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator i = li.iterator();
		while (i.hasNext()) {
			Object ob = i.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator forward ***");
		ListIterator lit = li.listIterator();
		while (lit.hasNext()) {
			Object ob = lit.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");
		ListIterator litb = li.listIterator(li.size());
		while (litb.hasPrevious()) {
			Object ob = litb.previous();
			System.out.println(ob);

		}

		System.out.println(li);
		
	}
}
