package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.name = "전사1";
		p1.characterInfo();
		
		System.out.println();
		Player p2 = new Player("전사2");
		p2.characterInfo();
		
		System.out.println();
		Player p3 = new Player("전사3",100);
		p3.characterInfo();
		
		System.out.println();
		p3.attack(p2);
		p1.attack(p2);
		p2.attack(p2);
		
		System.out.println();
		Warrior w1 = new Warrior("전사맨");
		
		w1.characterInfo();
		
		System.out.println();
		Mage m1 = new Mage("법사1");
		m1.characterInfo();
		
		System.out.println();
		Hunter h1 = new Hunter("사냥꾼1", "거북이");
		h1.characterInfo();
	}

}
