package com.tyss.javaapp.array;

import lombok.Data;

@Data
public class MyArrayClass {

	private Object[] myArray;
	private int size;
	private int index;

	public MyArrayClass() {

		this(10);
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new NegativeArraySizeException("Array size shoul be greater than zero");
		} else {
			myArray = new Object[size];

			index = 0;
		}

	}

	public void add(Object element) {
		if (index > myArray.length) {
			Object[] newArray = new Object[myArray.length * 2];
			System.arraycopy(myArray, 0, newArray, 0, myArray.length);
			myArray = newArray;
		}
		myArray[index++] = element;
		System.out.println(" element added to an array of " + index + " is " + element);

	}

	public Object get(int position) {

		return myArray[position];
	}

	public void remove(int position) {

		System.arraycopy(myArray, position + 1, myArray, position, myArray.length - 1 - position);
		myArray[myArray.length - 1] = null;

		
	}

	public int size() {
		return index;
	}
}
