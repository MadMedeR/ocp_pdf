package web_61_85;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class web_84 {
	public static void main(String[] args) {
		IntStream stream = IntStream.of (1,2,3);
		IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;  //line n1
		IntStream newStream = stream.map(inFu.apply(10)); //line n2
		newStream.forEach(System.out::print);
	}
}

// Which modification enables the code fragment to compile?

// A. Replace line n1 with:
//    IntFunction<UnaryOperator> inFu = x -> y -> x*y;

//B.  Replace line n1 with:
//    IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;

//C.  Replace line n1 with:
//    BiFunction<IntUnaryOperator> inFu = x -> y -> x*y; 

// D.Replace line n2 with:
// IntStream newStream = stream.map(inFu.applyAsInt (10));

// Answer B