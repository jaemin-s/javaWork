package oop.abs.quiz;

public class Circle extends Shape {
	
	double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.round(radius*radius*Math.PI*100)/100.0 ;
	}

	@Override
	public void info() {
		System.out.printf("%s의 반지름: %.2f 넒이: %.2f\n",getName(),radius,getArea());
	}

}
