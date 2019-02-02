package fragen_041_60;

import java.util.function.Supplier;

class Bird {
	public void fly () { System.out.print("Can fly"); }
}

class Penguin extends Bird {
	public void fly () { System.out.print("Cannot fly"); }
}

public class _52 { //Birdie
	public static void main (String [ ] args) {
		fly( ( ) -> new Bird ( ));
		fly (Penguin :: new);
	}
	//line n1 already solved with C:
	static void fly (Supplier<Bird> bird) { bird.get().fly();}
}

/*
	Which code fragment, when inserted at line n1, enables the Birdie class to compile?
	
	A. static void fly (Consumer<Bird> bird) { bird::fly(); } 
	B. static void fly (Consumer<? extends Bird> bird) { bird.accept().fly(); } 
	C. static void fly (Supplier<Bird> bird) { bird.get().fly(); } 
	D. static void fly (Supplier<? extends Bird> bird) { LOST
	
	Answer: C (could also be D but code is missing)
	
	siehe auch web_79
	https://www.briefmenow.org/oracle/which-code-fragment-when-inserted-at-line-n1-enables-3/
*/