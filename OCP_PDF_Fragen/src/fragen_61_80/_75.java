package fragen_61_80;

class X_ {
	public void mX() {
		System.out.println("Xm1");
	}
}

class Y_ extends X_ {
	public void mX() {
		System.out.println("Xm2");
	}
	public void mY() {
		System.out.println("Ym");
	}
}

public class _75 {
	public static void main(String[] args) {
		X_ xRef = new Y_();
		Y_ yRef = (Y_) xRef;
		yRef.mY();
		xRef.mX();
	}
}

/*
	What is the result?
	
	A.	Ym
		Xm2
	B.	Ym
		Xm1
	C.	Compilation fails
	D.	A ClassCastException is thrown at runtime
	
	Answer: A
*/