package com.tcs.RetailBank.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Databaseutil {
	public static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP";
	public static final String PASSWORD = "aja33core";
	public static final String USERNAME = "aja33core";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVERNAME);
			con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeStatement(PreparedStatement pst) {
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


}