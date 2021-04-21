package org.cts.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.cts.util.DBConstants;
import org.cts.util.DBUtil;

public class DBUtil {
	public static Connection getConnection(String driver,String url,String userName,String password) {
		Connection con=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
