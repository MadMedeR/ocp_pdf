package fragen_20_40;

public class _36 {}
/*
	Which statement is true about the DriverManager class?
	
	A. It returns an instance of Connection.
	B. it executes SQL statements against the database.
	C. It only queries metadata of the database.
	D. it is written by different vendors for their specific database.
	
	Answer: A
	
	Explanation:
	The DriverManager returns an instance of Doctrine\DBAL\Connection which is a wrapper around
	the underlying driver connection (which is often a PDO instance).
	http://doctrine-dbal.readthedocs.org/en/latest/reference/configuration.html
*/
