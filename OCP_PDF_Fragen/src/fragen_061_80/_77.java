package fragen_061_80;

@SuppressWarnings("serial")
class FuelNotAvailException extends Exception {}

class Vehicle {
//	void ride() throws FuelNotAvailException { //line n1 //original line
	protected void ride() throws Exception { //already solved with Answer B
		System.out.println("Happy Journey!");
	}
}

class SolarVehicle extends Vehicle {
	public void ride() throws Exception { //line n2
		super.ride();
	}
}

public class _77 {
	public static void main (String[] args) throws FuelNotAvailException, Exception {
		Vehicle v = new SolarVehicle ();
		v.ride();
	}
}

/*
	Which modification enables the code fragment to print Happy Journey!?
	
	A. Replace line n1 with: 
		public void ride() throws FuelNotAvailException { 
	B. Replace line n1 with: 
		protected void ride() throws Exception { 
	C. Replace line n2 with: 
		void ride() throws Exception { 
	D. Replace line n2 with: 
		private void ride() throws FuelNotAvailException {
	
	Answer: B
*/