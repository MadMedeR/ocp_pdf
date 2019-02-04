package fragen_July_2018;

interface Downloadable {
	public void download();
}

interface Readable extends Downloadable {  // line n1
	public void readBook();
}

abstract class Book implements Readable {  // line n2
	public void readBook() {
		System.out.println("Read Book");
	}
}

class EBook extends Book {   //line n3
	public void readBook() {
		System.out.println("Read E-Book");
	}
}

public class _181 {
	public static void main(String[] args) {
		Book book1 = new EBook();
		book1.readBook();
	}
}

/*
	What is the result?
	
	A. Compilation fails at line n2
	B. Read E-Book
	C. Compilation fails at line n1
	D. Compilation fails at line n3
	E. Read Book
	
	Answer: D
*/