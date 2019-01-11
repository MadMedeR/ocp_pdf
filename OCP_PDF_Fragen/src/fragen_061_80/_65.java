package fragen_061_80;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@SuppressWarnings("resource")
public class _65 {
	public static void main(String[] args) throws IOException {
		Path file = Paths.get("courses.txt");
		//line n1 //already solved with D
		Stream<String> fc = Files.lines(file);
		fc.forEach (s -> System.out.println(s));
	}	
}

/*
	Assume the courses.txt is accessible.
	Which code fragment can be inserted at line n1 to enable the code to print the content of the courses.txt file?
	
	A.	List<String> fc = Files.list(file);					|Notice Max: public static Stream<Path> list(Path dir) throws IOException
		fc.stream().forEach (s -> System.out.println(s));
	B.	Stream<String> fc = Files.readAllLines(file);		|Notice Max: public static List<String> readAllLines(Path path) throws IOException
		fc.forEach (s -> System.out.println(s));
	C.	List<String> fc = readAllLines(file);				|Notice Max: Files. is missing
		fc.stream().forEach (s -> System.out.println(s));
	D.	Stream<String> fc = Files.lines(file);
		fc.forEach (s -> System.out.println(s));
		
	Answer: D 
*/