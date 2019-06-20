package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListGenericString {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Rohith");
		al.add("Neha");
		al.add("Pushpa");
		
		System.out.println("*******************BEFORE SORTING***************");
		
		System.out.println("***for each loop***");

		for (String ob : al) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator<String> i = al.iterator();
		while (i.hasNext()) {

			String d = i.next();
			System.out.println(d);
		}

		System.out.println("*** for loop ***");

		for (int index = 0; index < al.size(); index++) {
			String obj = al.get(index);
			System.out.println(obj);
		}

		System.out.println("*** ListIterator forward ***");

		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			String ob = li.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");

		ListIterator<String> lit = al.listIterator(al.size());
		while (lit.hasPrevious()) {
			String ob = lit.previous();
			System.out.println(ob);

		}

		System.out.println(al);
		
		System.out.println("*******************AFTER SORTING***************");
		Collections.sort(al);

		System.out.println("***for each loop***");

		for (String ob : al) {

			System.out.println(ob);
		}

		System.out.println("*** Iterator ***");

		Iterator<String> ii = al.iterator();
		while (ii.hasNext()) {

			String d = ii.next();
			System.out.println(d);
		}

		System.out.println("*** for loop ***");

		for (int index = 0; index < al.size(); index++) {
			String obj = al.get(index);
			System.out.println(obj);
		}

		System.out.println("*** ListIterator forward ***");

		ListIterator<String> lii = al.listIterator();
		while (lii.hasNext()) {
			String ob = lii.next();
			System.out.println(ob);
		}

		System.out.println("*** ListIterator backward ***");

		ListIterator<String> lit1 = al.listIterator(al.size());
		while (lit1.hasPrevious()) {
			String ob = lit1.previous();
			System.out.println(ob);

		}

		System.out.println(al);
	}
}
