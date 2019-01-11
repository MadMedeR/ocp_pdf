package fragen_20_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {
	int id;
	int price;
	
	public Product (int id, int price) {
		this.id = id;
		this.price = price;
	}
	
	public String toString() { return id + ":" + price; }
}

public class _40 {
	public static void main(String[] args) {
		
		List<String> slist = Arrays.asList("Guten","Morgen");
		
		slist.remove("Morgen");
		//slist.add("Max");
		
		System.out.println(slist);
		
		
		
//		List<Product> products = Arrays.asList(
//			new Product(1, 10), 
//			new Product (2, 30),
//			new Product (2, 30)
//		);
//		products.add(new Product (4, 0));
//		
//		
//		Product p = products.stream().reduce(new Product (4, 0), (p1, p2) -> {
//						p1.price += p2.price;
//						return new Product (p1.id, p1.price);
//					});
//		products.add(p);
//		products.stream().parallel()
//				.reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
//				.ifPresent(System.out::println);
	}
}

/*
	What is the result?
	
	A.	2 : 30
	B.	4 : 0
	C.	4 : 60
	D.	4 : 60
		2 : 30
		3 : 20
		1 : 10
	E.	The program prints nothing

	Answer: D
*/