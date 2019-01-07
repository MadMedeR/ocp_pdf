package fragen_July_2018;

import java.util.ArrayList;

public class _183 {
public static void main(String[] args) {
	ArrayList myList = new ArrayList();
	String[] myArray;
	try {
		while (true) {
			myList.add("My String");
		}
	}
	catch (RuntimeException re) {
		System.out.println("Caught an Exception");
	}
	System.out.println("Ready to use");
}
}


/*
 What is the result?
 
A. The code fails to compile because a throws keyword is required.
B. Execution terminates in the second catch statement, and Caught an Exception is printed to the console.
C. Execution terminates in the first catch statements, and Caught a RuntimeException is printed to the console.
D. Execution completes normally, and Ready to use is printed to the console.
E. A runtime error is thrown in the thread "main".

  */
 
//Answer: E. A runtime error is thrown in the thread "main".

/*
  Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3210)
	at java.util.Arrays.copyOf(Arrays.java:3181)
	at java.util.ArrayList.grow(ArrayList.java:265)
	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:239)
	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:231)
	at java.util.ArrayList.add(ArrayList.java:462)
	at fragen_July_2018._183.main(_183.java:11)
 */
