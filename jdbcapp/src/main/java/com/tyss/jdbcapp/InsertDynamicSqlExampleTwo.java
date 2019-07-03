package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public class InsertDynamicSqlExampleTwo {
	public static void main(String[] args) {

		String sql = "insert into employee_info(id,name,age,gender,salary,phone,joining_date,email,designation,dob,dept_id,mngr_id,account_number)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		
		PreparedStatement pstmt = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra_db", "root", "root");
			log.info("" + con.getClass());
			log.info("" + con + "connection successfull");

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
			pstmt.setInt(5, Integer.parseInt(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setDate(7, java.sql.Date.valueOf(args[6]));
			pstmt.setString(8, args[7]);
			pstmt.setString(9, args[8]);
			pstmt.setDate(10, java.sql.Date.valueOf(args[9]));
			pstmt.setInt(11, Integer.parseInt(args[10]));
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setString(13, args[12]);
			
			int rs = pstmt.executeUpdate();
			if(rs>0) {
				log.info("successfully inserted");
			}else {
				log.info("failed to insert");
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
