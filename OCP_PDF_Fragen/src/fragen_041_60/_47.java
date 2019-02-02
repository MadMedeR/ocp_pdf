package fragen_041_60;

public class _47 {
	static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
		if (Math.random() >-1) throw new Exception ("Try again");
	}

	public static void main(String[] args) {
		try {
			doStuff();
//		} catch (ArithmeticException | NumberFormatException | Exception  e) {	//26 original
		} catch (ArithmeticException | NumberFormatException e) {	//26 solved with C
			System.out.println (e.getMessage());					//27
		} catch (Exception e) {										//28
			System.out.println (e.getMessage());					//29
		}
	}
}

/*
	Which modification enables the code to print Try again?

	A.	Comment the lines 28, 29 and 30 
	B.	Replace line 26 with:
		} catch (Exception | ArithmeticException | NumberFormatException e) { 
	C.	Replace line 26 with:
		} catch (ArithmeticException | NumberFormatException e) { 
	D.	Replace line 27 with:
		throw e;

	Answer: C
	
	siehe auch web_72
	https://www.briefmenow.org/oracle/which-modification-enables-the-code-to-print-try-again/
*/