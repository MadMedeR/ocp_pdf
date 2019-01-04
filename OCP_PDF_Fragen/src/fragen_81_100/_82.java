package fragen_81_100;
/*
	The protected modifier on a Field declaration within a public class means that the field ____.

	A. cannot be modified
	B. can be read but not written from outside the class
	C. can be read and written from this class and its subclasses only within the same package
	D. can be read and written from this class and its subclasses defined in any package
 */
public class _82 {
	protected static Integer I82;
	
	public static void main(String[] args) {
		new Outside();
		new Inside();
		System.out.println(I82);
	}
}

class Inside extends _82 {
	Inside() {
		I82 = 8;
		System.out.println(I82);
	}
}

class Outside {
	Outside() {
		_82.I82 = 2;
		System.out.println(_82.I82);
	}
}






//	Richtige Antwort: D