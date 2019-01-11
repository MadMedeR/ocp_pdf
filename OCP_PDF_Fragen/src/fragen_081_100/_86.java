package fragen_081_100;

public class _86 {
	@SuppressWarnings("unused")
	public static void main(String[] args) { 
		int[] array = {1,2,3}; 
		//for ( foo ) {}
		for ( int i: array ) {}
		for ( int i = 0; i < 1; i++ ) {}
		for ( ;; ) {}
		//for ( ; i < 1; i++ ) {}
		//for ( ; i < 1; ) {}
	} 
}

/*
	Which three are valid replacements for ( foo ) so that the program will compiled and run? (Choose three.)

	A. int i: array
	B. int i = 0; i < 1; i++
	C. ;;
	D. ; i < 1; i++
	E. ; i < 1;

	Richtige Antwort: ABC
*/