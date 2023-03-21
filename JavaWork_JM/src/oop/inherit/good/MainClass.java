package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		Mage m1 = new Mage();
		Hunter h1 = new Hunter();
		
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		
		m1.level = 1;
		m1.atk = 1;
		m1.hp = 30;
		m1.name = "마법사1";
		m1.mana = 100;
		
		h1.level = 1;
		h1.atk = 2;
		h1.hp = 40;
		h1.name = "사냥꾼1";
		h1.pet = "거북이";
		
		w1.characterInfo();
		m1.characterInfo();
		h1.characterInfo();
		
	}

}
