package fragen_001_20;

public class _16 {}

final class IceCream {
	public void prepare() {}
}

class Cake {
	public final void bake(int min, int temp) {}
	public void mix() {}
}

class Shop {
	private Cake c = new Cake();
	private final double discount = 0.25;
	public void makeReady() { c.bake(10, 120); }
}

class Bread extends Cake {
	public void bake(int minutes, int temperature) {}
	public void addToppings() {	}
}

 /*
	Which statement is true?
	
	A. A compilation error occurs in IceCream.
	B. A compilation error occurs in Cake.
	C. A compilation error occurs in Shop.
	D. A compilation error occurs in Bread.
	E. All classes compile successfully.
	
	Answer: D (Cannot override the final method from Cake)
	
	siehe auch web_39
	https://www.briefmenow.org/oracle/which-statement-is-true-305/
*/ 