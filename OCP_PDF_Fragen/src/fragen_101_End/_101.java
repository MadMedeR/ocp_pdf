package fragen_101_End;

public class _101 {

public static void main (String[] args) {
int rateOfInterest = 0;
String accountType = "LOAN";
switch (accountType) {
case "RD": 
	rateOfInterest = 5;
break;
case  "FD":
	rateOfInterest = 10;
break;
default:
assert false: "No interest for this account";//line n1
}
System.out.println ("Rate of interest:" + rateOfInterest);
}
}


// Answer B : Assertion error is thrown