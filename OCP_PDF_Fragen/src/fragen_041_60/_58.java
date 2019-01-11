package fragen_041_60;

public class _58 {
public static void main(String[] args) {
	String color ="teal";
	switch (color) {
	case "Red":
		System.out.println("Found Red");
	case "Blue":
		System.out.println("Found Blue");
	case "Teal":
		System.out.println("Found Teal");
	default:
		System.out.println("Found Default");
	}
}
}

/*
 What is the result?
 
A. Found Red Found Default 
B. Found Teal
 C. Found Red Found Blue Found Teal 
 D. Found Red Found Blue Found Teal Found Default 
 E. Found Default
 */

//Answer E  Found Default