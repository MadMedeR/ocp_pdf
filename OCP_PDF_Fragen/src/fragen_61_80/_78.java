package fragen_61_80;

public class _78 {
	public static void main(String[] args) {
		int ar1[] = {2, 4, 6, 8};
		int ar2[] = {1, 3, 5, 7, 9};
		ar2 = ar1;
		for (int e2 : ar2) {
			System.out.print(" " + e2);
		}
	}
}

/*
	What is the result?
	
	A. 2 4 6 8
	B. 2 4 6 8 9
	C. 1 3 5 7
	D. 1 3 5 7 9
	
	Answer: A
*/