package com.tyss.javaapp.file;

import java.io.File;

public class FIleHandling2 {

	public static void main(String[] args) {

		File file = new File("C:/eclipsefoundation");
		File file1 = new File("C:/mysql");
		boolean res = file.mkdir();
		boolean res1 = file1.mkdir();
		System.out.println(res);
		System.out.println(res1);
	}
}
