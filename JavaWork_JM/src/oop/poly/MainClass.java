package oop.poly;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사01");
		Warrior w2 = new Warrior("전사02");
		Mage m1 = new Mage("마법사01");
		Hunter h1 = new Hunter("사냥꾼01");
		
		w1.rush(w2);
		w1.rush(w1);
		w1.rush(m1);
		w1.rush(h1);
	}

}
