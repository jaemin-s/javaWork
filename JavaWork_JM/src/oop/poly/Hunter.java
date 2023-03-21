package oop.poly;

public class Hunter extends Player{
	
	String pet;

	Hunter(String name){
		super(name);
		pet = "거북이";
	}
	
	Hunter(String name,String pet){
		super(name);
		this.pet = pet;
	}
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("펫: "+pet);
	}
	
}
