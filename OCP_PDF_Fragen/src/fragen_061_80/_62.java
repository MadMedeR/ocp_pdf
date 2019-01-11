package fragen_061_80;

import java.util.Arrays;
import java.util.List;

public class _62 {
	public static void main(String[] args) {
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom"); 
		System.out.println ( 
		// line n1
		listVal.stream().filter(x -> x.length()>3).count() // already solved with A
		);
	}
}
/*
	Which code fragment, when inserted at line n1, enables the code to print the count of string
	elements whose length is greater than three?
	
	A. listVal.stream().filter(x -> x.length()>3).count()
	B. listVal.stream().map(x -> x.length()>3).count()
	C. listVal.stream().peek(x -> x.length()>3).count().get()
	D. listVal.stream().filter(x -> x.length()>3).mapToInt(x -> x).count()
	
	Answer: A
	
	siehe auch web_48
	http://www.briefmenow.org/oracle/which-code-fragment-when-inserted-at-line-n1-enables-4/
*/