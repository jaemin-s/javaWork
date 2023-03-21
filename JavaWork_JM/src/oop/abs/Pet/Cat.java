package oop.abs.Pet;

public class Cat extends Pet {

	public Cat(String name, String kind, int age) {
		super(name, kind, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void feed() {
		System.out.println("고양이가 생선을 먹습니다");
	}

	@Override
	public void takeNap() {
		System.out.println("고양이가 낮잠을 잡니다");
	}

}
