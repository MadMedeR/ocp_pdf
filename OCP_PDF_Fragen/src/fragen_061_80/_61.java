package fragen_061_80;

public class _61 {
	public static String doMsg(char x) {
		return "Good Day!";
	}
	public static String doMsg(int y) {
		return "Good Luck!";
	}
	public static void main(String[] args) {
		char x = 8;
		int z = '8';
		System.out.println(doMsg(x));
		System.out.println(doMsg(z));
	}
}

/*
	What is the result? 
	
	A.	Good Day! 
		Good Luck! 
	B.	Good Day! 
		Good Day! 
	C.	Good Luck! 
		Good Day! 
	D.	Good Luck! 
		Good Luck! 
	E.	Compilation fails
	
	Answer: A
*/