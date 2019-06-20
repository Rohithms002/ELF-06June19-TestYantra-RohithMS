package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListGenerics {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);

		ArrayList<Double> bl = new ArrayList<>();
		bl.add(9.2);
		bl.add(1.5);
		
		
		al.addAll(bl);
		System.out.println("after copying all elements of b arraylist " + al );
		System.out.println();
		// addAll() to add elements from one ArrayList to another

		System.out.println("Before " + al);
		System.out.println();
		al.add(22.34);
		al.add(3, 3.5);

		Double modified = al.set(2, 5.55);
		System.out.println("removed Object is " + modified);
		System.out.println();

		Double removed = al.remove(5);
		System.out.println("removed Object from the arraylist is " + removed);
		System.out.println();

		boolean ref = al.remove(2.4);
		System.out.println("result is " + ref);
		System.out.println();

		boolean ref1 = al.remove(99.9);
		System.out.println("result is " + ref1);
		System.out.println();

		System.out.println("After " + al);
		System.out.println();

		System.out.println("*******************BEFORE SORTING***************");
		System.out.println();

		System.out.println("***for each loop***");

		for (Double ob : al) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator<Double> i = al.iterator();
		while (i.hasNext()) {

			Double d = i.next();
			System.out.println(d);
		}

		System.out.println("*** for loop ***");

		for (int index = 0; index < al.size(); index++) {
			Double obj = al.get(index);
			System.out.println(obj);
		}

		System.out.println("*** ListIterator forward ***");

		ListIterator<Double> li = al.listIterator();
		while (li.hasNext()) {
			Double ob = li.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");

		ListIterator<Double> lit = al.listIterator(al.size());
		while (lit.hasPrevious()) {
			Double ob = lit.previous();
			System.out.println(ob);

		}

		System.out.println(al);

		System.out.println("*******************AFTER SORTING***************");

		Collections.sort(al);

		System.out.println("***for each loop***");

		for (Double ob : al) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator<Double> ii = al.iterator();
		while (i.hasNext()) {

			Double d = i.next();
			System.out.println(d);
		}

		System.out.println("*** for loop ***");

		for (int index = 0; index < al.size(); index++) {
			Double obj = al.get(index);
			System.out.println(obj);
		}

		System.out.println("*** ListIterator forward ***");

		ListIterator<Double> li1 = al.listIterator();
		while (li1.hasNext()) {
			Double ob = li1.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");

		ListIterator<Double> lit1 = al.listIterator(al.size());
		while (lit1.hasPrevious()) {
			Double ob = lit1.previous();
			System.out.println(ob);

		}

		System.out.println(al);
	}
}
