package fragen_101_End;

public class _107 {
int fvar;
static int cvar;
public static void main(String[] args) {
	_107 t = new _107();
		//	t.fvar = 200;
		//	cvar = 400;
	
//  fvar = 200; cvar = 400;
	
//	this.fvar = 200; this.cvar = 400;
	
	t.fvar = 200; _107.cvar = 400;
	
//	this.fvar = 200; Test2.cvar = 400;	
}
}


// A, B E Compiles

// C Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
// Cannot make a static reference to the non-static field fvar

//D Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
// Cannot use this in a static context
// Cannot use this in a static context

// E

//F Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//Cannot use this in a static context
//Test2 cannot be resolved to a variable