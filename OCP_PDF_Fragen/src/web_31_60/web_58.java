package web_31_60;

class ImageScanner implements AutoCloseable {
	public void close () throws Exception {
		System.out.print ("Scanner closed.");
	}
	public void scanImage () throws Exception {
		System.out.print ("Scan.");
		throw new Exception("Unable to scan.");
	}
}

class ImagePrinter implements AutoCloseable {
	public void close () throws Exception {
		System.out.print ("Printer closed.");
	}
	public void printImage () {
		System.out.print("Print.");
	}
}

public class web_58 {
	public static void main(String[] args) {
		try (ImageScanner ir = new ImageScanner();
				ImagePrinter iw = new ImagePrinter()) {
			ir.scanImage();
			iw.printImage();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}

/*
	What is the result?
	
	A.	Scan.Printer closed.Scanner closed.Unable to scan.
	B.	Scan.Scanner closed.Unable to scan.
	C.	Scan.Unable to scan.
	D.	Scan.Unable to scan.Printer closed.
	
	Answer: A
	
	http://www.briefmenow.org/oracle/what-is-the-result-943/
	
*/