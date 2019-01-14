package web_31_60;

class Test<T> {
	private T t;
	public T get () {
		return t;
	}
	public void set (T t) {
		this.t = t;
	}
}

@SuppressWarnings({"rawtypes","unchecked"})
public class web_52 {
	public static void main (String args [ ] ) {
		Test<String> type = new Test<>();
		Test type1 = new Test();			//line n1
		type.set("Java");
		type1.set(100);						//line n2
		System.out.print(type.get() + " " + type1.get());
	}
}

/*
	What is the result?

	A.	Java 100
	B.	java.lang.string@<hashcode>java.lang.Integer@<hashcode>
	C.	A compilation error occurs. To rectify it, replace line n1 with:
		Test<Integer> type1 = new Test<>();
	D.	A compilation error occurs. To rectify it, replace line n2 with:
		type1.set (Integer(100)); 

	Answer: A
	
	http://www.briefmenow.org/oracle/what-is-the-result-949/
*/