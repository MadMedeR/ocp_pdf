package fragen_001_20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _14 {
public static void main(String[] args) {
	List<Emp> emp = Arrays.asList ( 
			new Emp ("John", "Smith"), 
			new Emp ("Peter", "Sam"), 
			new Emp ("Thomas", "Wale")); 
			emp.stream()
			.sorted (Comparator.comparing(Emp::getfName).reserved()/*reversed()*/.thenComparing(Emp::getlName))
			//line n1 
			.collect(Collectors.toList()); 
}
}

 class Emp { 
String fName; 
String lName; 
public Emp (String fn, String ln) { 
fName = fn; 
lName = ln; 
} 
public String getfName() { return fName; } 
public String getlName() { return lName; } 
} 
 
 
 /*
   Which code fragment, when inserted at line n1, sorts the employees list in descending order of 
fName and then ascending order of lName? 
 
A.  .sorted(Comparator.comparing(Emp::getfName).reserved().thenComparing(Emp::getlName
)) 
B.  .sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName)) 
C.  .map(Emp::getfName).sorted(Comparator.reserveOrder()) 
D.  .map(Emp::getfName).sorted(Comparator.reserveOrder().map(Emp::getlName).reserved 
  */
 
 
 // https://www.briefmenow.org/oracle/which-code-fragment-when-inserted-at-line-n1-sorts-th/
 //Frage 60
 // Answer A (see comments)
