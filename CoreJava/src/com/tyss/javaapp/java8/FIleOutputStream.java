package com.tyss.javaapp.java8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStream {

	public static void main(String[] args) {
		String msg = "Hello Rohith";
		byte[] b = msg.getBytes();
		try (FileOutputStream f = new FileOutputStream("D:/file.txt")) {

			f.write(b);
			System.out.println("printed on file");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
