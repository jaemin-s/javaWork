package chap03;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart p1 = new MyCart(100000);
		p1.buy(new Computer());
		p1.buy(new Radio());
		p1.buy(new Tv());

		
		

	}

}
