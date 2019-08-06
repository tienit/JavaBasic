package vn.giabao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnector {

	public static Connection getConnection(String connectionURL, String userName, String passWord) {
	    
		Connection conn = null;
		
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        conn = DriverManager.getConnection(connectionURL, userName, passWord);
	        
	        System.out.println("Connected MySQL successfully!");
	        
	    } catch (Exception ex) {
	        System.out.println("Failed to connect MySQL!");
	        ex.printStackTrace();
	    }
	    
	    return conn;
	}
	
}
