package fragen_061_80;

class DBConfiguration {
	String user;
	String password;
}

class DBHandler {
	DBConfiguration configureDB(String uname, String password) {
		//insert code here
		return new DBConfiguration(); //already solved with own solution 
	}
}

@SuppressWarnings("unused")
public class _69 {
	public static void main(String[] args) {
		DBHandler r = new DBHandler();
		DBConfiguration dbConf = r.configureDB("manager", "manager");
	}
}

/*
	Which code fragment must be inserted at line 6 to enable the code to compile?
	
	A.	DBConfiguration f;
		return f;
	B.	return DBConfiguration;
	C.	return new DBConfiguration;
	D.	return 0;
	
	Answer: Alle Lösungen falsch :(
	Should be something like:
	E.	return new DBConfiguration();
*/