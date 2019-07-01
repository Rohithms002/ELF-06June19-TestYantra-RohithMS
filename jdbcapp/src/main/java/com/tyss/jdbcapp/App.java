package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

/**
 * JDBC program to retrieve the data present in a table!
 *
 */
@Log
public class App {

	public static void main(String[] args) {

		String sql = "select * from employee_info";
		Connection con = null;
		Statement stmt = null;
		ResultSet resultset = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra_db", "root", "root");
			log.info("" + con + "connection successfull");
			stmt = con.createStatement();
			resultset = stmt.executeQuery(sql);
			log.info("" + "success");

			while (resultset.next()) {

				log.info("ID " + resultset.getInt(1));
				log.info("Name " + resultset.getString(2));
				log.info("Age " + resultset.getString(3));
				log.info("Gender " + resultset.getString(4));
				log.info("Salary " + resultset.getDouble(5));
				log.info("Phone " + resultset.getLong(6));
				log.info("Joining_date " + resultset.getDate(7));
				log.info("Email " + resultset.getString(8));
				log.info("Designnation " + resultset.getString(9));
				log.info("DOB " + resultset.getDate(10));
				log.info("Dept_ID " + resultset.getInt(11));
				log.info("Mgr_id " + resultset.getInt(12));
			}

		} catch (ClassNotFoundException e) {

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
				if (resultset != null) {
					resultset.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
