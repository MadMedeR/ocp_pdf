package web_1_30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
	Given:
	Item table
	• ID, INTEGER: PK
	• DESCRIPTION, VARCHAR(100)
	• PRICE, REAL
	• QUANTITY, INTEGER
*/

public class web_30 {
	private static String dbURL, username, password;

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			String query = "Select * FROM Item WHERE ID = 110";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt("Id"));
				System.out.println("Description: " + rs.getString("Descrip"));
				System.out.println("Price: " + rs.getDouble("Price"));
				System.out.println("Quantity: " + rs.getInt("Quantity"));
			}
		} catch (SQLException se) {
			System.out.println("Error");
		}
	}
}

/*
	Assume that:
	The required database driver is configured in the classpath.
	The appropriate database is accessible with the dbURL, userName, and passWord exists.
	The SQL query is valid.
	
	What is the result?
	
	A. An exception is thrown at runtime.
	B. Compilation fails.
	C. The code prints Error.
	D. The code prints information about Item 110.
	
	Answer: D
	
	http://www.briefmenow.org/oracle/what-is-the-result-958/
	
*/