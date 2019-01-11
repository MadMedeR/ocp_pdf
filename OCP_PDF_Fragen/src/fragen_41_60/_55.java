package fragen_41_60;


class Alpha {
	int ns;
	static int s;

	Alpha(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}

	void doPrint() {
		System.out.println("ns= " + ns + " s= " + s);
	}
}
public class  _55 {
	public static void main(String[] args) {
		Alpha ref1 = new Alpha(50);
		Alpha ref2 = new Alpha(125);
		Alpha ref3 = new Alpha(100);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	}

}

/*
  A. ns = 50 S = 125 ns = 125 S = 125 ns = 100 S = 125 
  B. ns = 50 S = 125 ns = 125 S = 125 ns = 0 S = 125
  C. ns = 50 S = 50 ns = 125 S = 125 ns = 100 S = 100 
  D. ns = 50 S = 50 ns = 125 S = 125 ns = 0 S = 125
  */

//Answer B
//ns= 50 s= 125
//ns= 125 s= 125
//ns= 0 s= 125
