package fragen_20_40;

import java.util.Set;
import java.util.TreeSet;

public class _28 {
	public static void main(String[] args) {
		Set<Vehicle> vehicles = new TreeSet <> ();
		vehicles.add(new Vehicle (10123, "Ford"));
		vehicles.add(new Vehicle (10124, "BMW"));
		System.out.println(vehicles);
	}
}
class Vehicle{
	int vno;
	String name;
	public Vehicle (int vno, String name) {
	this.vno = vno;
	this.name = name;
	}
	public String toString () {
	return vno + ":" + name;
	}
	}
/**
What is the result?
A. 10123 Ford
10124 BMW
B. 10124 BMW
10123 Ford
C. A compilation error occurs
D. A ClassCastException is thrown at run time


Answer D ClassCastException because Vehicle is not Comparable
and TreeSet have to compare to sort all entries