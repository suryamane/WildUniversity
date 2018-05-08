package com.university.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnections implements DBConnectionUtil {

	@SuppressWarnings("unused")
	private static Driver dbDriver;
	/*
	 * private static String username; private static String password;
	 */
	static Connection conn=null;
	static {
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wilduniversity", "root", "root");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {

		return conn;
	}

	public void closeConnection() {

		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
