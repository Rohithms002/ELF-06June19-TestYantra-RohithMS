package com.tyss.javaapp.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStore {

	public static void main(String[] args) {

		Person person = new Person();
		person.setId(10);
		person.setName("rohith");
		FileOutputStream fout = null;
		ObjectOutputStream obj = null;

		try {
			fout = new FileOutputStream("file.txt");
			obj = new ObjectOutputStream(fout);
			obj.writeObject(person);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			if (obj != null) {
				try {
					obj.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
