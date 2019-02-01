package fragen_020_40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
	Given the structure of the STUDENT table:
	Student (id INTEGER, name VARCHAR)
 */

public class _27 {
	static Connection newConnection = null;
	private static String password, username, URL;
	
	public static Connection getDBConnection () throws SQLException {
		try (Connection con = DriverManager.getConnection(URL, username, password)) {
			newConnection = con;
		}
		return newConnection;
	}
	public static void main (String [] args) throws SQLException {
		getDBConnection();
		Statement st = newConnection.createStatement();
		st.executeUpdate("INSERT INTO student VALUES (102, 'Kelvin')");
	}
}
/*
	Assume that: The required database driver is configured in the classpath.
	The appropriate database is accessible with the URL, userName, and passWord exists.
	The SQL query is valid.

	What is the result?
		
	A.	The program executes successfully and the STUDENT table is updated with one record.
	B.	The program executes successfully and the STUDENT table is NOT updated with any record.
	C.	A SQLException is thrown as runtime.
	D.	A NullPointerException is thrown as runtime.
	
	Answer: C		The connection is created in try with resources. So is closed when try clause finishes.
					Creating statement upon closed connection produces SQLException.
	
	http://www.briefmenow.org/oracle/what-is-the-result-944/
*/