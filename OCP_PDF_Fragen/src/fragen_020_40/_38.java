package fragen_020_40;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class _38 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("resources/Message.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("welcome1"));
		System.out.println(prop.getProperty("welcome2", "Test"));	//line n1
		System.out.println(prop.getProperty("welcome3"));
	}
}
/*
	Given the content of /resourses/Message.properties:
	welcome1="Good day!"
	
	What is the result?
	
	A.	Good day!
		Test
		followed by an Exception stack trace
	B.	Good day!
		followed by an Exception stack trace
	C.	Good day!
		Test
		null
	D.	A compilation error occurs at line n1
	
	Answer: C
*/