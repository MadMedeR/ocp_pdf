package fragen_1_20;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class _20 {
public static void main(String[] args) {
	UnaryOperator<Integer> uo1 = s -> s*2;//line n1 
	List<Double> loanValues = Arrays.asList(1000.0, 2000.0); 
	loanValues.stream() 
	.filter(lv -> lv >= 1500) 
	.map(lv -> uo1.apply(lv)) 
	.forEach(s -> System.out.print(s + " "));//line n2 
}
}


//https://www.briefmenow.org/oracle/what-is-the-result-965/
//Frage 17

//Answer D The method apply(Integer) in the type Function<Integer,Integer> is not applicable for the arguments (Double)