package fragen_101_End;

class Test2 {
	int fvar;
	static int cvar;
}

public class _107 {
	int fvar;
	static int cvar;
	public static void main(String[] args) {
		Test2 t = new Test2();
		// insert code here to write field variables

//		Which code fragments, inserted independently, enable the code compile?
//		A:
		t.fvar = 200;
		
//		B:
		cvar = 400;
		
//		C:
/*		fvar = 200;	Cannot make a static reference to the non-static field fvar
		cvar = 400;
 		*/		
//		D:
/*		this.fvar = 200; Cannot use this in a static context
		this.cvar = 400; Cannot use this in a static context
 		*/
//		E:
		t.fvar = 200;
		Test2.cvar = 400;
//		F:	
/*		this.fvar = 200;	Cannot use this in a static context
		Test2.cvar = 400;
*/	
	}
}

/*
	Which code fragments, inserted independently, enable the code compile?
	
	A.	t.fvar = 200;
	B.	cvar = 400;
	C.	fvar = 200;
		cvar = 400;
	D.	this.fvar = 200;
		this.cvar = 400;
	E.	t.fvar = 200;
		Test2.cvar = 400;
	F.	this.fvar = 200;
		Test2.cvar = 400;
		
	Answer: A,B,E
 */