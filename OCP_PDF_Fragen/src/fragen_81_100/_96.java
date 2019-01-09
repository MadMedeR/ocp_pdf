package fragen_81_100;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class _96 {
	public static void main(String[] args) {
		List<String> nL = Arrays.asList("Jim", "John", "Jeff");
		Function<String, String> funVal = s -> "Hello : ".concat(s);
		nL.stream().map(funVal).peek(System.out::print);
	}
}

/*
	What is the result?
	
	A. Hello : Jim Hello : John Hello : Jeff 
	B. Jim John Jeff 
	C. The program prints nothing 
	D. A compilation error occurs
	
	Answer: C
	Answer: D	(If there is nL.Stream()... capital Letters)
*/