package fragen_081_100;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _092 {
	public static void main(String[] args) {
		Stream<Path> paths = Stream.of(Paths.get("data.doc"), Paths.get("data.txt"), Paths.get("data.xml"));
		paths.filter(s -> s.toString().endsWith("txt")).forEach(s -> {
			try {
				Files.readAllLines(s)
				.stream()
				.forEach(System.out::println);
				//line n1
			} catch (IOException e) {
				System.out.println("Exception");
			} 
		});
	}
}

/*
	The data.doc, data.txt and data.xml files are accessible and contain text. Given the code fragment:
	What is the result?
	
	A. The program prints the content of data.txt file
	B. The program prints:
		Exception
		<<The content of the data.txt file>>
		Exception
	C. A compilation error occurs at line n1
	D. The program prints the content of the three files
	
	Answer: A
	
	siehe auch web_36:
	http://www.briefmenow.org/oracle/what-is-the-result-955/
*/