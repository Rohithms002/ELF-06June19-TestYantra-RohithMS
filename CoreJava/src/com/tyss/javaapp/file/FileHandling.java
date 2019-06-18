package com.tyss.javaapp.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {

		File file = new File("E:/file.txt");
		boolean result;
		try {
			result = file.createNewFile();
			System.out.println(result);
		} catch (IOException e) {
			System.out.println("path specified is not present");
		}

		try {
			String msg = "Hello Rohith";
			byte[] b = msg.getBytes();
			FileOutputStream fo = new FileOutputStream("D:/file.txt", true);
			fo.write(b);
			System.out.println("printed on file");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			FileInputStream fi = new FileInputStream("D:/file.txt");
			int i = 0;
			while ((i = fi.read()) != -1) {
				System.out.print((char) i);
			}

			fi.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		String msg = " Hello Mr Rohith";
		char[] ch = msg.toCharArray();

		FileWriter fw = new FileWriter("file.txt");
		fw.write(ch);
		fw.flush();
		fw.close();

		FileReader fr = new FileReader("file.txt");
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.print(((char) i));

		}
		fr.close();

		FileReader fread = new FileReader("file.txt");

		BufferedReader br = new BufferedReader(fread);
		int j = 0;
		while ((j = br.read()) != -1) {
			System.out.println(br.readLine());
			br.close();
		}

	}

}
