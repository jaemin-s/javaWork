package oop.constructor;


public class BreadMain {

	public static void main(String[] args) {
		
/*
	객체를 생성하지 않았을 때의 예시를 보고
	빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요
	클래스 이름은 Bread로 통일하겠습니다
	
	BreadMain에서 똑같이 피자빵, 초코케이크의 정보를 호출해 보세요(생성자는 마음대로)
	
 */
		
		Bread redBeadBread =new Bread("단팥빵",1000,"밀가루","팥");
		redBeadBread.info();
		System.out.println();
		
		Bread pizzaBread = new Bread("피자빵",2000,"밀가루","치즈","햄");
		pizzaBread.info();
		System.out.println();
		
		Bread coffee = new Bread("커피", 4000,"커피콩");
		coffee.info();
		
	}

}
