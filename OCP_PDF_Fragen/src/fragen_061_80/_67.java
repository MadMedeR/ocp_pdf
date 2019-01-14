package fragen_061_80;


/*public*/ enum USCurrency { //have to be in different files
	PENNY (1),
	NICKLE(5),
	DIME (10),
	QUARTER(25);
	
	private int value;
	
	
	//original line: public USCurrency(int value) {
	private USCurrency(int value) { // already solved with Answer B
		this.value = value;
	}
	
	public int getValue() {return value;}
} 

public class _67 { //originally Classname: Coin
	public static void main(String[] args) {
		//original line: USCurrency usCoin = new USCurrency.DIME; 
		USCurrency usCoin = USCurrency.DIME;  // already solved with Answer C
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
	
	Answer: A,B and C if in the same file
			B and C if there are two files 
	
	siehe auch web_59
	http://www.briefmenow.org/oracle/which-two-modifications-enable-the-given-code-to-compile/
	
*/