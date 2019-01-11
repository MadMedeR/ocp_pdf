package web_61_85;

public class web_76 {
public static void main(String[] args) {
/*A*/	Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100);
/*B*/	Foo<String, String> pair = Foo.<String>twice ("Hello World!"); 
/*C*/	Foo<?, ?> percentage = new Foo <> (97, 32);
/*D*/	Foo<String, String> grade = new Foo <> ("John","A");

	System.out.println(mark.getKey());
	System.out.println(pair.getKey());
	System.out.println(percentage.getKey());
	System.out.println(grade.getKey());
}
}



class Foo<K, V> {
	private K key;
	private V value;
	public Foo (K key, V value) {
		this.key = key;
		this.value = value;
	}
	public static <T> Foo<T, T> twice (T value) {
		return new Foo<T, T> (value, value);
	}
	public K getKey () {return key;}
	public V getValue () {return value;}
}

// Wann Korigiere brackets alles gehts dann es gibt keine gute Antwort
// Wenn korigire nur Brackets in Klasse und nicht in main 
// A und C kompiliert nicht

