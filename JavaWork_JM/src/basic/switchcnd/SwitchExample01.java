package basic.switchcnd;

import java.util.Scanner;

public class SwitchExample01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성별(M/F): \n>>");
		String gender = scan.next();
		
//		switch 키워드 뒤에 나오는 괄호는 논리형 조건식이 아닌 변수나,
//		변수의 연산식을 적어야 하고, 타입은 정수와 문자열만 가능
		
		switch(gender) {
		
//		switch 괄호 안에 지정한 기준값에 따라 만족하는 case문을 순서대로 탐색
//		적합한 case가 존재하는경우 case에 종속된 문장을 실행
//		따로 조치가 없으면 나머지 케이스를 연속적으로 실행
		
		
		case "m": case "ㅡ": case "M": 
			//break가 없으면 흘러내리는걸 활용하여 여러조건을 작성
			System.out.println("man");
			break; // 이 지점에서 switch문을 종료
			
		case "F":
			System.out.println("female");
			break;
		
		default:
//			case를 설정하지 않은 나머지 값들
			System.out.println("잘못된 입력입니다.");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
