package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class AwsDatabaseExdample {

	public static void main(String[] args) {

		String sql = "create database tyss_db";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra_db", "root", "root");
				Statement stmt = con.createStatement();) {
			stmt.executeUpdate(sql);
			log.info("" + con.getClass());
			log.info("" + con + "connection successfull");

			log.info("" + "success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
