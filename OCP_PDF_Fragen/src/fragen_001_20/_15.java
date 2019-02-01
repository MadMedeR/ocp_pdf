package fragen_001_20;

interface Rideable { Car getCar(String name); }

class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}
}

public class _15 {
	public static void main(String[] args) {
		//Solved with Answer C: (Only one correct):
		Rideable rider = Car::new; // same as: Rideable rider = (s) -> new Car(s);
		Car vehicle = rider.getCar("MyCar");
	}
}

/*
	Which code fragment creates an instance of Car? 

	A.  Car auto = Car ("MyCar"): : new; 
	B.  Car auto = Car : : new; 
		Car vehicle = auto : : getCar("MyCar"); 
	C.  Rideable rider = Car : : new; 
		Car vehicle = rider.getCar("MyCar"); 
	D.  Car vehicle = Rideable : : new : : getCar("MyCar"); 

	Answer: only C
	
	siehe auch Frage 43
	https://www.briefmenow.org/oracle/which-code-fragment-creates-an-instance-of-car/
	
	Explanation:
	The method of the Instance Rideable: Car getCar(String name)
	and the Constructor of the class Car: new Car(String name) are doing the same.
	That's why you can use this Constructor as a function of the lambda expression.
*/