package fragen_41_60;

import java.util.Optional;

class Employee {
	Optional<Address> address;

	Employee(Optional<Address> address) {
		this.address = address;
	}

	public Optional<Address> getAddress() {
		return address;
	}
}

class Address {
	String city = "New York";
public String getCity()
	{
		return city;
	}

	public String toString() {
		return city;
	}
}

public class _57 {
	public static void main(String[] args) {
		Address address = null;
		Optional<Address> addrs1 = Optional.ofNullable(address);
		Employee e1 = new Employee(addrs1);
		String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
		System.out.println(eAddress); // im Code gibt es diese Zeile nicht!!!
	}
}


/*What is the result?
A. New York
B. City Not available
C. null 
D. A NoSuchElementException is thrown at run time*/

//https://www.briefmenow.org/oracle/what-is-the-result-945/   Frage 56
// Answer B
