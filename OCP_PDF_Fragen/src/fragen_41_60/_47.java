package fragen_41_60;

/*
 Given the code fragments:
4. void doStuff() throws ArithmeticException, NumberFormatException, Exception {
5. if (Math.random() >-1 throw new Exception ("Try again");
6. }
and
24. try {
25. doStuff ( ):
26. } catch (ArithmeticException | NumberFormatException | Exception e) {
27. System.out.println (e.getMessage()); }
28. catch (Exception e) {
29. System.out.println (e.getMessage()); }
30. }

*/

/*
  Which modification enables the code to print Try again?
  
A. Comment the lines 28, 29 and 30 
B. Replace line 26 with: } catch (Exception | ArithmeticException | NumberFormatException e) { 
C. Replace line 26 with: } catch (ArithmeticException | NumberFormatException e) { 
D. Replace line 27 with: throw e;*/

public class _47 {
	static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
		 if (Math.random() >-1) throw new Exception ("Try again");
		}
public static void main(String[] args) {
	
		
	 try {
		 doStuff ( );
		 } catch (ArithmeticException | NumberFormatException e) {  //26
		System.out.println (e.getMessage()); }
		 catch (Exception e) {
		 System.out.println (e.getMessage()); }
		 }
}


// https://www.briefmenow.org/oracle/which-modification-enables-the-code-to-print-try-again/  Frage 72 
//Answer C