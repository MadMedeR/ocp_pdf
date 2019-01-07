package fragen_101_End;

 interface Moveable<Integer> {
public default void walk (Integer distance) {System.out.println("Walking");}
public void run(Integer distance);
}

public class _112 {
public static void main(String[] args) {
//	Moveable<Integer> animal = n -> System.out.println("Running" + n);
//	animal.run(100);
//	animal.walk(20);
	
// Moveable<Integer> animal = n -> n + 10; animal.run(100); animal.walk(20);
	
//	Moveable animal = (Integer n) -> System.out.println(n); 
//	animal.run(100);
//	Moveable.walk(20);	
	
	
	
}
}

// Answer A:  	Running100
// 				Walking

//Answer B:   Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
// Void methods cannot return a value

// Answer C: Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//Lambda expression's parameter n is expected to be of type Object
// Moveable ist generisch Interface wann Moveable dann es ist Moveable<Object> und 
// Lambda soll Moveable animal = (Object  n) -> System.out.println(n); 
// oder Moveable<?> animal = (Integer n) -> System.out.println(n);  sehen


// D ist falsch weil A ist richtig :).