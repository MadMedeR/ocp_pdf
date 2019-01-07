package fragen_July_2018;


class Student{
	String name;
	public Student (String name) {
		this.name=name;
	}
}
public class _182 {
public static void main(String[] args) {
	Student[] students = new Student[3];
	students[1]= new Student("Richard");
	students[2]= new Student("Donald");
	for (Student s : students) {
		System.out.println("" +s.name);
	}
}
}


/*
  What is the result?
  
A. An ArrayIndexOutOfBoundsException is thrown at runtime

 B. Richard Donald 
 
 C. A NullPointerException is thrown at runtime
 
  D. Compilation fails E. null Richard Donald
 */


// Answer: C. A NullPointerException is thrown at runtime

//Exception in thread "main" java.lang.NullPointerException
//at fragen_July_2018._182.main(_182.java:16)
