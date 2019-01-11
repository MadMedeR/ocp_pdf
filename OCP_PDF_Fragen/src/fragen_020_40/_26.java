package fragen_020_40;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _26 {
	public static void main (String[] args) throws InterruptedException,
	ExecutionException
	{
	ExecutorService es = Executors.newFixedThreadPool(4);//line n1
	Future f1 = es.submit (new CallerThread("Call"));
	String str = f1.get().toString();
	System.out.println(str);
	}
}
class CallerThread implements Callable<String> {
String str;
public CallerThread(String s) {this.str=s;}
public String call() throws Exception {
return str.concat("Call");
}
}

/**
Which statement is true?
A. The program prints Call Call and terminates.
B. The program prints Call Call and does not terminate
C. A compilation error occurs at line n1.
D. An ExecutionException is thrown at run time.
**/

// Answer B