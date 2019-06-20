package com.tyss.javaapp.lambda;

interface SquareExample {

	int getSquare(int a);
}

public class Square {

	public static void main(String[] args) {
		SquareExample s = a -> {
			return a * a;
		};

		int a = s.getSquare(10);
		System.out.println(a);
	}

}
