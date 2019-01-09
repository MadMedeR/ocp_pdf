package fragen_1_20;
import java.util.List;
import java.util.ArrayList;

public class _002 {
	public static void main(String[] args) {
		List<Alpha> strs = new ArrayList<>();
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		for (Alpha t : strs) {
			System.out.println(t.doStuff("Java"));
		}
		String a = "avbbbb";
	
		System.out.println(a.substring(2,4));
	}
}

class Alpha {
	public String doStuff(String msg) {
		return msg;
	}
}
class Beta extends Alpha {
	public String doStuff(String msg) {
		return msg.replace('a', 'e');
	}
}
class Gamma extends Beta{
	public String doStuff(String msg) {
		return msg.substring(2);
	}
}


//What is result? 
//		Answer B  Java Jeve va