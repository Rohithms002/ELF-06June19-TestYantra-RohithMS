package com.tyss.javaapp.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("demo.properties");
			Properties p = new Properties();
			p.load(fin);
			String name = p.getProperty("CompanyName");
			String address = p.getProperty("Address");
			System.out.println("Company Name is " + name);
			System.out.println("Company Address is " + address);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
