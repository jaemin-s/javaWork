package basic.begin;

public class VariableEample {

	public static void main(String[] args) {
		
		/*
		 변수(variable)
		 1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
		 2. 변수는 생성할 때 저장되는 데이터의 크기와 모양에 따라
		  적당한 데이터 타입을 선언해야 합니다.
		  ex) int: 정수, String: 문자열
		 3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		 4. 변수 내부의 값은 언제든지 변경이 가능합니다.
		 
		 변수의 선언: [자료형(데이터 타입)] [변수명];
		 */
		int age;
		
//		변수의 초기화: [변수명] = [값];
//		'=' equal이 아니라 assignment, 좌측의 영역에 우측의 값을 저장한다
		age = 4;
		System.out.println(age);
		
//		변수는 선언과 초기화를 동시에 할 수 있습니다.
		int score = 50;
//		int score = 60; (x) 동일한 이름의 변수는 한번만 선언가능
		score = 60;
//		변수는 하나의 값만대입할 수 있어서 기존값은 소멸되고 새로은 값이 할당
		System.out.println(score);
		
//		변수에는 다른 변수의 값도 저장이 가능합니다.
		int myScore = score;
		System.out.println(myScore);
		
//		변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
//		int count = "일이삼사"; (x)
//		int count = 3.14; (x)
		
//		변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면
//		중복 선언할 수 없습니다.
		
		String name = "철수";
		System.out.println(name);
//		int name = 324; (x)
		
//		선언 및 초기화하지 않은 변수는 사용이 불가능합니다.
//		int result = myScore + sum; (x) , 선언되지 않은 변수
//		int result;
//		System.out.println(result); (x) , 초기화되지 않은 변수
		
		
		
		
		
	}

}
