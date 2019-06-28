package com.tyss.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class WriteToPropertiesFile {

	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("demo.properties");
			Properties p = new Properties();
			p.setProperty("CompanyName", "TestYantra");
			p.setProperty("Address", "Basavangudi");
			p.store(fout, "company information");
			log.info("file created and stored the details");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
