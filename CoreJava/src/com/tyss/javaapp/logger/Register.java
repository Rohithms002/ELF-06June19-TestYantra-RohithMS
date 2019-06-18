package com.tyss.javaapp.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {

	Logger logger = Logger.getLogger("amazon");

	void connectDB() {

		logger.log(Level.SEVERE, "Connected to DB");
	}

	void store() {

		logger.log(Level.SEVERE, "Stored into database");
	}
}
