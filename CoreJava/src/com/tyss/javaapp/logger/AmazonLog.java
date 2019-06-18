package com.tyss.javaapp.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AmazonLog {

	private static final Logger logger = Logger.getLogger("amazon");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		FileHandler fh;
		try {
			fh = new FileHandler("amazon.log");
			fh.setLevel(Level.ALL);

			fh.setFormatter(new SimpleFormatter());
			logger.addHandler(fh);

			Register register = new Register();
			register.connectDB();
			register.store();
			logger.info("logged successfully");
		} catch (SecurityException | IOException e) {

			e.printStackTrace();
		}

	}
}
