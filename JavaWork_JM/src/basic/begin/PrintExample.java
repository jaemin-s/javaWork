package basic.begin;

public class PrintExample {

	public static void main(String[] args) {
		
//		자바의 표준 출력 형식은 크게 3가지
//		1. 개행[줄바꿈]을 포함하지 않는 print() 
//		2. 자동으로 개행을 포함해 주는 println()
		
		System.out.print("Hi");
		System.out.print("Hi");
		System.out.println("Hi");
		System.out.print("Hi");
		
//		3. 형식 지정 표준 출력 함수 printf()
//		서식 문자를 이용해서 문자열을 완성시킨 후,
//		서식 문자에 들어갈 값을 지정해서 출력하는 방식
		
//		포맷팅 서식 문자 종류
//		%d : 부호가 있는 정수 데이터 (decimal)
//		%f : 실수 데이터 (floation point)
//		%s : 문자열 (String)
		
//		탈출 코드 (escape code)
//		- 반드시 따옴표 내에 위치해야 함
//		- 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호
//		\n : 줄 개행 명령
//		\t : 가로 공백 4칸
	
		int month = 12, day = 25;
		String anni = "크리스마스";
		System.out.println(month+"월"+day+"일은"+anni+"입니다");
		System.out.printf("%d월 %d일은 %s입니다.", month,day,anni);
		
//		실수를 표현하는 서식문자 %f
//		%.[자리수 지정 숫자]f >> 원하는 자리수까지 표현
//		%를 출력하고 싶을 때는 %%
		double rate = 64.126;
		System.out.printf("\n\t합격률은 %.3f%%입니다\n", rate);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
