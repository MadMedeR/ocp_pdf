package fragen_41_60;

import java.util.Arrays;
import java.util.List;

public class _53 {
public static void main(String[] args) {
	List<Student> stds = Arrays.asList(
			new Student ("Jessy", "Java ME", "Chicago"),
			new Student ("Helen", "Java EE", "Houston"),
			new Student ("Mark", "Java ME", "Chicago"));
	        stds.stream()
			.collect(Collectors.groupingBy(Student::getCourse))
			.forEach(src, res) -> System.out.println(scr));
}
}

class Student {
String course, name, city;
public Student (String name, String course, String city) {
this.course = course; this.name = name; this.city = city;
}
public String toString() {
return course + ":" + name + ":" + city;
}
}


/*What is the result?
 * 
  A[Java EE: Helen:Houston] [Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
  B. Java EE Java ME 
  C. [Java ME: Jessy:Chicago, Java ME: Mark:Chicago] [Java EE: Helen:Houston] 
  D. A compilation error occurs
  
  */


// https://www.briefmenow.org/oracle/what-is-the-result-941/    Frage 62

// Answer :  (B or D)???   see comments!!!! unter www.briefmenow.org/oracle/what-is-the-result-941/ 