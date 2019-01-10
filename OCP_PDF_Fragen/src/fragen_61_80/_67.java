package fragen_61_80;


public enum USCurrency {
	PENNY (1),
	NICKLE(5),
	DIME (10),
	QUARTER(25);
	
	private int value;
	
	public USCurrency(int value) {
		this.value = value;
	}
	
	public int getValue() {return value;}
} 

public class _67 { //originally Classname: Coin
	public static void main(String[] args) {
		USCurrency usCoin = new USCurrency.DIME; 
		System.out.println(usCoin.getValue());
	}
}

/*	
	Which two modifications enable the given code to compile? (Choose two.)
	
	A. Nest the USCurrency enumeration declaration within the Coin class.
	B. Make the USCurrency enumeration constructor private.
	C. Remove the new keyword from the instantion of usCoin.
	D. Make the getter method of value as a static method.
	E. Add the final keyword in the declaration of value.
	
	Answer: You have to do A,B and C!!!
*/