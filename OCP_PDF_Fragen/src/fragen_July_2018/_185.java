package fragen_July_2018;

public class _185 {
	public static void main(String[] args) {
		boolean a = new Boolean(Boolean.valueOf(args[0]));
		boolean b = new Boolean(args[1]);
		System.out.println(a + " "+ b);
	}
}

/*
	And given the commands:
	javac _185.java
	java _185 TRUE null
	
	
	What is the result?
	
	A. true false
	B. false false
	C. A ClassCastException is thrown at runtime
	D. TRUE null E. true true
	
	Answer: A
*/