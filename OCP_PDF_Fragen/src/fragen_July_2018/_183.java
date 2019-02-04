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
		} catch (RuntimeException re) {
			System.out.println("Caught an Exception");
		} catch (Exception e) {
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

	Answer: E (OutOfMemoryError)
*/