package fragen_041_60;

public class _45 {
	public static void main(String[] args) {
		//A:
		Object[] enhanced = new Object[1];
		for (Object o:enhanced) {System.out.println("A true " + o);}
		//B:
		int i=0;
		for(;i<1;i++) {System.out.println("B true");}
		//C and D:
		for(;i==0;) {System.out.println("C and D false");}
	}
}

/*
	Given the for loop construct:
	for ( expr1 ; expr2 ; expr3 ) {
		statement;
	}
	
	Which two statements are true? (Choose two.)
	
	A. This is not the only valid for loop construct; there exits another form of for loop constructor.
	B. The expression expr1 is optional. It initializes the loop and is evaluated once, as the loop begin.
	C. When expr2 evaluates to false, the loop terminates. It is evaluated only after each iteration through the loop.
	D. The expression expr3 must be present. It is evaluated after each iteration through the loop.
 
 */

//https://www.briefmenow.org/oracle/which-two-statements-are-true-42/  
// exam 1Z0-803 (v.1)  Frage 93
//Answer AB ??