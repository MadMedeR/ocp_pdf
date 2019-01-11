package fragen_081_100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _95 {
	static String dbURL="",userName="",passWord="";
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
		String query = "SELECT id FROM Employee";
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(query);
			stmt.executeQuery("SELECT id FROM Customer"); //line 13
			while (rs.next()) {
				//process the results
				System.out.println("Employee ID: "+ rs.getInt("id"));
			}
		} catch (Exception e) {
			System.out.println ("Error");
		}
	}
}

/*
	Assume that:
	- The required database driver is configured in the classpath.
	- The appropriate database is accessible with the dbURL, userName, and passWord exists.
	- The Employee and Customer tables are available and each table has id
		column with a few records and the SQL queries are valid.
		
	What is the result of compiling and executing this code fragment?
	
	A. The program prints employee IDs. 
	B. The program prints customer IDs. 
	C. The program prints Error. 
	D. Compilation fails on line 13. 

	Answer: ?
*/