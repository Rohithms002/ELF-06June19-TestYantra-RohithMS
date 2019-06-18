package com.tyss.javaapp.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLogger {

	private static final Logger logger = Logger.getLogger("logging");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);

		try {
			FileHandler file = new FileHandler("logging.log", true);
			file.setLevel(Level.ALL);
			file.setFormatter(new SimpleFormatter());
			logger.addHandler(file);

			logger.log(Level.SEVERE, "this is severe logger");
			logger.log(Level.WARNING, "this is warning logger");
			logger.log(Level.INFO, "this is Info logger");
			logger.log(Level.CONFIG, "this is CONFIG logger");
			logger.log(Level.FINE, "this is FINE logger");

			ProductLog product = new ProductLog();
			product.buy();
		} catch (SecurityException | IOException e) {

			e.printStackTrace();
		}
	}
}
