package basic.datatype;

public class TextualExample {

	public static void main(String[] args) {
		
		char c1 = 'A'; // 단일 문자(char)는 '' 문장(String)은 ""
		System.out.println(c1);
		
		char c2 = 88 ; // 숫자 입력시 ASCII로 인식
		System.out.println(c2);
		
		/*
		 *  문자열을 저장할 수 있는 데이터 타입 String
		 *  기본 테이터 타입은 아니지만 자주 쓰이기 때문에
		 *  기본 테이터 타입처럼 사용(사실은 객체 타입)
		 */
		
		String s1 = "my dream ";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
//		자바에서는 문자열의 덧셈 연산을 지원함
//		연산 결과로는 문자열을 연결해서 결합한 결과가 도출됨
		System.out.println(s1+s2);
		
//		문자열과 다른 데이터 타입 간의 연산 결과는 문자열
		System.out.println("________________________________");
		
		System.out.println(100+100); // int+int=int
		System.out.println("100"+"100"); // String+String=String
		System.out.println("100"+100); // String+int=String
		System.out.println(3.14+"pi"); // double+String=String
		
		int month = 2;
		int day = 20;
		
		System.out.println("오늘은 "+month+"월 "+day+"일 입니다");
		
		
		
		

	}

}
