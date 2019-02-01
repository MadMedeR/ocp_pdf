package fragen_020_40;

public class _25 {
}

class ScopeTest {
	int j, k;

	public static void main(String[] args) {
		new ScopeTest().doStuff();
	}

	void doStuff() {
		int x = 5;
		doStuff2();
		System.out.println("x");
	}

	void doStuff2() {
		int y = 7;
		System.out.println("y");
		for (int z = 0; z < 5; z++) {
			System.out.println("z");
			System.out.println("y");
		}
	}
}
 /*
	Which two items are fields? (Choose two.)
		
	A. j
	B. k
	C. x
	D. y
	E. z
	
	Answer: A,B
 */