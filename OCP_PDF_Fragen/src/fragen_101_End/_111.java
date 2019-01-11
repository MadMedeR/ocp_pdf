package fragen_101_End;

public class _111 { // class Counter
	public static void main (String[ ] args) {
		int a = 10;
		int b = -1;
		assert (b >=1) : "Invalid Denominator";
		int c = a / b;
		System.out.println (c);
		}
}
/**
 * What is the result?
A. -10 
B. 0 
C. An AssertionError is thrown 
D. A compilation error occurs
 */

// Antwort A (-10)

// wann führt mit commandline:   java -ea_111  
// Exception in thread "main" java.lang.AssertionError: Invalid Denominator
//at fragen_101_End._111.main(_111.java:7)




