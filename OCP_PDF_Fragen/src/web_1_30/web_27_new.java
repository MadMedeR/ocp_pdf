package web_1_30;

import java.util.Arrays;
import java.util.List;

public class web_27_new {
    public static void main(String[] args) {
    	List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG");
    	codes.forEach(c -> System.out.print(c + " "));
    	String fmt = codes.stream()
    					.filter (s -> s.contains("PEG"))
    					.reduce((s, t) -> s + t)
    					.get();
    	System.out.println("\n" + fmt);
	}
}

/*
	What is the result?
	
	A.	DOC MPEG JPEG
		MPEGJPEG
	
	B.	DOC MPEG MPEGJPEG
		MPEGMPEGJPEG
	
	C.	MPEGJPEG
		MPEGJPEG
	
	D.	The order of the output is unpredictable. 
	
	Answer: A
 */