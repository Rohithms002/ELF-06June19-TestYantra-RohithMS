package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class SelectDynamicSqlExample {
	public static void main(String[] args) {

		String sql = "select * from employee_info where id=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet resultset = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra_db", "root", "root");
			log.info("" + con + "connection successfull");
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			resultset = pstmt.executeQuery();

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

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
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
