package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("rohith");
		al.add(25);
		al.add(1250.25);
		al.add('M');
		al.add("Rohith"); // duplicates are allowed
		al.add(null);// multiple null allowed
		al.add(null);

		System.out.println("*** for loop ***");

		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}

		System.out.println("***for each loop***");

		for (Object ob : al) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator i = al.iterator();
		while (i.hasNext()) {
			Object ob = i.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator forward ***");
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");
		ListIterator lit = al.listIterator(al.size());
		while (lit.hasPrevious()) {
			Object ob = lit.previous();
			System.out.println(ob);

		}

		System.out.println(al);
	}
}
