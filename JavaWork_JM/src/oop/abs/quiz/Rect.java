package oop.abs.quiz;

public class Rect extends Shape {

	double side1;
	double side2;
	public Rect(String name, double side) {
		super(name);
		this.side1 = side; this.side2 = side;
	}

	public Rect(String name, double length, double height) {
		super(name);
		this.side1 = length;
		this.side2 = height;
	}

	@Override
	public double getArea() {
		return side1*side2;
	}

	@Override
	public void info() {
		if(side1==side2) {
			System.out.printf("%s의 변의 길이: %.2f 넒이: %.2f\n",getName(),side1,getArea());
		}else {
			System.out.printf("%s의 너비: %.2f 높이: %.2f 넒이: %.2f\n",getName(),side1,side2,getArea());
		}
	}

}
