package oop.static_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Count cnt1 = new Count();
		cnt1.a += 5;
		cnt1.b += 5;
		Count.b += 5;
		System.out.println("인스턴스 변수 cnt1.a: "+cnt1.a);
		System.out.println("정적 변수 cnt1.b: "+Count.b);

		System.out.println("---------------------------");
		
		Count cnt2 = new Count();
		cnt2.a += 7;
		Count.b += 7;
		System.out.println("인스턴스 변수 cnt2.a: "+cnt2.a);
		System.out.println("정적 변수 cnt2.b: "+Count.b);
		
		System.out.println("---------------------------");
		
		Count cnt3 = new Count();
		cnt3.a += 8;
		Count.b += 8;
		System.out.println("인스턴스 변수 cnt3.a: "+cnt3.a);
		System.out.println("정적 변수 cnt3.b: "+Count.b);
		
/*
	static이 붙은 데이터는 그 static 데이터가 선언된 클래스 이름으로 바로 참조할 수 있다
	
	일반 멤버변수와 혼동할 가능성이 있기 때문에 주소값으로 접근하지 않는다
 */
		
		
	}

}
