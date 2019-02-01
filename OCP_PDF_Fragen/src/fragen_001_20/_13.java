package fragen_001_20;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class _13 {
	public static void main(String[] args) {
		List<Integer> codes = Arrays.asList(10, 20);
		UnaryOperator<Double> uo = s -> s + 10.0;
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));
	}
}

/*
	What is the result? 
	
	A.	20.0
		30.0
	B.	10
	C.	A compilation error occurs
	D.	A NumberFormatException is thrown at run time
	
	Answer: C
	
	siehe auch web_32
	https://www.briefmenow.org/oracle/what-is-the-result-956/
*/