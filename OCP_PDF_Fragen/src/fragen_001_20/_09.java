package fragen_001_20;

public class _09 {}

class A { } 
class B { } 
interface X { } 
interface Y { } 

//	Which two definitions of class C are valid? (Choose two.)
	class Ca extends A implements X { }		//A
//	class Cb implements Y extends B { }		//B
//	class Cc extends A, B { }				//C
//	class Cd implements X, Y extends B { }	//D
	class Ce extends B implements X, Y { }	//E

//	Answer: A,E