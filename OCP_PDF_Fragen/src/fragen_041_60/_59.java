package fragen_041_60;

public class _59 {
	static void dispResult(int[] num) {
		try {
			System.out.println(num[1] / (num[1] - num[2]));
		} catch (ArithmeticException e) {
			System.err.println("first exception");
		}
		System.out.println("Done");
	}

	public static void main(String[] args) {
		try {
			int[] arr = { 100, 100 };
			dispResult(arr);
		} catch (IllegalArgumentException e) {
			System.err.println("second exception");
		} catch (Exception e) {
			System.err.println("third exception");
		}
	}
}

/*
	What is the result?
	
	A. 0 Done
	B. First Exception Done
	C. Second Exception
	D. Done Third Exception 
	E. Third Exception

	Answer: E
	
*/