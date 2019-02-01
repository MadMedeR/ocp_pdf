package fragen_081_100;

public class _097 {
	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
		SampleClass sc = new SampleClass();
		sc = asc;
		System.out.println("sc: " + sc.getClass());
		System.out.println("asc: " + asc.getClass());
	}
}

class SampleClass {
}

class AnotherSampleClass extends SampleClass { 
}

/*
	What is the result?
	
	A.	sc: class Object 
		asc: class AnotherSampleClass 
	B.	sc: class SampleClass 
		asc: class AnotherSampleClass 
	C.	sc: class AnotherSampleClass 
		asc: class SampleClass 
	D.	sc: class AnotherSampleClass 
		asc: class AnotherSampleClass
	
	Answer: D
*/