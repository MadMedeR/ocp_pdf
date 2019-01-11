package fragen_061_80;

import java.util.ArrayList;
import java.util.List;

interface Contract{ }
class Super implements Contract{ }
class Sub extends Super {}

@SuppressWarnings({ "rawtypes", "unchecked" })
public class _80 {
	public static void main(String[] args) {
		List objs = new ArrayList();
		
		Contract c1 = new Super();
		Contract c2 = new Sub();					// line n1
		Super s1 = new Sub();
		
		objs.add(c1);
		objs.add(c2);
		objs.add(s1);								// line n2
		
		for (Object itm : objs) {
			System.out.println(itm.getClass().getName());
		}
	}
}

/*
	What is the result?
	
	A.	Super
		Sub
		Sub
	B.	Contract
		Contract
		Super
	C.	Compilation fails at line n1
	D.	Compilation fails at line n2
	
	Answer: A
*/
