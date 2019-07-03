package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	private Vector<Connection> pool = new Vector<>();
	private int poolSize = 10;
	private String dbUrl;
	private String uName;
	private String password;
	private Connection con = null;
	private static ConnectionPool poolRef = null;

	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	private ConnectionPool() throws Exception {
		loadProperties();
		initializePool();
	}

	public Connection getConnection() {
		return pool.remove(0);
	}

	public void placeConnection(Connection con) {
		pool.add(con);
	}

	private void loadProperties() throws Exception {
		dbUrl = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DBURL);
		uName = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.NAME);
		password = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.PASSWORD);

	}

	private void initializePool() throws SQLException {
		for (int i = 1; i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl, uName, password);
			pool.add(con);
		}
	}

}
