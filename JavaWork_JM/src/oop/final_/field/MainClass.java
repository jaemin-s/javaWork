package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
		
//		kim.nation = "japan"; //(x)
		
		final double PI = (Math.round(Math.PI*100))/100.0;
		System.out.println(PI);
		
	}

}
