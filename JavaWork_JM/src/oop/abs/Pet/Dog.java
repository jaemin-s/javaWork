package oop.abs.Pet;

public class Dog extends Pet {

	public Dog(String name, String kind, int age) {
		super(name, kind, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void feed() {
		System.out.println("개가 사료를 먹습니다");
	}

	@Override
	public void takeNap() {
		System.out.println("개가 마당아서 낮잠을 잡니다");
	}

}
