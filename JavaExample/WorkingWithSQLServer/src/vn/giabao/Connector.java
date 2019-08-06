package vn.giabao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	
	public static Connection getConnection(String connectionURL, String userName, String passWord) {
	    
		Connection conn = null;
		
	    try {
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        conn = DriverManager.getConnection(connectionURL, userName, passWord);
	        
	        System.out.println("Connected successfully!");
	        
	    } catch (Exception ex) {
	        System.out.println("Failed to connect!");
	        ex.printStackTrace();
	    }
	    
	    return conn;
	}
	
}


