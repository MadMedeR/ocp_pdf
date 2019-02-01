package fragen_001_20;

import java.io.IOException;

final class Folder { //line n1 ==> class Folder implements AutoCloseable {
	//line n2 solved with E:
//	public void close () throws IOException { 
//		System.out.print("Close"); 
//	} 
	public void open () { 
		System.out.print("Open"); 
	} 
} 

public class _12 { 
	public static void main (String [] args) throws Exception { 
		try (Folder f = new Folder()) { 
			f.open(); 
		} 
	} 
}
	
/*
	Which two modifications enable the code to print Open Close? (Choose two.)

	A.	Replace line n1 with:
		class Folder implements AutoCloseable {
	B.	Replace line n1 with:
		class Folder extends Closeable {
	C.	Replace line n1 with:
		class Folder extends Exception {
	D.	At line n2, insert:
		final void close () {
			System.out.print("Close");
		}
	E.	At line n2, insert:
		public void close () throws IOException {
			System.out.print("Close");
		}
	
	Answer: A,E
	
	siehe auch web_35
	https://www.briefmenow.org/oracle/which-two-modifications-enable-the-code-to-print-open-close/
*/