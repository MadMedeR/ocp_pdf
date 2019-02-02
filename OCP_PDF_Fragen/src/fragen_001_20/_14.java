package fragen_001_20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	String fName;
	String lName;
	
	public Emp (String fn, String ln) {
		fName = fn;
		lName = ln;
	}
	public String getfName() {return fName;}
	public String getlName() {return lName;}	
}

public class _14 {
	public static void main(String[] args) {
		List<Emp> emp = Arrays.asList (
				new Emp ("John", "Smith"),
				new Emp ("Peter", "Sam"),
				new Emp ("Thomas", "Wale")
		);
		emp.stream()
		//line n1
		.sorted (Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName)) // already solved with Answer A
		.collect(Collectors.toList());
	}
}
 
 /*
	Which code fragment, when inserted at line n1, sorts the employees list in descending order of 
	fName and then ascending order of lName? 
 
	A.  .sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName)) 
	B.  .sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName)) 
	C.  .map(Emp::getfName).sorted(Comparator.reverseOrder()) 
	D.  .map(Emp::getfName).sorted(Comparator.reverseOrder().map(Emp::getlName).reversed()
	
	Answer: A (see comments)
	
	siehe auch web_60
	https://www.briefmenow.org/oracle/which-code-fragment-when-inserted-at-line-n1-sorts-th/
  */