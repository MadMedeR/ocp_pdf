package fragen_061_80;

import java.util.function.ToIntFunction;

public class _64 {
	public static void main(String[] args) {
		String str = "Java is a programming language";
		ToIntFunction<String> indexVal = str::indexOf;	//line n1
		int x = indexVal.applyAsInt("Java");			//line n2
		System.out.println(x);
	}
}

/*
	What is the result?
	
	A. 0
	B. 1
	C. A compilation error occurs at line n1
	D. A compilation error occurs at line n2
	
	Answer: A 
*/