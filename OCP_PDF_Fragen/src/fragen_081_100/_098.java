package fragen_081_100;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _098 {
	public static void main(String[] args) {
		Path p1 = Paths.get("Pics/MyPic.jpeg");
		System.out.println (p1.getNameCount() +
		":" + p1.getName(1) + 
		":" +	p1.getFileName());
	}
}


/*
	Assume that the Pics directory does NOT exist.
	What is the result?
	
	A. An exception is thrown at run time
	B. 2:MyPic.jpeg:MyPic.jpeg
	C. 1:Pics:/Pics/MyPic.jpeg
	D. 2:Pics:MyPic.jpeg
	
	Answer: B
*/