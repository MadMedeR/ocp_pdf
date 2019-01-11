package fragen_001_20;

public class _09 {

}

class A { } 

class B { } 
interface X { } 
interface Y { } 

  class C extends A implements X { } 
  //class C implements Y extends B { } 
  //class C extends A, B { } 
  //class C implements X, Y extends B { } 
  class C1 extends B implements X, Y { } 

/*
Which two definitions of class C are valid? (Choose two.) 
 
A.  Class C extends A implements X { } 
B.  Class C implements Y extends B { } 
C.  Class C extends A, B { } 
D.  Class C implements X, Y extends B { } 
E.  Class C extends B implements X, Y { } 

*/

//Answer A,E
