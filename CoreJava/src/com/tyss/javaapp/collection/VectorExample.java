package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add("Rohith");
		v.add(1.5);

		System.out.println("*** for loop ***");

		for (int i = 0; i < v.size(); i++) {
			Object obj = v.get(i);
			System.out.println(obj);
		}

		System.out.println("***for each loop***");

		for (Object ob : v) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator i = v.iterator();
		while (i.hasNext()) {
			Object ob = i.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator forward ***");
		ListIterator lit = v.listIterator();
		while (lit.hasNext()) {
			Object ob = lit.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");
		ListIterator litb = v.listIterator(v.size());
		while (litb.hasPrevious()) {
			Object ob = litb.previous();
			System.out.println(ob);

		}

		System.out.println(v);

	}
}
