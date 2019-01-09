
package fragen_1_20;

import java.util.Arrays;
import java.util.List;

public class _004 {
public static void main(String[] args) {
	List<Integer>values =Arrays.asList(1,2,3);
	values.stream()
	.map(n -> n*2) //line n1
	.peek(System.out::print)//line n2
	.count();
	
Stream
	
	System.out.println(l);

/**
 * What is the result?
A. 246 
B. The code produces no output 
C. A compilation error occurs at line n1 
D. A compilation error occurs at line n2
 * 	
 * Answer A  246   (values.stream method from Collections 
 * which gives stream then
	<R> Stream<R> map(Function<? super T,? extends R> mapper) 
	Returns a stream consisting of the results of applying the given function to the elements of this stream. 
 * then
 * .peek print  stream for every n 
 * then we have count which gives long amount of elements(3) but not saved anywhere and not printed 
 * 
 */
}
}
