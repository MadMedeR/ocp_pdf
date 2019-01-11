package fragen_041_60;

public class _51 {

}

/*
 Given:
1. abstract class Shape {
2. Shape ( ) { System.out.println (“Shape”); }
3. protected void area ( ) { System.out.println (“Shape”); }
4. }
5.
6. class Square extends Shape {
7. int side;
8. Square int side {
9.// insert code here 
10. this.side = side;
11. }
12. public void area ( ) { System.out.println (“Square”); }
13. }
14. class Rectangle extends Square {
15. int len, br;
16. Rectangle (int x, int y) {
17. // insert code here 
18. len = x, br = y;
19. }
20. void area ( ) { System.out.println (“Rectangle”); }
21. }
*/

/*Which two modifications enable the code to compile? (Choose two.)

A. At line 1, remove: abstract 
B. At line 9, insert: super ( ); 
C. At line 12, remove: public 
D. At line 17, insert: super (x); 
E. At line 17, insert: super (); super.side = x;
F. At line 20, use: public void area ( ) {
*/




abstract class Shape {
 Shape ( ) { System.out.println ("Shape"); }
 protected void area ( ) { System.out.println ("Shape"); }
 }

 class Square extends Shape {
 int side;
 Square (int side) {
/* insert code here */
 this.side = side;
 }
 public void area ( ) { System.out.println ("Square"); }
 }
 class Rectangle extends Square {
 int len, br;
 Rectangle (int x, int y) {
 /* insert code here */
	 super (x);   // D!
 len = x; br = y;
 }
 public void area ( ) { System.out.println ("Rectangle"); }  //F!!
 }
 
 // Answer D. At line 17, insert super (x);     F. At line 20, use public void area ( ) {
 //https://www.briefmenow.org/oracle/which-two-modifications-enable-the-code-to-compile/  Frage 78
 
 
 
 