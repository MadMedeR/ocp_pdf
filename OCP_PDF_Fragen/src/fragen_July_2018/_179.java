package fragen_July_2018;

public class _179 {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int x = array.length;
		/*line n1*/
	}
}

/*
	Which two code fragments can be independently inserted at line n1
	to enable the code to print the elements of the array in reverse order?
	
	A.	while(x > 0) {
			System.out.print(array[--x]);
		}
		
	B.	do {
			x--;
			System.out.print(array[x]);
		} while (x >= 0);
	 
	C.	do {
			System.out.print(array[x]);
			--x;
		} while (x >= 0);
	
	D.	while (x >= 0){
			System.out.print(array[x]);
			x--;
		}
		
	E.	while (x > 0) {
			x--;
			System.out.print(array[x]);
		}
		
	Answer: A,E
*/