package fragen_41_60;

import java.util.function.Supplier;

public class _52 {

}

//Given:
class Bird {
public void fly () { System.out.print("Can fly"); }
}
class Penguin extends Bird {
public void fly () { System.out.print("Cannot fly"); }
}
 // and the code fragment:
class Birdie {
public static void main (String [ ] args) {
fly( ( ) -> new Bird ( ));
fly (Penguin :: new);
}
/* line n1 */
//static void fly (Consumer<Bird> bird) { bird :: fly (); }
//static void fly (Consumer<? extends Bird> bird) { bird.accept( ).fly (); }
static void fly (Supplier<Bird> bird) { bird.get( ).fly (); }
//static void fly (Supplier<? extends Bird> bird) { LOST
}

/*Which code fragment, when inserted at line n1, enables the Birdie class to compile?
 * 
A. static void fly (Consumer<Bird> bird) { bird :: fly (); } 
B. static void fly (Consumer<? extends Bird> bird) { bird.accept( ) fly (); } 
C. static void fly (Supplier<Bird> bird) { bird.get( ) fly (); } 
D. static void fly (Supplier<? extends Bird> bird) { LOST
*/

// https://www.briefmenow.org/oracle/which-code-fragment-when-inserted-at-line-n1-enables-3/   Frage 79 

// Answer C
// code fragment D ist nicht voll !!!!