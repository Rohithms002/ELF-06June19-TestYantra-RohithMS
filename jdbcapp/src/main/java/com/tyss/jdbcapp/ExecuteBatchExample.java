package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class ExecuteBatchExample {

	public static void main(String[] args) {

		String sql1 = "insert into department_info values (1500,'Analyst')";
		String sql2 = "insert into department_info values (1600, 'others')";
		Connection con = null;
		Statement stmt = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra_db", "root", "root");
			log.info("" + con.getClass());
			log.info("" + con + "connection successfull");

			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			int[] rows = stmt.executeBatch();

			log.info("no of rows afftected" + rows);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
