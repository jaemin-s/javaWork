package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A{
	
//	A a1 = new A(23); //protected (x)
//	A a2 = new A(3.14); //default (x)

	public C() {
		/*
		 	protected 제한자는 패키지가 다른 경우
		 	두 클래스 사이에 상속 관계가 있다면
		 	super 키워드를 통해 참조를 허용
		 */
		super(34);
//		super(3.15); //default (x)
		super.x = 1;
//		super.y = 2; (x)
		super.method1();
//		super.method2(); (x)
	}
}
