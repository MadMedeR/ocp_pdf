package fragen_61_80;

class Caller {
	private void init() {
		System.out.println("Initialized");
	}
	
	public void start() {
		init();
		System.out.println("Started");
	}
}

public class _76 {
	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		//c.init(); // already solved; method init() is not visible!
	}
}

/*
	What is the result?
	
	A.	Initialized
		Started
	B.	Initialized
		Started
		Initialized
	C.	Compilation fails
	D.	An exception is thrown at runtime
	
	Answer: C 
*/