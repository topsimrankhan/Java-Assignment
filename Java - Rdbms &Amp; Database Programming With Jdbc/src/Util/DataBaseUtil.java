package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/registration_form";
	private static final String USER = "root";
	private static final String PASSWORD = "manishgiri";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(DB_URL, USER, PASSWORD);
	}
}
