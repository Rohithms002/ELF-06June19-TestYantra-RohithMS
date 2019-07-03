package com.tyss.jdbcapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	private static PropertyUtil poolRef;
	private Properties info;
	private String dbUrl;
	private String uName;
	private String password;
	private String key;

	public static PropertyUtil getPropertyUtil() throws Exception {
		if (poolRef == null) {
			poolRef = new PropertyUtil();
		}
		return poolRef;
	}

	private PropertyUtil() throws IOException {
		info = new Properties();
		FileInputStream fis = new FileInputStream("database.properties");
		info.load(fis);
	}

	public String getProperty(String key) throws IOException {
		return info.getProperty(key);
	}
}
