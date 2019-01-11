package fragen_020_40;

import java.util.concurrent.SynchronousQueue;

public class _31 extends Root{ // TestA in frage
	public static void main(String[] args) {
		Root r = new _31(); 
		System.out.println(r.method1());
		System.out.println(r.method2());
		
	}

}

class Root{
	private static final int MAX = 20000;
	private int method1() {
		int a = 100 + MAX;   // line n3
		return a;
	}
	protected int method2() {
		int a = 200 + MAX;   //line n4
		return a;
	}
}
/**
Which line causes a compilation error?
A. Line n1
B. Line n2
C. Line n3
D. Line n4


Answer A (private  int)
**/