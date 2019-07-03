package com.tyss.jdbcapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class ConnectionPoolTest{

	public static void main(String[] args) {

		String sql = "select * from employee_info";
		try {
			ConnectionPool pool = ConnectionPool.getConnectionPool();
			Connection con = pool.getConnection();
			Statement stmt = con.createStatement();
			ResultSet resultset = stmt.executeQuery(sql);

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
			pool.placeConnection(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
