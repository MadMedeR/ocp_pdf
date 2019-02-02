package fragen_041_60;

import java.util.Arrays;
import java.util.stream.*;
import java.util.List;

class Student {
	String course, name, city;
	public Student (String name, String course, String city) {
		this.course = course; this.name = name; this.city = city;
	}
	public String toString() {
		return course + ":" + name + ":" + city;
	}
	public String getCourse() {
		return course;
	}
}

public class _53 {
	public static void main(String[] args) {
		List<Student> stds = Arrays.asList(
			new Student ("Jessy", "Java ME", "Chicago"),
			new Student ("Helen", "Java EE", "Houston"),
			new Student ("Mark", "Java ME", "Chicago"));
		 stds.stream()
		 	.collect(Collectors.groupingBy(Student::getCourse))
		 	.forEach((src, res) -> System.out.println(src));
	}
}

/*
	What is the result?
	
	A.	[Java EE: Helen:Houston]
		[Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
	B.	Java EE
		Java ME
	C.	[Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
		[Java EE: Helen:Houston]
	D.	A compilation error occurs
	
	Answer: B
	with small changes in the code: There must be a Getter and change scr to src
	
	siehe auch web_62
	https://www.briefmenow.org/oracle/what-is-the-result-941/
*/