package fragen_061_80;

interface Z {}

class X implements Z {
	public String toString() {
		return "X ";
	}
}

public class _72 {
	public static void main(String[] args) {
		Y myY = new Y();
		X myX = myY;
		Z myZ = myX;
		System.out.println(myX);
		System.out.println((Y)myX);
		System.out.println(myZ);
	}
}

class Y extends X {
	public String toString() {
		return "Y ";
	}
}

/*
	What is the result?
	
	A. X X X
	B. X Y X
	C. Y Y X
	D. Y Y Y
	
	Answer: D
*/