package fragen_041_60;

public class _46 {}

interface Doable {
	public void doSomething(String s);
}

// Which two class definitions compile? (Choose two.)

//A:
abstract class Task implements Doable {
	public void doSomethingElse(String s) { }
}
//B:
/*abstract class Work implements Doable {
	public abstract void doSomething(String s) { }
	public void doYourThing(Boolean b) { }
}*/
//C:
/*class Job implements Doable {
	public void doSomething(Integer i) { }
}*/
//D:
/*class Action implements Doable {
	public void doSomething(Integer i) {}
	public String doThis(Integer j) {}
}*/
//E:
class Do implements Doable {
	public void doSomething(Integer i) { }
	public void doSomething(String s) { }
	public void doThat(String s) { }
}
 
/*
	Which two class definitions compile? (Choose two.)
	
	A.	public abstract class Task implements Doable {
			public void doSomethingElse(String s) { }
		}
	B.	public abstract class Work implements Doable {
			public abstract void doSomething(String s) { }
			public void doYourThing(Boolean b) { }
		}
	C.	public class Job implements Doable { 
			public void doSomething(Integer i) { } 
		}
	D.	public class Action implements Doable {
			public void doSomething(Integer i) { }
			public String doThis(Integer j) { }
		}
	E.	public class Do implements Doable {
			public void doSomething(Integer i) { } 
			public void doSomething(String s) { } 
			public void doThat (String s) { }
		}

	Answer: A,E
	
	siehe auch web_8
	https://www.briefmenow.org/oracle/which-two-class-definitions-compile/
*/