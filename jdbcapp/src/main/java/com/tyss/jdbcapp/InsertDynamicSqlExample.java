package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;
@Log
public class InsertDynamicSqlExample {

	public static void main(String[] args) {

		String sql = "insert into department_info(dept_id,dept_name)values(?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra_db", "root", "root");
			log.info("" + con.getClass());
			log.info("" + con + "connection successfull");

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int rs = pstmt.executeUpdate();
			log.info("no of rows afftected" + rs);

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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
