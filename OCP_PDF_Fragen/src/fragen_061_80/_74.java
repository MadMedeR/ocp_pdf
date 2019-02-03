package fragen_061_80;

@SuppressWarnings("serial")
class MissingInfoException extends Exception {}

@SuppressWarnings("serial")
class AgeOutofRangeException extends Exception {}

class Candidate {
	String name;
	int age;
	Candidate(String name, int age) throws Exception {
		if (name == null) {
			throw new MissingInfoException();
		} else if (age <= 10 || age >=150) {
			throw new AgeOutofRangeException();
		} else {
			this.name = name;
			this.age = age;
		}
	}
	public String toString() {
		return name + " age:" + age;
	}
}

public class _74 {
//	public static void main(String[] args) {					//line 5 original
	public static void main(String[] args) throws Exception {	//line 5 already solved with Answer B
		Candidate c = new Candidate("James", 20);				//line 6
		Candidate c1 = new Candidate("Williams", 32);			//line 7
		System.out.println(c);
		System.out.println(c1);
	}
}

/*
	Which change enables the code to print the following?
	James age: 20
	Williams age: 32
	
	A. Replacing line 5 with:
		public static void main (String [] args) throws MissingInfoException,
		AgeOutofRangeException {
	B. Replacing line 5 with:
		public static void main (String [] args) throws Exception {
	C. Enclosing line 6 and line 7 within a try block and adding:
		catch (Exception e1) { //code goes here}
		catch (missingInfoException e2) { //code goes here}
		catch (AgeOutofRangeException e3) {//code goes here}
	D. Enclosing line 6 and line 7 within a try block and adding:
		catch (missingInfoException e2) { //code goes here}
		catch (AgeOutofRangeException e3) {//code goes here}
	
	Answer: B
*/