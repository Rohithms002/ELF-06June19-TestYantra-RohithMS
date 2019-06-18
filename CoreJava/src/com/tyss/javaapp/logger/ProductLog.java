package com.tyss.javaapp.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductLog {

	private static final Logger logger = Logger.getLogger("logging");

	public void buy() {

		logger.log(Level.SEVERE, "cliked on buy");
		logger.log(Level.WARNING, "clicked on add to cart");
		logger.log(Level.INFO, "clicked on payment");
	}
}
