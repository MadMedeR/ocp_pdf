package fragen_001_20;

import java.util.List;
import java.util.ArrayList;

class Alpha {
	public String doStuff(String msg) {
		return msg;
	}
}
class Beta extends Alpha {
	public String doStuff(String msg) {
		return msg.replace('a', 'e');
	}
}
class Gamma extends Beta{
	public String doStuff(String msg) {
		return msg.substring(2);
	}
}
public class _002 {
	public static void main(String[] args) {
		List<Alpha> strs = new ArrayList<>();
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		for (Alpha t : strs) {
			System.out.println(t.doStuff("Java"));
		}
	}
}

/*
	What is the result?
	
	A.	Java
		Java
		Java
	B.	Java
		Jeve
		va
	C.	Java
		Jeve
		ve
	D.	Compilation fails
	
	Answer: B
 */