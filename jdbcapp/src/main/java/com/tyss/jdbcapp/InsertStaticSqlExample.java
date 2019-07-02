package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

/**
 * JDBC program to update the data into a table!
 *
 */

@Log
public class InsertStaticSqlExample {

	public static void main(String[] args) {

		String sql2 = "insert into department_info(dept_id,dept_name) values(?,?)";
		Connection con = null;
		Statement stmt = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra_db", "root", "root");
			log.info("" + con.getClass());
			log.info("" + con + "connection successfull");

			stmt = con.createStatement();
			int rows = stmt.executeUpdate(sql2);
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
