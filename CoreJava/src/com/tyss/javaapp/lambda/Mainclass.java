package com.tyss.javaapp.lambda;

interface StringLength {

	int returnlength(String str);
}

class Mainclass {

	public static void main(String[] args) {

		StringLength l = (str) -> str.length();
		int lenght = l.returnlength("rohith");
		System.out.println(lenght);

	}
}
