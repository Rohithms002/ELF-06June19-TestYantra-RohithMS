package com.tyss.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIntegerGenerics {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector();
		v.add(10);
		v.add(20);
		v.add(3);

		System.out.println("*** for loop ***");

		for (int i = 0; i < v.size(); i++) {
			Integer obj = v.get(i);
			System.out.println(obj);
		}

		System.out.println("***for each loop***");

		for (Integer ob : v) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator<Integer> i = v.iterator();
		while (i.hasNext()) {
			Integer ob = i.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator forward ***");
		ListIterator<Integer> lit = v.listIterator();
		while (lit.hasNext()) {
			Integer ob = lit.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");
		ListIterator<Integer> litb = v.listIterator(v.size());
		while (litb.hasPrevious()) {
			Integer ob = litb.previous();
			System.out.println(ob);

		}
		System.out.println("*** Enumerator ***");
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			Integer k=e.nextElement();
			System.out.println(k);
		}

		System.out.println(v);

	}
}
