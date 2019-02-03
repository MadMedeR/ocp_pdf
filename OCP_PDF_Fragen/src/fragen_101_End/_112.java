package fragen_101_End;

interface Moveable<Integer> {
	public default void walk (Integer distance) {System.out.println("Walking");}
	public void run(Integer distance);
}

public class _112 {
	public static void main(String[] args) {
		//Which Statement is true?
		
//		A. Moveable can be used as below:
		Moveable<Integer> animalA = n -> System.out.println("Running" + n);
		animalA.run(100);
		animalA.walk(20);
		
//		B. Moveable can be used as below:
/*		Moveable<Integer> animalB = n -> n + 10;
		animalB.run(100);
		animalB.walk(20);	*/
		
//		C. Moveable can be used as below:
/*		Moveable animalC = (Integer n) -> System.out.println(n); 
		animalC.run(100);
		Moveable.walk(20);	*/
		
//		D. Moveable cannot be used in a lambda expression
	}
}

/*		Richtige Antwort: A

		Explanations:
		B does not compile: Void methods cannot return a value

		C does not compile: Lambda expression's parameter n is expected to be of type Object
			Weil Moveable ein generisches Interface ist, steht der Aufruf
			Moveable für Moveable<Object>. Lambda müsste so aussehen:
			Moveable animal = (Object  n) -> System.out.println(n); oder
			Moveable<?> animal = (Integer n) -> System.out.println(n);
*/