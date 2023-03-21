package oop.obj_arr;

public class MainClass {

	public static void main(String[] args) {
		
//		Person kim = new Person("홍길동", 32, "남자");
//		Person lee = new Person("이영희", 33, "여자");
//		Person park = new Person("박철수", 34, "남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
//		Person[] people = new Person[3];
//		people[0] = new Person("김철수", 32,"남자");
		
		Person[] people = {
				new Person("홍길동", 32, "남자"),
				new Person("이영희", 33, "여자"),
				new Person("박철수", 34, "남자")
		};
		
		for(Person a : people) {
			a.personInfo();
		}
		
		
		
		
	}

}
