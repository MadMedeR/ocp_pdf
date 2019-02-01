package fragen_081_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _093 {
	public static void main(String[] args) {
		Stream<List<String>> iStr= Stream.of(
				Arrays.asList ("1", "John"), 
				Arrays.asList ("2", null)); 
		Stream<String> nInSt = iStr.flatMapToInt((x) -> x.stream()); 
		nInSt.forEach (System.out :: print); 
	}
}

/*
	What is the result?
	
	A. 1John2null
	B. 12
	C. A NullPointerException is thrown at run time
	D. A compilation error occurs

	Answer: D
	Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Type mismatch: cannot convert from IntStream to Stream<String>
	Type mismatch: cannot convert from Stream<String> to IntStream

	at fragen_081_100._93.main(_93.java:13)
	
*/