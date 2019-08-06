package vn.giabao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) {
		
		try {
			
			// Create connection
			Connection conn = Connector.getConnection(Constants.SERVER_URL, Constants.USER_NAME, Constants.PASS_WORD);
			
			if (conn != null) {
				
				// Create statement
				Statement stmt = conn.createStatement();
				
				// SQL Query
				String query = "SELECT * FROM STUDENT";
				
				// Get data from table Student and save to ResultSet
				ResultSet rs = stmt.executeQuery(query);
				
				// Show data
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "  " + rs.getString(2));
				}
				
				// Close connection
				conn.close();
				
			} else {
				System.out.println("Cannot connect to SQL Server");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
