package web_1_30;


public class web_30 {
     
}


/*Given:
Item table
� ID, INTEGER: PK
� DESCRIP, VARCHAR(100)
� PRICE, REAL
� QUANTITY< INTEGER
And given the code fragment:
9. try {
10. Connection conn = DriveManager.getConnection(dbURL, username, password);
11. String query = �Select * FROM Item WHERE ID = 110�;
12. Statement stmt = conn.createStatement();
13. ResultSet rs = stmt.executeQuery(query);
14. while(rs.next()) {
15. System.out.println(�ID: � + rs.getInt(�Id�));
16. System.out.println(�Description: � + rs.getString(�Descrip�));
17. System.out.println(�Price: � + rs.getDouble(�Price�));
18. System.out.println(Quantity: � + rs.getInt(�Quantity�));
19. }
20. } catch (SQLException se) {
21. System.out.println(�Error�);
22. }
Assume that:
The required database driver is configured in the classpath.
The appropriate database is accessible with the dbURL, userName, and passWord exists.
The SQL query is valid.
What is the result?*/

//Answer?