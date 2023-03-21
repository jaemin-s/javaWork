package oop.this_super;

public class Hunter extends Player{
	
	String pet;

	Hunter(String name,String pet){
		super(name);
		this.pet=pet;
	}
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("펫: "+pet);
	}
	
}
