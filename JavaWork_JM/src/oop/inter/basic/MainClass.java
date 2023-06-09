package oop.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체를 생성할 수 없는 추상적인 개념이다
//		Inter i1 = new Inter(); //(x) 
		
		System.out.println("상수: "+ Inter.n);
		Inter.staticMethod();
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.partentMethod();
		
/*
	다형성은 상속이 전제되어야 하는 것이 원칙이지만
	예외로 인터페이스와 클래스간의 구현 관계에서도 다형성 발생을 허용
	인터페이스 변수 = new 객체();
 */

		Inter it2 = new ImplClass1();
		it2.method1();
		it2.partentMethod();
		
		//연산자의 우선 순위
		//괄호() > 참조(.) > 단항 > 2항 > 3항 > 대입
		((ImplClass1)it2).method2();
		
/*
	인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
	정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요하다
	
	구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
	구현하는 클래스들끼리 서로 즉시 형 변환이 가능하다
 */
		
		((Inter2)it2).method2();
		
		Inter2 it3 = new ImplClass1();
		it3.method2();
		it3.partentMethod();
		((Inter)it2).method1();
		
		Inter it4 = new ImplClass2();
		Inter2 it5 = new ImplClass3();
		
		ParentInter[] inters = {it3, it2, it4, it5};
		
		
		
		
	}

}
