package fragen_1_20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class _001 {
public static void main(String[] args) throws IOException {
	Path source = Paths.get("green.txt");
	Path target = Paths.get("colors/yellow.txt");
	if (!Files.exists(source)) Files.createFile(source);
	Files.
	Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
	Files.delete(source);
}
}
/**
Which statement is true?
A. The green.txt file content is replaced by the yellow.txt file content and the yellow.txt file is deleted.
B. The yellow.txt file content is replaced by the green.txt file content and an exception is thrown. 
C. The file green.txt is moved to the /colors directory. 
D. A FileAlreadyExistsException is thrown at runtime.
**/

// B  exception kommt von delete ( es gibt keine yellow mehr um zu löschen)