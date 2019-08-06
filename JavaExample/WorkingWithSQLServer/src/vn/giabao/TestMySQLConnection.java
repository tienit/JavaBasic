package vn.giabao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class TestMySQLConnection {
	
	public static void main(String[] args) {

		try {
			
			StudentInfo sInfo = new StudentInfo();
			sInfo.setStudentID(29);
			sInfo.setStudentName("Nguyễn Quyết Gia Bảo");
			
			InsertData(sInfo);
			
			GetDataAndDisplay("student");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	private static void GetDataAndDisplay(String tableName) throws SQLException {
		
		// Create connection
		Connection conn = MySQLConnector.getConnection(Constants.SERVER_MYSQL, Constants.MYSQL_USER_NAME, Constants.MYSQL_PASS_WORD);
		
		try {
			if (conn != null) {
				
				// Create statement
				Statement stmt = conn.createStatement();
				
				// SQL Query
				String query = "SELECT * FROM " + tableName.toUpperCase();
			    
				// Get data from table Student and save to ResultSet
				ResultSet rs = stmt.executeQuery(query);
				
				// Show data
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "  " + rs.getNString(2));
				}
			}
			
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			conn.close();
		}
	}
	
	private static boolean InsertData(StudentInfo sInfo) throws SQLException {
		
		boolean result = false;
		
		// Create connection
		Connection conn = MySQLConnector.getConnection(Constants.SERVER_MYSQL, Constants.MYSQL_USER_NAME, Constants.MYSQL_PASS_WORD);
		
		try {
			if (conn != null) {
				
				// Create statement
				Statement stmt = conn.createStatement();
				stmt.executeQuery("SET NAMES 'UTF8'");
			    stmt.executeQuery("SET CHARACTER SET 'UTF8'");
				
				// SQL Query
				String query = "INSERT INTO STUDENT(StudentID, StudentName) VALUES ('" + sInfo.getStudentID() + "', N'" + sInfo.getStudentName() + "')";
			    
				// Insert data to MySQL Server
				int affectedRecords = stmt.executeUpdate(query);
				
				if (affectedRecords > 0) {
					result = true;
				}
			}
			
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			conn.close();
		}
		
		return result;
	}
	
	private static boolean UpdateData(StudentInfo sInfo) throws SQLException {
	
		boolean result = false;
		
		// Create connection
		Connection conn = MySQLConnector.getConnection(Constants.SERVER_MYSQL, Constants.MYSQL_USER_NAME, Constants.MYSQL_PASS_WORD);
		
		try {
			if (conn != null) {
				
				// SQL Query
				String query = "UPDATE STUDENT set StudentName = ? WHERE StudentID = ?";
			    
				// Insert data to MySQL Server
				PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(query);
				pstmt.setInt(1, sInfo.getStudentID());
				pstmt.setString(2, sInfo.getStudentName());
				int affectedRecords = pstmt.executeUpdate();
				
				if (affectedRecords > 0) {
					result = true;
				}
			}
			
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			conn.close();
		}
		
		return result;
	}
	
	private boolean DeleteData(int studentID) throws SQLException {
		
		boolean result = false;
		
		// Create connection
		Connection conn = MySQLConnector.getConnection(Constants.SERVER_MYSQL, Constants.MYSQL_USER_NAME, Constants.MYSQL_PASS_WORD);
		
		try {
			if (conn != null) {
				
				// SQL Query
				String query = "DELETE FROM STUDENT WHERE StudentID = ?";
			    
				// Insert data to MySQL Server
				PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(query);
				pstmt.setInt(1, studentID);
				result = pstmt.execute();
			}
			
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			conn.close();
		}
		
		return result;
	}
	
}
