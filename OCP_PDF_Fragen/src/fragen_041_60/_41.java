package fragen_041_60;

public class _41 {

}

//Package Book.java:
public class Book {
	private String read(String bname) {
		return "Read" + bname;
	}
}

//Package EBook.java:
public class EBook extends Book {
	public String read(String url) {
		return "View" + url;
	}
}

//Package Test.java:
public class Test {
public static void main (String[] args) {
Book b1 = new Book();
b1.read("Java Programing");
Book b2 = new EBook();
b2.read(“http://ebook.com/ebook”);
}
}

/*What is the result?
A. Read Java Programming View http://ebook.com/ebook
 B. Read Java Programming Read http://ebook.com/ebook
  C. The EBook.java file fails to compile 
  D. The Test.java file fails to compile*/


// Answer D. The Test.java file fails to compile  (The method read(String) from the type Book is not visible)