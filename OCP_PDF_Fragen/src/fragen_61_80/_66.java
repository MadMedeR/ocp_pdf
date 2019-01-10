package fragen_61_80;

public class _66 {}

@SuppressWarnings("unused")
abstract class Shape {
	private int x;
	private int y;
	public abstract void draw();
	public void setAnchor(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// Which two classes use the shape class correctly? (Choose two.) 
/*A)
class CircleA implements Shape {
	private int radius;
}
*/
//B)
@SuppressWarnings("unused")
abstract class CircleB extends Shape {
		private int radius;
}

/*C)
class CircleC extends Shape {
	private int radius;
	public void draw();
}
*/
/*D)
abstract class CircleD implements Shape {
	private int radius;
	public void draw();
}
*/
//E)
@SuppressWarnings("unused")
class CircleE extends Shape {
	private int radius;
	public void draw() {/* code here */}
}

/*F)
abstract class CircleF implements Shape {
	private int radius;
	public void draw() {/ code here /}
}
*/

/*
	A. Option A
	B. Option B 
	C. Option C 
	D. Option D 
	E. Option E 
	F. Option F 

	Answer: BE
*/