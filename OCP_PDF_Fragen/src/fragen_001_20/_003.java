package fragen_001_20;

import java.util.function.BiFunction;

public class _003 {
	public static void main(String[] args) {
		BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2;	//line n1
		System.out.println(val.apply(10, 10.5));	//line n2
	}
}
/*
	A. 20
	B. 20.5
	C. A compilation error occurs at line n1
	D. A compilation error occurs at line n2
	
	Answer: C
	
	Explanation:
	Exception in thread "main" java.lang.Error: Unresolved compilation problem
	Type mismatch: cannot convert from double to Integer
 */