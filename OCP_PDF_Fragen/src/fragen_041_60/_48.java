package fragen_041_60;

public class _48 {
	public static void main(String[] args) {
		String[] colors = { "red", "blue", "green", "yellow", "maroon", "cyan" };

		//already solved with A:
		for (String c:colors) {
			if (c.length() != 4) {
				continue;
			}
			System.out.println(c + ", ");
		}
	}
}

/*
	Which code fragment prints blue, cyan?
	
	A.	for (String c:colors) {
			if (c.length() != 4) {
				continue;
			}
			System.out.println(c + ", ");
		}
	B.	for (String c:colors[]) {
			if (c.length() <= 4) {
				continue;
			}
			System.out.println(c + ", ");
		}
	C.	for (String c:String[] colors) {
			if (c.length() >= 3) {
				continue;
			}
			System.out.println(c + ", ");
		}
	D.	for (String c:colors) {
			if (c.length() != 4) {
				System.out.println(c + ", ");
				continue;
			}
		}
	
	Answer: A
	
	siehe auch web_115
	https://www.briefmenow.org/oracle/which-code-fragment-prints-blue-cyan/
	exam 1Z0-803 (v.3)
 */