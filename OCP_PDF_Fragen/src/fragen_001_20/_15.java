package fragen_001_20;

public class _15 {
	public static void main(String[] args) {
		//A. Car auto = Car(“MyCar”)::new;
		//B. Car auto = Car::new; Car vehicle = auto::getCar(“MyCar”);
		//C. (Only one correct):
		Rideable rider = Car::new; 
		Car vehicle = rider.getCar("MyCar");
		//D. Car vehicle = Rideable::new::getCar(“MyCar”);
		System.out.println(rider.toString());
		}
}

interface Rideable {
	Car getCar(String name);
}

class Car {
	private String name;

	public Car(String name) {
		this.name = name;
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

*/

//https://www.briefmenow.org/oracle/which-code-fragment-creates-an-instance-of-car/
//Frage 43

//Answer C
