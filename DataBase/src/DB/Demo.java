package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {
	
	public static void main(String args[]) throws Exception {
		getConnection();
		
	}
	
	public static Connection getConnection() throws Exception{
		try {
			String driver= "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/testDB";
			String username = "root";
			String password = "Riders80";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
