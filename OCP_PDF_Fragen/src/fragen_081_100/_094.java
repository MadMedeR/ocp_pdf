package fragen_081_100;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class _094 {
	public static void main(String[] args) throws IOException {
		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
		files.forEach (fName -> { //line n1
			try {
				Path aPath = fName.toAbsolutePath(); //line n2
				System.out.println(fName + ":" + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
			} catch (IOException ex) {
				ex.printStackTrace();
			}});
		files.close();
	}
}

/*
	What is the result?
	
	A. All files and directories under the home directory are listed along with their attributes.
	B. A compilation error occurs at line n1.
	C. The files in the home directory are listed along with their attributes.
	D. A compilation error occurs at line n2.
	
	Answer: A
	
	siehe auch web_55
	http://www.briefmenow.org/oracle/what-is-the-result-946/
*/