package oop.abs.Pet;

public class MainClass {

	public static void main(String[] args) {
		
		Pet c1 = new Cat("나비", "코숏", 1);
		Pet d2 = new Dog("멍멍이","시바",2);
		
		c1.feed();
		c1.takeNap();
		
		d2.feed();
		d2.takeNap();
		

	}

}
