
package fragen_001_20;

import java.util.Arrays;
import java.util.List;

public class _04 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3);
		values.stream()
			.map(n -> n*2) //line n1
			.peek(System.out::print)//line n2
			.count();
	}
}

/*
	What is the result?
	
	A. 246 
	B. The code produces no output 
	C. A compilation error occurs at line n1 
	D. A compilation error occurs at line n2
	
	Answer: A
	
	Explanation:
	values.stream() method from Collections which gives stream
	then
	.map <R> Stream<R> map(Function<? super T,? extends R> returns a stream consisting
		of the results of applying the given function to the elements of this stream. 
	then
	.peek print stream for every n 
	then
	we have count which gives long amount of elements(3) but not saved anywhere and not printed
		but without count() as the terminal operation there would be no system.out.print of .peek!!!
 */