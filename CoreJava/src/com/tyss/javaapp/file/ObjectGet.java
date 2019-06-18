package com.tyss.javaapp.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectGet {

	public static void main(String[] args) {

		FileInputStream fin = null;
		ObjectInputStream obj = null;
		try {
			fin = new FileInputStream("file.txt");
			obj = new ObjectInputStream(fin);
			Person p = (Person) obj.readObject();
			System.out.println("name= " + p.getName());
			System.out.println("id= " + p.getId());
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		finally {
			if (obj != null) {
				try {
					obj.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}
	}
}
