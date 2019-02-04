package fragen_July_2018;

public class _186 {
	public static void main(String[] args) {
		int numbers[];
		numbers = new int[2];
		numbers[0] = 10;
		numbers[1] = 20;
		
		numbers = new int[4];
		numbers[2] = 30;
		numbers[3] = 40;
		for (int x : numbers) {
			System.out.print(" " + x);
		}
	}
}

/*
	What is the result?
	
	A. 0 0 30 40
	B. An exception is thrown at runtime
	C. Compilation fails
	D. 10 20 30 40
	
	Answer: A
*/