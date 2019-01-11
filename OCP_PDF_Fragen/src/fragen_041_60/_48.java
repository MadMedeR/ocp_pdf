package fragen_041_60;

public class _48 {
	public static void main(String[] args) {
		String[] colors = { "red", "blue", "green", "yellow", "maroon", "cyan" };

		// Which code fragment prints blue, cyan?

		for (String c : colors) {
			if (c.length() != 4) {
				continue;
			}
			System.out.println(c + " ");
		}

	}
}


//Answer A

// https://www.briefmenow.org/oracle/which-code-fragment-prints-blue-cyan/
// exam 1Z0-803 (v.3) frage 115