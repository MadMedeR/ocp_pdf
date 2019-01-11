package fragen_20_40;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _39 {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> {
			System.out.println("Searching...");
			return n.contains("red");
		};
		colors.stream()
			.filter(c -> c.length() > 3)
			.allMatch(test);
	}
}
/*
	What is the result?
	
	A.	Searching...
	B.	Searching...
		Searching...
	C.	Searching...
		Searching...
		Searching...
	D.	A compilation error occurs
	
	Answer: A
*/