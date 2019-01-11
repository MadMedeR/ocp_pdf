package fragen_001_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _08 {
	public static void main(String[] args) {
		List<TechName> tech = Arrays.asList(new TechName("Java-"), 
				new TechName("Oracle DB-"),
				new TechName("J2EE-"));
		Stream<TechName> stre = tech.stream();
		// stre.forEach(System.out::print);
		stre.map(a -> a.techName).forEach(System.out::print);
		// stre.map(a-> a).forEachOrdered(System.out::print);
		// stre.forEachOrdered(System.out::print);
		
	}
}

class TechName {
	String techName;

	TechName(String techName) {
		this.techName = techName;
	}
}

/*
Which should be inserted at line n1 to print Java-Oracle DB-J2EE-? 

A.  stre.forEach(System.out::print); 
B.  stre.map(a-> a.techName).forEach(System.out::print); 
C.  stre.map(a-> a).forEachOrdered(System.out::print); 
D.  stre.forEachOrdered(System.out::print); 
*/

//https://www.briefmenow.org/oracle/which-should-be-inserted-at-line-n1-to-print-java-oracl/
// Frage 10

//Answer B   stre.map(a -> a.techName).forEach(System.out::print);