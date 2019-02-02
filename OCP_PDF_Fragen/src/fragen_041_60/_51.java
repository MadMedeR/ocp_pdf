package fragen_041_60;

public class _51 {}

abstract class Shape {											//line 1
	Shape() { System.out.println ("Shape"); }
	protected void area ( ) { System.out.println ("Shape"); }
}

class Square extends Shape {
	int side;
	Square (int side) {
		/* insert code here */									//line 9
		this.side = side;
	}
	public void area () { System.out.println ("Square"); }		//line 12
}
class Rectangle extends Square {
	int len, br;
	Rectangle (int x, int y) {
		super (x);/* insert code here */						//line 17 already solved with D
		len = x; br = y;
	}
	public void area ( ) { System.out.println ("Rectangle"); }  //line 20 already solved with F
}

/*
	Which two modifications enable the code to compile? (Choose two.)
	
	A. At line 1, remove: abstract 
	B. At line 9, insert: super ( ); 
	C. At line 12, remove: public 
	D. At line 17, insert: super (x); 
	E. At line 17, insert: super (); super.side = x;
	F. At line 20, use: public void area ( ) {
	
	Answer: D,F
	
	siehe auch web_78
	https://www.briefmenow.org/oracle/which-two-modifications-enable-the-code-to-compile/
*/