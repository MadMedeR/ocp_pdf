package web_31_60;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class web_40_new {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList (10, 20, 8);
		System.out.println (
			//line n1
			nums.stream().max(Comparator.comparing(a -> a)).get() // already solved with Answer A
		);
	}
}

/*
	Which code fragment must be inserted at line n1 to enable the code to print the maximum number in the nums list?

	A. nums.stream().max(Comparator.comparing(a -> a)).get()
	B. nums.stream().max(Integer::max).get()
	C. nums.stream().max()
	D. nums.stream().map(a -> a).max()
	
	Answer: A
	http://www.briefmenow.org/oracle/which-code-fragment-must-be-inserted-at-line-n1-to-enab/
*/