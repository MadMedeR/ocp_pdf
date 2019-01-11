package fragen_020_40;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _21 {
public static void main(String[] args) {
	List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen");
			Predicate<String> test = s -> {
			int i = 0;
			boolean result = s.contains ("pen");
			System.out.print(i++ + ":");
			return result;
			};
			str.stream()
			.filter(test)
			.findFirst()
			.ifPresent(System.out ::print);
}
}
//What is the result?
//A. 0 : 0 : pen
//B. 0 : 1 : pen
//C. 0 : 0 : 0 : 0 : 0 : pen
//D. 0 : 1 : 2 : 3 : 4 : pen
//E. A compilation error occurs

// Answer A when correct line 13 from System.out.print(i++) + ":");